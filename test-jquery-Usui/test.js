// 問題1
console.log("臼井亮輔");

// 問題2
$("#button").one("click", function() {
    $("#name").css("color", "red");
});

// 問題3
$("#button1").one("click", function() {
    alert($("input").text());
});

// 問題4
$("#button2").one("click", function() {
    $("#button2").prop("disabled", true);
});
