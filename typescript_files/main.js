"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Department_1 = require("./Department");
var Employee_1 = require("./Employee");
var myDepartment = new Department_1.Department(1, "IT");
var myEmployee = new Employee_1.Employee(101, "Shivam", "Gumber", "s@g.com", myDepartment);
console.log(myEmployee.employeeId);
console.log(myEmployee.firstName);
console.log(myEmployee.LastName);
console.log(myEmployee.department.departmantId);
console.log(myEmployee.department.departmentName);
