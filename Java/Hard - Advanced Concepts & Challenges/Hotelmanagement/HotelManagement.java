/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotelmanagement;

/**
 *
 * @author user
 */
public class HotelManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
		try
		{
			DBHotel.dbConnect();
			UIHotel.startApp();
		} 
		catch (Exception e)
		{

			System.out.println(e.getMessage());
		} 
		finally
		{
			try
			{
				DBHotel.dbDisconnect();
			} 
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
    
    
}
