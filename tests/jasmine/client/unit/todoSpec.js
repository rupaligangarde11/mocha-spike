/* global describe */
/* global expect */
/* global it */
/* global beforeEach */
/* globals Player: false, Song: false */

describe('Todo', function() {
  var todo ;

  beforeEach(function() {
    todo = new Todo();
  });

  it('should be able to complete a task', function() {
    todo.Complete();
    expect(todo.complete).toEqual(true);

  });
  
  it('should be able to incomplete a task', function(){
    expect(todo.complete).toBe(false);
    todo.Complete();
    expect(todo.complete).toEqual(true);
    todo.InComplete();
    expect(todo.complete).toEqual(false);
  })
});
