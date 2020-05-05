"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Department = /** @class */ (function () {
    function Department(_departmantId, _departmentName) {
        this._departmantId = _departmantId;
        this._departmentName = _departmentName;
    }
    Object.defineProperty(Department.prototype, "departmantId", {
        get: function () {
            return this._departmantId;
        },
        set: function (value) {
            this._departmantId = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Department.prototype, "departmentName", {
        get: function () {
            return this._departmentName;
        },
        set: function (value) {
            this._departmentName = value;
        },
        enumerable: true,
        configurable: true
    });
    return Department;
}());
exports.Department = Department;
