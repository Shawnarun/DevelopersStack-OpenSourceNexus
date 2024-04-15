/*
 * Author : KPriyandhini
 * Email : priyandhinip@gmail.com
 * Date : 17th of Feb 2024
 * Description : In this program, we have an array of quotes,
 *                and a function (getRandomQuote()) that randomly selects and returns a quote from the array.
 *                The program then logs a randomly selected quote to the console.
 */


var quotes = [
    "The only way to do great work is to love what you do. - Steve Jobs",
    "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
    "Strive not to be a success, but rather to be of value. - Albert Einstein",
    "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
    "Life is what happens when you're busy making other plans. - John Lennon"
];

// Function to get a random quote from the array
function getRandomQuote() {
    var randomIndex = Math.floor(Math.random() * quotes.length);
    return quotes[randomIndex];
}

// Display a random quote
console.log("Here's a random quote for you:\n" + getRandomQuote());
