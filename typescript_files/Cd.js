"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Cd = /** @class */ (function () {
    function Cd(_cdID, _cdTitle, _genre) {
        this._cdID = _cdID;
        this._cdTitle = _cdTitle;
        this._genre = _genre;
    }
    Object.defineProperty(Cd.prototype, "cdID", {
        get: function () {
            return this._cdID;
        },
        set: function (value) {
            this._cdID = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Cd.prototype, "cdTitle", {
        get: function () {
            return this._cdTitle;
        },
        set: function (value) {
            this._cdTitle = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Cd.prototype, "genre", {
        get: function () {
            return this._genre;
        },
        set: function (value) {
            this._genre = value;
        },
        enumerable: true,
        configurable: true
    });
    Cd.prototype.getDetails = function () {
        return "cdID=" + this._cdID + ", cdTitle=" + this._cdTitle + ", genre=" + this._genre;
    };
    return Cd;
}());
exports.Cd = Cd;
