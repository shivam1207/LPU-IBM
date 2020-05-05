import {Cd} from "./Cd";

export class InternationalCD extends Cd{

    constructor(private _language: string, thecdID: string, thecdTitle: string, thegenre: string) {
        super(thecdID,thecdTitle,thegenre);
    }
    get language() : string {
        return this._language;
    }

    set language(value : string) {
        this._language = value;
    }


    getDetails(): string {
        return super.getDetails()+`,language=${this._language}`;

    }


}