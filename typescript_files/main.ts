import {Department} from "./Department"
import {Employee} from "./Employee"
let myDepartment = new Department(1,"IT");
let myEmployee= new Employee(101,"Shivam","Gumber","s@g.com",myDepartment);
console.log(myEmployee.employeeId);
console.log(myEmployee.firstName);
console.log(myEmployee.LastName);
console.log(myEmployee.department.departmantId);
console.log(myEmployee.department.departmentName);