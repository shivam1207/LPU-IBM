"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee = /** @class */ (function () {
    function Employee(_employeeId, _firstName, _LastName, _email, _department) {
        this._employeeId = _employeeId;
        this._firstName = _firstName;
        this._LastName = _LastName;
        this._email = _email;
        this._department = _department;
    }
    Object.defineProperty(Employee.prototype, "employeeId", {
        get: function () {
            return this._employeeId;
        },
        set: function (value) {
            this._employeeId = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "LastName", {
        get: function () {
            return this._LastName;
        },
        set: function (value) {
            this._LastName = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "email", {
        get: function () {
            return this._email;
        },
        set: function (value) {
            this._email = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "department", {
        get: function () {
            return this._department;
        },
        set: function (value) {
            this._department = value;
        },
        enumerable: true,
        configurable: true
    });
    return Employee;
}());
exports.Employee = Employee;
