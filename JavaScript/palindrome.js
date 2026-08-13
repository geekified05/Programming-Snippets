let s = "madam";

console.log(s === s.split("").reverse().join("")
    ? "Palindrome"
    : "Not a palindrome");