/*
 * Author: JJPravin
 * Email: jegapravinj2000@gmail.com
 * Date: 10/02/2025
 * Description: A Fibonacci series generator in JavaScript
 */

function fibonacciSeries(n) {
    let fib = [0, 1];
    
    for (let i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    
    return fib.slice(0, n);
}

// Example usage
const num = 10; // Change this to generate more terms
console.log(fibonacciSeries(num));
