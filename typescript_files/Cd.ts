export class Cd{
    constructor(private _cdID: string, private _cdTitle: string, private _genre: string) {
    }
    get cdID() : string {
        return this._cdID;
    }

    set cdID(value : string) {
        this._cdID = value;
    }

    get cdTitle() : string {
        return this._cdTitle;
    }

    set cdTitle(value : string) {
        this._cdTitle = value;
    }

    get genre() : string {
        return this._genre;
    }

    set genre(value : string) {
        this._genre = value;
    }
    getDetails(): string {
        return `cdID=${this._cdID}, cdTitle=${this._cdTitle}, genre=${this._genre}`;
    }


}
