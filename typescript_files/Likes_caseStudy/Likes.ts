
export class Likes{

    constructor(private _isLiked : boolean,private _LikeCount :number) {

    }
    get isLiked() : boolean {
        return this._isLiked;
    }

    set isLiked(value : boolean) {
        this._isLiked = value;
    }

    get LikeCount() : number {
        return this._LikeCount;
    }

    set LikeCount(value : number) {
        this._LikeCount = value;
    }
    getInfo(): string {
        return `isLiked=${this._isLiked}, LikeCount=${this._LikeCount}`;
    }

    //public SetLiked() {

    public SetLiked=()=>{

        if (this._isLiked == false) {
            this._LikeCount++;
            this._isLiked = true;
            console.log(this._isLiked);
            console.log(this._LikeCount);
        } else {
            this._LikeCount--;
            this._isLiked = false;
            console.log(this._isLiked);
            console.log(this._LikeCount);

        }
    }

}
