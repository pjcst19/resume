<%-- 
    Document   : anotherRivetsTest
    Created on : Nov 26, 2014, 6:52:10 PM
    Author     : Mandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script src="js/rivets.min.js"></script>
        <script src="js/index.js"></script>
        <script src="js/rivetsConf.js"></script>

        <script>

            ///====== Skip This Part, this is configuration =============


            rivets.config.handler = function (context, ev, binding) {
                if (binding.model instanceof binding.model.____) {
                    return this.call(binding.model, ev, context); // Event Target !!
                } else {
                    return this.call(context, ev, binding.view.models);
                }
            };

            rivets.binders.input = {
                publishes: true,
                routine: rivets.binders.value.routine,
                bind: function (el) {
                    el.addEventListener('input', this.publish);
                },
                unbind: function (el) {
                    el.removeEventListener('input', this.publish);
                }
            };

//================ Acutal Code Start from Here =============
            rivets.formatters.rupee = function (val) {
                return "₹ " + val;
            };

            var Person = function () {
                this.name = "Narendra",
                        this.job = {};
                this.job.task = "Engineer";
                this.____ = Person;
            };

            Person.prototype = {
                show: function () {
                    this.display();
                },
                change: function () {
                    this.name = "Deepak";
                    this.job.task = "Playing";
                },
                display: function () {
                    alert(JSON.stringify(this));
                },
                total: function () {
                    return window.parseInt(this.price) * window.parseInt(this.quantity);
                }
            };

            var person = new Person();
            rivets.bind(document.querySelector("#asdasd"), {
                scope: person
            });
        </script>
    </head>
    <body>
        <div id="asdasd">
            <input rv-value="showbutton" type="checkbox">
            <label>Hide button</label>
            <div rv-hide="showbutton">
                <button rv-on-click="scope.change">Change Model Data</button>
                <button rv-on-click="scope.show">Show Model Data</button>
            </div>
            <h3>
                <span>Name : { scope.name } & Task: { scope.job.task}</span>
            </h3>

            <input rv-input="scope.name">
            <input rv-input="scope.job.task">
            <p><b>Computed Properties !</b>
            </p>
            <label>Price</label>
            <input rv-input="scope.price ">
            <label>Quantity</label>
            <input rv-input="scope.quantity">
            <label>Total =</label>	<span rv-text="scope.total < quantity price | rupee"></span>

        </div>
    </body>
</html>
