/* 
* Author : AkmalAzeem
* Email : akmalazeem2003@gmail.com
* Date : 16/03/2024
*
* Description : If-Else Statement in JavaScript Programming Language Example with Explanation and Solution Code
*/

//If hour is between 12AM(0) to 1PM(13) -> Good Morning
//Else if hour is between 1PM(13) to 4PM(16) -> Good Afternoon
//Else if hour is between 4PM(16) to 7PM(19) -> Good Evening
//Else hour is between 7PM(19) to 12AM(0) -> Good Night

let hour = 12;

if (hour >= 0 && hour < 13) {
  console.log("Good Morning");
} else if (hour >= 13 && hour < 16) {
  console.log("Good Afternoon");
} else if (hour >= 16 && hour < 19) {
  console.log("Good Evening");
} else {
  console.log("Good Night");
}


// Output -> Good Morning
