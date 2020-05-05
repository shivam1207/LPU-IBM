export class Department{
    constructor(private _departmantId : number,private _departmentName : string) {
    }

    get departmantId() : number {
        return this._departmantId;
    }

    set departmantId(value : number) {
        this._departmantId = value;
    }

    get departmentName() : string {
        return this._departmentName;
    }

    set departmentName(value : string) {
        this._departmentName = value;
    }
}
