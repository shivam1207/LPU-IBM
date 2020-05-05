let review : number[]=[1,5,3,7,9];
let total : number =0;
for(let i=0;i<review.length;i++){
    console.log(review[i]);

    total+=review[i];
}
let average :number = total/review.length;
console.log("review average ="+average);
