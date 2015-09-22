  MochaWeb.testOnly(function(){
    var mindMapService = new MindMapService();
  describe("sayHello", function () {
    it("should respect equality", function(){
      var name ='bla',

      result = mindMapService.sayHello(name);
      chai.assert.equal(result,"Hello "+name);
    });
  });
});

MochaWeb.testOnly(function(){
  describe('SessionCounter', function () {
    describe("getCount", function () {
      it('should return count intial value', function () {
        var result = SessionCounter.getCount();
        chai.assert.equal(result,0);
      });
    });
  });
});

MochaWeb.testOnly(function(){
  describe("incrementCount", function () {
      it('should return count incremented by 1', function () {
        var initial = SessionCounter.getCount();
        SessionCounter.incrementCount();
        var result = SessionCounter.getCount();
        chai.assert.equal(result,initial +1);

      });
    });

})
