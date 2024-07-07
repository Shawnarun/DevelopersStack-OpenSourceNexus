/*
* Author : Musaraf
* Email : nowsathmusaraf037@gmail.com
* Date : 07/07/2024
* Description : ATM System
*/

namespace ATMSystem{
    class ATM
{
    int pin = 1234;
    double balance;

    void checkpin()
    {
        Console.WriteLine("Enter Your PIN");
        int Enterpin = Convert.ToInt32(Console.ReadLine());
        if (pin == Enterpin)
        {
            menu();
        }
        else
        {
            Console.WriteLine("Invalid Pin");
        }
    }
    void menu()
    {
        Console.WriteLine("1. Check Balance");
        Console.WriteLine("2. Withdraw Money");
        Console.WriteLine("3. Deposit Money");
        Console.WriteLine("4. Exit");

        int opt = Convert.ToInt32(Console.ReadLine());
        if (opt == 1)
        {
            checkbalance();
        }
        else if (opt == 2)
        {
            withdraw();
        }
        else if (opt == 3)
        {
            deposit();
        }
        else if (opt == 4)
        {
            Console.WriteLine("Thank You Come Again");
            return;
        }
        else
        {
            Console.WriteLine("Invalid Option");
        }
    }
    void checkbalance()
    {
        Console.WriteLine("Your Balance is : " + balance);
         Console.WriteLine("Do You want to make another withsraw or deposit press 1");
        int num = Convert.ToInt32(Console.ReadLine());
        if (num == 1){
            Console.WriteLine("Enter Your PIN");
            int pin = Convert.ToInt32(Console.ReadLine());
            if (pin == 1234){
                menu();
            }
            else{
                Console.WriteLine("Invalid PIN");
            }
        }
        else{
            Console.WriteLine("Thank You");
        }
    }
    void withdraw()
    {
        Console.WriteLine("Enter the amount you want to withdraw");
        double amount = Convert.ToDouble(Console.ReadLine());
        if (amount > balance)
        {
            Console.WriteLine("Insufficient Balance");
            menu();
        }
        else
        {
            balance = balance - amount;
            Console.WriteLine("Your Withdraw Success!");
             Console.WriteLine("Do You want to make another withsraw or deposit press 1");
        int num = COnvert.ToInt32(Console.ReadLine());
        if (num == 1){
            Console.WriteLine("Enter Your PIN");
            int pin = Convert.ToInt32(Console.ReadLine());
            if (pin == 1234){
                menu();
            }
            else{
                Console.WriteLine("Invalid PIN");
            }
        }
        else{
            Console.WriteLine("Thank You");
        }
        }
    }
    void deposit()
    {
        Console.WriteLine("Enter the amount you want to deposit");
        double amount = Convert.ToDouble(Console.ReadLine());
        balance = balance + amount;
        Console.WriteLine("Do You want to make another withsraw or deposit press 1");
        int num = Convert.ToInt32(Console.ReadLine());
        if (num == 1){
            Console.WriteLine("Enter Your PIN");
            int pin = Convert.ToInt32(Console.ReadLine());
            if (pin == 1234){
                menu();
            }
            else{
                Console.WriteLine("Invalid PIN");
            }
        }
        else{
            Console.WriteLine("Thank You");
        }
    }
           
    
    class program{
        static void main(string [] args){
            ATM obj = new  ATM();
            obj.checkpin();
        }
    }
}
}