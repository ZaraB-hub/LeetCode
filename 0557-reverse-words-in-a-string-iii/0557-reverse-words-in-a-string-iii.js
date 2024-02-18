/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    // Split the input string into an array of words
    let words = s.split(" ");

    // Reverse each word in the array
    let reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words back into a single string
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;

};