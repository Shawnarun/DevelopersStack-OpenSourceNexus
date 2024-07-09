/*
* Author : Musaraf
* Email : nowsathmusaraf037@gmail.com
* Date : 09/07/2024
* Description : BMI calculator 
*/

namespace BMI{
    class program{
        static void main(string [] args){
            Console.WriteLine("Enter your height in cm : ");
            int height = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter your weight in kg : ");
            int weight = Convert.ToInt32(Console.ReadLine());

            double BMI = (weight/height*height);
            COnsole.WriteLine("Your BMI is : "+BMI);

            if(BMI<=16){
                Console.WriteLine("You are Severe Thinness");
            }
            else if(BMI<17){
                Console.WriteLine("You are Moderate Thinness");
            }
            else if(BMI<18.5){
                Console.WriteLine("You are Mild Thinness");
            }
            else if(BMI<25){
                Console.WriteLine("You are Normal");
            }
            else if(BMI<30){
                Console.WriteLine("You are Overweight");
            }
            else if(BMI<35){
                Console.WriteLine("You are Obese Class I");
            }
            else if(BMI <40){
                Console.WriteLine("You are Obese Class II");
            }
            else{
                Console.WriteLine("You are Obese Class III");
            }
        }
    }
}