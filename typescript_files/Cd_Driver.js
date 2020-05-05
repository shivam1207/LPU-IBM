"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Cd_1 = require("./Cd");
var SpecialEditionCd_1 = require("./SpecialEditionCd");
var InternationalCD_1 = require("./InternationalCD");
var cd1 = [];
var myCd = new Cd_1.Cd("101", "End Game", "Action");
var myCd1 = new SpecialEditionCd_1.SpecialEditionCd(true, "102", "Game of thrones", "Action");
var myCd2 = new InternationalCD_1.InternationalCD("english", "103", "friends", "comedy");
cd1.push(myCd);
cd1.push(myCd1);
cd1.push(myCd2);
for (var _i = 0, cd1_1 = cd1; _i < cd1_1.length; _i++) {
    var tempCd = cd1_1[_i];
    console.log(tempCd);
}
