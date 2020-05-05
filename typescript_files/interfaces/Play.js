var _name = 'Max';
var age = 29;
var hasHobbies = true;
//_name='hello';
age = 30;
var summarizeUser = function (_userName, _userAge, _userHasHobby) { return ('Name is ' +
    _userName +
    ', age is ' +
    _userAge +
    ' and the user has hobbies: ' +
    _userHasHobby); };
var add = function (a, b) { return (a + b); };
var addOne = function (a) { return a + 1; };
var addRandom = function () { return 1 + 2; };
console.log(add(1, 2));
console.log(addOne(1));
console.log(addRandom());
console.log(summarizeUser("Shivam", 22, true));
