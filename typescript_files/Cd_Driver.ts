
import {Cd} from "./Cd";
import{SpecialEditionCd} from "./SpecialEditionCd";
import{InternationalCD} from "./InternationalCD";
let cd1: Cd[]=[];
let myCd =new Cd("101","End Game","Action");
let myCd1 = new SpecialEditionCd(true,"102","Game of thrones","Action");
let myCd2 = new InternationalCD("english","103","friends","comedy");
cd1.push(myCd);
cd1.push(myCd1);
cd1.push(myCd2);
for(let tempCd of cd1) {
    console.log(tempCd);
}

