
/**
Author: Thayuran
Email: thayuran1998@gmail.com
Date: 08/03/2024
Description: Word Counter program 
 */
/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 24/06/2024
 * Description : Remove 4 Warning message
 */

import java.util.Scanner;

public class WordCounter
{
    public static void main(String[] args)
	{

        System.out.println("\t\tWelcome to Word Count App!");
		userMenu();
    }
	
	public static void userMenu()
	{
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        while (!userChoice.equals(5)) 
		{
            displayMenuOption();
            System.out.print("Enter your choice: "); 
            userChoice = scanner.next();
            switch (userChoice) 
			{
                case "1":
                    wordCount();
                    break;
                case "2":
                    charCountWithSpaces();
                    break;
                case "3":
                    charCountWithoutSpaces();
                    break;
                case "4":
                   System.out.print("Thank you..Bye!"); 
                   System.exit(0);
            }
        }
        scanner.close();
    }

    public static void displayMenuOption() 
	{
        System.out.println(
                "\n 1. Get word count " +
                        "\n 2. Get character count including whitespaces" +
                        "\n 3. Get character count without whitespaces" +
                        "\n 4. Exit");

    }
	
	
	  public static void wordCount()
	  {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+"); 
        int wordCount = words.length;
        System.out.println("Number of words in your text = " + wordCount);

        scanner.close();

    }

    public static void charCountWithSpaces()
	{
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        int charCount = text.length();
        System.out.println("Number of characters in your text including white spaces = " + charCount);

        scanner.close();
    }

    public static void charCountWithoutSpaces()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        int charCount = text.replaceAll("\\s+", "").length();
        System.out.println("Number of characters in your text without white spaces = " + charCount);

        scanner.close();
    }
		
}