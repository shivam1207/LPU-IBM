"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Likes = /** @class */ (function () {
    function Likes(_isLiked, _LikeCount) {
        var _this = this;
        this._isLiked = _isLiked;
        this._LikeCount = _LikeCount;
        //public SetLiked() {
        this.SetLiked = function () {
            if (_this._isLiked == false) {
                _this._LikeCount++;
                _this._isLiked = true;
                console.log(_this._isLiked);
                console.log(_this._LikeCount);
            }
            else {
                _this._LikeCount--;
                _this._isLiked = false;
                console.log(_this._isLiked);
                console.log(_this._LikeCount);
            }
        };
    }
    Object.defineProperty(Likes.prototype, "isLiked", {
        get: function () {
            return this._isLiked;
        },
        set: function (value) {
            this._isLiked = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Likes.prototype, "LikeCount", {
        get: function () {
            return this._LikeCount;
        },
        set: function (value) {
            this._LikeCount = value;
        },
        enumerable: true,
        configurable: true
    });
    Likes.prototype.getInfo = function () {
        return "isLiked=" + this._isLiked + ", LikeCount=" + this._LikeCount;
    };
    return Likes;
}());
exports.Likes = Likes;
