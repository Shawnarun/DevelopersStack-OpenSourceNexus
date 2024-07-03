/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotelmanagement;

import java.sql.SQLException;
import java.util.Scanner;


public class UIHotel {
    
    
	private static void orderFood(int roomNo, int NICNo, Scanner scn) throws SQLException 
	{
		String totalOrder = "";
		int totalAmount = 0;
		while(true) {
			// Display Menu Card
			System.out.println(DBHotel.displayFoodMenu());
			// Ask for order
			System.out.print("Enter Item ID: ");
			int itemID = scn.nextInt();
			
			if(DBHotel.isFoodItemIDValid(itemID))
			{
				
				System.out.print("Enter Item Quantity: ");
				int itemQuantity = scn.nextInt();
				
				String curOrder = DBHotel.addOrderToFoodOrderTable(itemID,itemQuantity,roomNo);
				totalOrder += curOrder;
				
				int curAmount = DBHotel.totalPrice(itemID,itemQuantity);
				totalAmount += curAmount;
				// method call to add items to database, will return string of order history
				
				System.out.print("Order More items ? [ Y / N ]: ");
				char ans = scn.next().toLowerCase().charAt(0);
				
				if(ans == 'n') {	
					System.out.println("+-----------------------+-------+-------+---------------+");
					System.out.println("| Food Item\t\t| Price\t| Qty\t| Subtotal\t|");
					System.out.println("+-----------------------+-------+-------+---------------+");
					System.out.print(totalOrder);
					System.out.println("+-----------------------+-------+-------+---------------+");
					System.out.println("Total Amount: Rs."+totalAmount);
					// add this totalAmount in customers table
					System.out.println(DBHotel.addTotalAmountInCustomerTable(roomNo,NICNo,totalAmount));
					
					break; 
				}
			}
			else {
				System.out.println("Please Enter Valid Food ID!");
			}
		}
	}
	
	private static void checkout(int roomNo, int NICNo, Scanner scn) throws SQLException{
		System.out.println(DBHotel.getFinalBill(roomNo,NICNo));					
		int grantTotalAmount = DBHotel.grantTotalAmount(roomNo,NICNo);
		
		System.out.println("Grand Total to be Paid before Checkout: Rs."+ grantTotalAmount );
		
		while(true)
		{
			System.out.print("Enter the Amount to Pay: ");
			int payment = scn.nextInt();
			if(payment == grantTotalAmount)
			{
				System.out.println("\n*****************************************");
				System.out.println("Thank you for you Payment!\nPlease visit us Again!");
				System.out.println("\n*****************************************");
                                
				// method which will remove user details from all tables
				DBHotel.removeAllCustomerDetails(roomNo,NICNo);
				System.exit(0);
				break;
			}						
			else {
				System.out.println("Please Enter Exact Amount that is Rs."+grantTotalAmount);
			}
		}
		
	}

	private static void O2O1EnterRNAndAN(Scanner scn) throws SQLException 
	{
		System.out.println("\n*****************************************");
		System.out.print("Enter Room Number: ");
		int roomNo = scn.nextInt();
		System.out.print("Enter NIC Number [Without Spaces]: ");
		int NICNo = scn.nextInt();
		
		if(DBHotel.rnAndAnAuthenication(roomNo, NICNo) == true) 
		{
			System.out.println("\n\tLogin Successful!");
			while(true)
			{
				System.out.println("\n*****************************************");
				System.out.println("Select Operation to Perform: \n");
				System.out.println("1. Order Food.");
				System.out.println("2. Check Out.");				
				System.out.println("3. Go Back.");
				System.out.print("\nEnter your Choice:");
				int choice = scn.nextInt();
				if(choice == 3) {break;}
				
				switch(choice) {
				
				case 1:{
					orderFood(roomNo,NICNo,scn);
					break;
				}
				case 2:{
					checkout(roomNo, NICNo, scn);
					break;
				}
				
				default:{
					System.out.println("Please give valid Input!");
				}
				}
			}
		}
		else {
			System.out.println("Please Enter Valid Details!");
		}	
		
	}
	private static void O2O2ForgotRN(Scanner scn) throws SQLException 
	{

		System.out.print("Enter Your NIC Number [Without Spaces] : ");
		int NICNo = scn.nextInt();
		
		System.out.println(DBHotel.forgotRN(NICNo));
		
	}
	
