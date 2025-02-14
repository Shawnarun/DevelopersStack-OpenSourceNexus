/*
 * Author: JJPravin
 * Email: jegapravinj2000@gmail.com
 * Date: 10/02/2025
 * Description: A prime number checker in JavaScript
 */

function isPrime(num) {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

// Example usage
const number = 29; // Change this to check other numbers
console.log(`${number} is prime:`, isPrime(number));
