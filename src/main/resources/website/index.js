/*console.log('Hello');
console.log('Abhinaya');

window.alert('I love hanuman');
document.getElementById("myH1").textContent = 'Hello';
document.getElementById("myP").textContent = 'I am devotee of Hanuman';
*/

/*let age = 25;
let price = 10.99;
let gpa = 2.1;

console.log('You are ${age} years old');
console.log('The price is $${price}');
console.log('Your gpa is: ${gpa}');*/

/*let username;
document.getElementById("mySubmit").onclick=function(){
    username=document.getElementById("myText").value;
    document.getElementById("myH1").textContent='Hello ${username}';
}*/
const decreaseBtn = document.getElementById("decreaseBtn");
const resetBtn = document.getElementById("resetBtn");
const increaseBtn = document.getElementById("increaseBtn");
const countLabel = document.getElementById("countLabel");
let count = 0;

increaseBtn.onclick=function(){
    count++;
    countLabel.textCount=count;
}

decreaseBtn.onclick=function(){
    count--;
    countLabel.textCount=count;
}

resetBtn.onclick=function(){
    count=0;
    countLabel.textCount=count;
}