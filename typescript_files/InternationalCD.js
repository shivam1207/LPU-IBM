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
var InternationalCD = /** @class */ (function (_super) {
    __extends(InternationalCD, _super);
    function InternationalCD(_language, thecdID, thecdTitle, thegenre) {
        var _this = _super.call(this, thecdID, thecdTitle, thegenre) || this;
        _this._language = _language;
        return _this;
    }
    Object.defineProperty(InternationalCD.prototype, "language", {
        get: function () {
            return this._language;
        },
        set: function (value) {
            this._language = value;
        },
        enumerable: true,
        configurable: true
    });
    InternationalCD.prototype.getDetails = function () {
        return _super.prototype.getDetails.call(this) + (",language=" + this._language);
    };
    return InternationalCD;
}(Cd_1.Cd));
exports.InternationalCD = InternationalCD;
