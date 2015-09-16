/* global Todo */
/* global Router */
/* global $ */
/* global Todos */
Todos = new Meteor.Collection('todos');
// Routes
Todo = function (){
  this.complete = false;
};
Todo.prototype.Complete = function(){
  this.complete = true;
};
Todo.prototype.InComplete = function(){
  if(this.complete){
    this.complete = false;
  }
};
Router
  .configure({
    layoutTemplate: 'main'
  });
Router.route('/', { template: 'todos' });
Router.route('register', {
  path: '/register',
  title: 'register',
  onBeforeAction: function (req, res, next) {
    // in here next() is equivalent to this.next();
    document.title="register";
    next();
  }
}, { where: 'server' });

/* global Meteor */
if (Meteor.isClient) {
  // client code goes here
  /* global Template */
  // todo template helpers and events
  Template.todos.helpers({
    todo: function () {
      return Todos.find({}, { sort: { createdAt: -1 } });
    }
  });
  // 'todoItem' template helpers and events
  Template.toDoItem.helpers({
    checked: function () {
      return this.completed ? "checked" : "";
    }
  });
  
  Template.toDoItem.events({
    'click .delete-todo': function (event) {
      event.preventDefault();
      var todo_id = this._id;
      var confirm = window.confirm("Delete this todo Item?");
      if (confirm)
        Todos.remove({ _id: todo_id });
    },
    'keyup [name=todoItem]': function (event) {
      if (event.which == 13 || event.which == 27) {
        $(event.target).blur();
      }
      else {
        var todo_id = this._id;
        var todo_name = $(event.target).val();
        Todos.update({ _id: todo_id }, { $set: { name: todo_name } });
      }
    },
    'change [type=checkbox]': function (event) {
      var todo_id = this._id,
        isCompleted = $(event.target).is(':checked');
      Todos.update({ _id: todo_id }, { $set: { completed: isCompleted } });
    }
  });
  // add todo template helpers and events
  Template.addToDo.events({
    'submit form': function (event) {
      event.preventDefault();
      var todo = {
        name: $('input[name=toDoName]').val(),
        completed: false,
        createdAt: new Date()
      };
      Todos.insert(todo);
    }
  });
  // todo Item completed information helpers and events
  Template.todosCount.helpers({
    totalTodos: function () {
      return Todos.find().count();
    },
    completedTodos: function () {
      return Todos.find({ completed: true }).count();
    }
  });
}

if (Meteor.isServer) {
  Meteor.startup(function () {
    // code to run on server at startup
  });
}
