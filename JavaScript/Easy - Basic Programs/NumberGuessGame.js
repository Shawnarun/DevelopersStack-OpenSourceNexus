/*
 * Author : Priyandhini
 * Email : priyandhinip@gmail.com
 * Date : 20 March 2024
 * Description : Number Guessing Game in JavaScript
                 Function to generate a random number between min and max (inclusive)
 */





                 function getRandomNumber(min, max) {
                    return Math.floor(Math.random() * (max - min + 1)) + min;
                }
                
                
                function startGame() {
                    
                    const minNumber = 1;
                    const maxNumber = 100;
                
                    
                    const secretNumber = getRandomNumber(minNumber, maxNumber);
                
                    let attempts = 0;
                    let guessedNumber;
                
                   
                    while (guessedNumber !== secretNumber) {
                        
                        guessedNumber = parseInt(prompt(`Guess the number between ${minNumber} and ${maxNumber}:`));
                
                        
                        attempts++;
                
                        
                        if (guessedNumber === secretNumber) {
                            alert(`Congratulations! You guessed the number ${secretNumber} in ${attempts} attempts.`);
                        } else if (guessedNumber < secretNumber) {
                            alert("Too low! Try again.");
                        } else {
                            alert("Too high! Try again.");
                        }
                    }
                }
                
                
                startGame();
                