	private static void O2UserLogin(Scanner scn) throws SQLException
	{
		while(true)
		{
			System.out.println("\n*****************************************");
			System.out.println("Select Operation to Perform: \n");
			System.out.println("1. Login with Room Number and NIC Number");
			System.out.println("2. Forgot Room Number");
			System.out.println("3. Go Back");
			System.out.print("\nEnter your Choice: ");
			
			int choice = scn.nextInt();
			if(choice == 3) {break;}
			
			switch(choice)
			{
			case 1:{
				
				O2O1EnterRNAndAN( scn);		
				break;
			}
			case 2:{
				
				O2O2ForgotRN(scn);	
				break;
			}
			default:{
				System.out.println("Please give valid Input!");
			}
			}
			
		}
		
	}
	private static void O1BookARoom(Scanner scn) throws SQLException 
	{
		while(true) 
		{
			System.out.println("\n*****************************************");
			System.out.println("Select Operation to Perform: \n");
			System.out.println("1. Show all Rooms.");
			System.out.println("2. Book a Room.");
			System.out.println("3. Go Back");
			System.out.print("\nEnter your Choice: ");
			int choice1 = scn.nextInt();
			
			if(choice1 == 3) {break;}
			switch(choice1) 
			{
			
			case 1:{
				System.out.println("\n*****************************************");
				System.out.println("DISPLAYING ALL ROOMS: ");
				System.out.println(DBHotel.getRoomDetails());				
				
				break;
			}
			case 2:{
				System.out.println("\n*****************************************");
				System.out.println("DISPLAYING ALL ROOMS with Availability: ");
				System.out.println(DBHotel.getRoomDetailsWithAvailability());
				
				System.out.print("Enter Room Number you want to Book: ");
				int bookedRN = scn.nextInt();
				if(DBHotel.ifRoomNoIsValid(bookedRN))
				{
					if(DBHotel.isRoomAvailable(bookedRN) )
					{
						System.out.print("Number of Days you want to Book the Room: ");
						int bookedDays = scn.nextInt();
						
						System.out.print("Enter Your First Name: ");
						String firstName = scn.next();
						
						System.out.print("Enter Your Last Name: ");
						String lastName = scn.next();
						
						System.out.print("Enter Your NIC Number [Without Spaces]: ");
						int NICNo = scn.nextInt();
						
						System.out.print("Do you want to confirm Your Booking? (Y/N): ");
						char bookingConfirm = scn.next().toLowerCase().charAt(0);
						
						if(bookingConfirm != 'n')
						{
							boolean isBookingConfirm = DBHotel.bookRoom(bookedRN,bookedDays,firstName,lastName,NICNo);
							if(isBookingConfirm) {
								System.out.println("\nHi "+firstName+", Your Desired Room has been Successfully Booked!");
								return;
							}
							else {
								System.out.println("Sorry! Your Booking was Unsuccessful!");
							}
						}else {
							System.out.println("Booking Cancelled!");
						}
						
					}
					else {
						System.out.println("Room No "+bookedRN+" is Not Available.");
					}
				}
				else {
					System.out.println("Please Enter a Valid Room Number!");
				}
				
				break;
			}
			
			default:{
				System.out.println("Please give valid Input!");
			}
			
			}
		}
	}

	static void startApp() throws SQLException
	{
		System.out.println("******** WELCOME TO HOTEL TRIVAGO *******");
		Scanner scn = new Scanner(System.in);

		while (true)
		{
			System.out.println("\n*****************************************");
			System.out.println("How may we help you?\n");
			System.out.println("1. I want to Book a Room.");
			System.out.println("2. I want to Login.");
			System.out.println("3. Quit.");
			System.out.print("\nEnter your Choice: ");
			int choice = scn.nextInt();
			
			if(choice == 3) {break;}
			
			switch (choice)
			{

			case 1:
			{
				O1BookARoom(scn);
				break;
			}
			case 2:
			{
				O2UserLogin(scn);
				break;
			}
			
			default:{
				System.out.println("Please give valid Input!");
			}

			}

		}

	}

}
