var review = [1, 5, 3, 7, 9];
var total = 0;
for (var i = 0; i < review.length; i++) {
    console.log(review[i]);
    total += review[i];
}
var average = total / review.length;
console.log("review average =" + average);
