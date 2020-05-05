import {Cd} from "./Cd";

export class SpecialEditionCd extends Cd{
    constructor(private _is3D: boolean, thecdID: string, thecdTitle: string, thegenre: string) {
        super(thecdID,thecdTitle,thegenre);
    }
    get is3D() : boolean {
        return this._is3D;
    }

    set is3D(value : boolean) {
        this._is3D = value;
    }


    getDetails(): string {
        return super.getDetails()+`,is3D=${this._is3D}`;
        
    }


}
