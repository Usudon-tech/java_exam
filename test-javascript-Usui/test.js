// 問題1

console.log("臼井亮輔");

// 問題2

let firstName = "Usui";

let lastName = "Ryosuke";

console.log(firstName + " " + lastName);

// 問題3

let shopping1 = 200;

let shopping2 = 250;

let sum = shopping1 * 3 + shopping2 * 4;

let tax = sum * 0.1;

let final = sum + tax;

console.log("小計");
console.log(sum + "円");
console.log("消費税");
console.log(tax + "円");
console.log("合計金額");
console.log(final + "円");

// 問題4

let testScore = -1;

if(80 <= testScore && testScore <= 100){
    console.log("合格です");
}else if(0 <= testScore && testScore < 80){
    console.log("追試です");
}else{
    console.log("存在しない点数です");
}

// 問題5

let num = 0;

for(let i = 1; i <= 100; i++){
    num += i;
}

console.log(num);

// 問題6

let number1 = 5;

let number2 = 3;

function add(a, b){
    return a + b;
}

function sub(a, b){
    return a - b;
}

function multi(a, b){
    return a * b;
}

function div(a, b){
    return a / b;
}

console.log(number1 + " + " + number2 + " = " + add(number1, number2));

console.log(number1 + " - " + number2 + " = " + sub(number1, number2));

console.log(number1 + " * " + number2 + " = " + multi(number1, number2));

console.log(number1 + " / " + number2 + " = " + div(number1, number2));
