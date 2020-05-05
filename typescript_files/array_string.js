var sportsOne = ["cricket", "tennis", "football", "baseball"];
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var tempSports = sportsOne_1[_i];
    if (tempSports == "cricket") {
        console.log(tempSports + "<< My favourite sports");
    }
    else {
        console.log(tempSports);
    }
}
sportsOne.push("basketball");
sportsOne.push("swimming");
for (var _a = 0, sportsOne_2 = sportsOne; _a < sportsOne_2.length; _a++) {
    var tempSports = sportsOne_2[_a];
    console.log(tempSports);
}
