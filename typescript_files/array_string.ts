let sportsOne: string[]=["cricket","tennis","football","baseball"];
for(let tempSports of sportsOne)
{
    if(tempSports=="cricket")
    {
        console.log(tempSports+"<< My favourite sports");

    }
    else{
        console.log(tempSports);
    }



}
sportsOne.push("basketball");
sportsOne.push("swimming");
for(let tempSports of sportsOne)
{
    console.log(tempSports);
}
