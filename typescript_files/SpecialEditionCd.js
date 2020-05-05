"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Cd_1 = require("./Cd");
var SpecialEditionCd = /** @class */ (function (_super) {
    __extends(SpecialEditionCd, _super);
    function SpecialEditionCd(_is3D, thecdID, thecdTitle, thegenre) {
        var _this = _super.call(this, thecdID, thecdTitle, thegenre) || this;
        _this._is3D = _is3D;
        return _this;
    }
    Object.defineProperty(SpecialEditionCd.prototype, "is3D", {
        get: function () {
            return this._is3D;
        },
        set: function (value) {
            this._is3D = value;
        },
        enumerable: true,
        configurable: true
    });
    SpecialEditionCd.prototype.getDetails = function () {
        return _super.prototype.getDetails.call(this) + (",is3D=" + this._is3D);
    };
    return SpecialEditionCd;
}(Cd_1.Cd));
exports.SpecialEditionCd = SpecialEditionCd;
