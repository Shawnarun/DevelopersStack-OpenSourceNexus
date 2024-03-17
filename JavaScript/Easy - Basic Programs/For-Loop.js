/*
 * Author : AkmalAzeem
 * Email : akmalazeem2003@gmail.com
 * Date : 16/03/2024
 *
 * Description : Printing Numbers 1 to 10 ,Printing Odd Numbers using For Loop in JavaScript Programming Language Example with Explanation and Solution
 */

// 1 to 10
for (let i = 1; i <= 10; i++) {
  console.log(i);
}

/* Output:
1
2
3
4
5
6
7
8
9
10
*/

// Explanation of the code above
// i = 1
// i <= 10
// i++ is equivalent to i + 1 = 2, then i becomes 2
// So, loop will continue until i is equal to 10




/* =========== Odd Numbers ==========*/

for (let i = 1; i <= 10; i++) {
  if (i % 2 !== 0) {
    console.log(i);
  }
}

/* Output:
1
3
5
7
9
*/


// Explanation of the code above
// i = 1
// i <= 10
// If i is not divisible by 2, i will be logged to the console.
// Since we are checking for odd numbers, we need to use i % 2 !== 0 instead of i % 2 === 0 because 0 is also an even number.