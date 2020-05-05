"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer1 = /** @class */ (function () {
    function Customer1(firstName, lastName) {
        this._firstName = firstName;
        this._lastName = lastName;
    }
    Object.defineProperty(Customer1.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer1.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: true,
        configurable: true
    });
    return Customer1;
}());
exports.Customer1 = Customer1;
var myCustomer = new Customer1("Martin", "Dixon");
myCustomer.firstName = "Susan";
myCustomer.lastName = "Public";
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
