import {Department} from "./Department"
export class Employee{

    constructor(private _employeeId : number,private _firstName : string,private _LastName : string,private _email : string,private _department : Department) {

    }
    get employeeId() : number {
        return this._employeeId;
    }

    set employeeId(value : number) {
        this._employeeId = value;
    }

    get firstName() : string {
        return this._firstName;
    }

    set firstName(value : string) {
        this._firstName = value;
    }

    get LastName() : string {
        return this._LastName;
    }

    set LastName(value : string) {
        this._LastName = value;
    }

    get email() : string {
        return this._email;
    }

    set email(value : string) {
        this._email = value;
    }

    get department() : Department {
        return this._department;
    }

    set department(value : Department) {
        this._department = value;
    }


}
