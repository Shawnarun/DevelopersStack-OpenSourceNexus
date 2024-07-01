/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class DBHotel {
    static Connection con;
	
	static void dbConnect() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:8000/phpmyadmin/index.php?route=/database/structure&db=hotel_management_project", "root", "");
	
		System.out.println(con);
	}
	
	static void dbDisconnect() throws SQLException {
		con.close();
	}
	
	static String getRoomDetails() throws SQLException {

		String query = "select r_no,r_details,r_price from rooms";		
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String result = "+-------+-----------------------+-------+\n";
		result += 	"|Room No|Details\t\t|Price\t|\n";
		result +=  	"+-------+-----------------------+-------+\n";
		while(rs.next()) 
		{
			result += "|"+rs.getInt(1) +"\t"+
					"|"+rs.getString(2) +"\t"+
					"|"+ rs.getInt(3)+"\t|\n";
		}
		
		result +=  "+-------+-----------------------+-------+";
		return result;
		
	}
	
	static String getRoomDetailsWithAvailability() throws SQLException {

		String query = "select r_no,r_details,r_price,r_availability from rooms";		
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String result = "+-------+-----------------------+-------+---------------+\n";
		result += 	"|Room No|Details\t\t|Price\t|Availabilty\t|\n";
		result +=  	"+-------+-----------------------+-------+---------------+\n";
		while(rs.next()) 
		{
			result += "|"+rs.getInt(1) +"\t"+
					"|"+rs.getString(2) +"\t"+
					"|"+ rs.getInt(3)+"\t"+
					"|"+ rs.getString(4)+"\t|\n";
		}
		
		result +=  "+-------+-----------------------+-------+---------------+\n";
		return result;
		
	}
	
	static boolean isRoomAvailable(int bookedRN) throws SQLException {
		String query = "select r_availability from rooms where r_no = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, bookedRN);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		
		if(rs.getString(1).equals("Available")) {
				return true;
		}
		else {
			return false;
		}

	}
	
	static boolean ifRoomNoIsValid(int bookedRN) throws SQLException {
		String query = "select r_no from rooms";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			if(rs.getInt(1) == bookedRN) {
				return true;
			}
		}
		
		return false;
	}

	static boolean bookRoom(int bookedRN,int bookedDays,String firstName,String lastName,int NICNo) throws SQLException
	{
		boolean check = false;
		
		// Getting room price from rooms table
		String priceQuery = "select r_price from rooms where r_no = ?";
		PreparedStatement ps = con.prepareStatement(priceQuery);
		ps.setInt(1, bookedRN);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int roomPrice = rs.getInt(1);		
		
		
		//Inserting details in customers table
		String queryic = "insert into customers (c_first_name, c_last_name, c_nic_no, c_room_no, c_booked_days, c_balance_amt) values (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement psic = con.prepareStatement(queryic);
		psic.setString(1, firstName);
		psic.setString(2, lastName);
		psic.setInt(3, NICNo);
		psic.setInt(4, bookedRN);
		psic.setInt(5, bookedDays);
		psic.setInt(6, (roomPrice * bookedDays));		
		int affectedRowic = psic.executeUpdate();
		
		
		// Inserting c_aadhar_no in rooms table
		
		String queryir = "update rooms set c_nic_no=?,r_availability=? where r_no=?";
		PreparedStatement psir = con.prepareStatement(queryir);
		psir.setInt(1, NICNo);
		psir.setString(2, "Not Available");
		psir.setInt(3, bookedRN);		
		int affectedRowir = psir.executeUpdate();
		
		// checking if insertion in both tables is successfully carried out
		
		if(affectedRowic > 0 && affectedRowir > 0)  {
			check = true;
		}
		
		return check;
	}


//	User Login Methods
	
	static boolean rnAndAnAuthenication(int roomNo, int NICNo) throws SQLException
	{
		if(ifRoomNoIsValid(roomNo))
		{
			String query = "select c_nic_no from rooms where r_no=?";		
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, roomNo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			
			int tableNICNo = rs.getInt(1);
			
			if(tableNICNo == NICNo) {
				return true;
			}
		}

		return false;
	}

	static String forgotRN(int NICNo) throws SQLException
	{
		String query = "select r_no from rooms where c_nic_no=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, NICNo);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) 
		{ 
			int roomNo = rs.getInt(1);
			return "Your Room No is "+roomNo;
		}
		return "There is no Room Booked with this NIC Number!";
	}


//	after Successful login
	
	static String displayFoodMenu() throws SQLException {
		String query = "select * from food_menu";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String result = "+-------+-----------------------+-------+\n";
		result += 		"|ID\t|Food Item\t\t|Price\t|\n";
		result += 		"+-------+-----------------------+-------+\n";
		while(rs.next())
		{
			result += "|"+rs.getInt(1) +"\t|";
						
			if(rs.getString(2).length() > 14)
			{
				result += rs.getString(2) +"\t|";
			}
			else 
			{
				result += rs.getString(2) +"\t\t|";				
			}
			
			result += rs.getInt(3) + "\t|\n";
		}
		result += "+-------+-----------------------+-------+\n";
		return result;
	}

	static boolean isFoodItemIDValid(int itemID) throws SQLException {
		String query = "select * from food_menu where f_id=?";
		PreparedStatement ps =  con.prepareStatement(query);
		ps.setInt(1, itemID);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;		
	}

	static String addOrderToFoodOrderTable(int itemID, int itemQuantity, int roomNo) throws SQLException {
		// Fetching cur food item details [to add in order table]
		String query = "select * from food_menu where f_id=?";
		PreparedStatement ps =  con.prepareStatement(query);
		ps.setInt(1, itemID);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		String fName = rs.getString(2);
		int fPrice = rs.getInt(3);
		
		// Adding data into food Orders table
		
		String queryo = "insert into food_order (fid, room_no, fname,fprice,fqty,ftotal) values(?,?,?,?,?,fprice*fqty)";
		PreparedStatement pso = con.prepareStatement(queryo);
		pso.setInt(1, itemID);
		pso.setInt(2, roomNo);
		pso.setString(3, fName);
		pso.setInt(4, fPrice);
		pso.setInt(5, itemQuantity);
		
		
		int affectedRows = pso.executeUpdate();
		String result = "";
		if(fName.length() >14) 
		{
			result = "| "+fName+"\t| ";
		}
		else
		{			
			result = "| "+fName+"\t\t| ";
		}
		
		result += fPrice+"\t| ";
		result += itemQuantity+"\t| ";
		result += (fPrice*itemQuantity)+"\t\t|\n";
	
		return result;
	}

	static int totalPrice(int itemID,int itemQuantity) throws SQLException {
		
		String query = "select * from food_menu where f_id=?";
		PreparedStatement ps =  con.prepareStatement(query);
		ps.setInt(1, itemID);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		int fPrice = rs.getInt(3);
		int amt = fPrice * itemQuantity;
		return amt;
	}

	static String addTotalAmountInCustomerTable(int roomNo,int NICNo,int totalAmount) throws SQLException
	{

		String query = "update customers set c_balance_amt = (c_balance_amt+?) where (c_nic_no=? and c_room_no=? and c_balance_amt != 0)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, totalAmount);
		ps.setInt(2, NICNo);
		ps.setInt(3, roomNo);
		
		int affectedRow = ps.executeUpdate();
		if(affectedRow == 1)
		{
			return "Thank You for Ordering!\nAmount will be Added to your Account!";
		}
		else {
			return "There was an issue while Adding amount to your Account.\nPlease Try Again Later!";
		}
	}


// Checkout methods
	private static String RoomBill(int roomNo,int NICNo) throws SQLException {
		String result = "";
		
	// Making Renting Bill String
		
		String query = "select r_details,r_price from rooms where r_no=? and c_nic_no=?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, roomNo);
		ps.setInt(2, NICNo);
		ResultSet rs = ps.executeQuery();
		rs.next();		
		String roomDetails = rs.getString(1);
		int roomPrice = rs.getInt(2);
		
		//fetching days booked from customer table
		String querydays = "select c_booked_days from customers where (c_nic_no=? and c_room_no=? and c_balance_amt != 0);";
		PreparedStatement psd = con.prepareStatement(querydays);
		psd.setInt(1, NICNo);
		psd.setInt(2, roomNo);
		ResultSet rsd = psd.executeQuery();
		rsd.next();		
		int daysBooked = rsd.getInt(1);
		result += "\n***************************************************************\n";
		result += "\t\t\tFINAL BILL\n";
		result += "\t\t\t----------\n";
		result += "\nRoom Costs: \n";
		result += "+-------+-------------------------------+-------+-------+-------+\n";
		result += "| Room\t| Details\t\t\t| Price\t| Days\t| Total\t|\n";
		result += "+-------+-------------------------------+-------+-------+-------+\n";
		result += "| "+ roomNo +"\t";
		if(roomDetails.length() < 21) {
			result += "| "+ roomDetails +"\t\t";
		}else {			
			result += "| "+ roomDetails +"\t";
		}
		result += "| "+ roomPrice +"\t";
		result += "| "+ daysBooked+"\t";
		result += "| "+ (roomPrice*daysBooked)+"\t|\n";
		result += "+-------+-------------------------------+-------+-------+-------+\n";
		
		return result;
	}

	private static String FinalFoodBill(int roomNo,int NICNo) throws SQLException {
		
		// Making Food Bill
			
			String result = "";
			String queryf = "select room_no,fname,fprice,sum(fqty),sum(ftotal) from food_order group by room_no,fname having room_no=?";
			PreparedStatement psf = con.prepareStatement(queryf);
			psf.setInt(1, roomNo);
			ResultSet rsf = psf.executeQuery();
			int foodBill = 0;
			result += "\nFood Costs: \n";
			result += "+-----------------------+-------+-------+---------------+\n";
			result += "| Food Item\t\t| Price\t| Qty\t| Subtotal\t|\n";
			result += "+-----------------------+-------+-------+---------------+\n";
			while(rsf.next())
			{
				String fName = rsf.getString(2);
				int itemQuantity = rsf.getInt(4);
				int fPrice = rsf.getInt(3);
				int ftotal= rsf.getInt(5);
				
				if(fName.length() >14) 
				{
					result += "| "+fName+"\t| ";
				}
				else
				{			
					result += "| "+fName+"\t\t| ";
				}
				
				result += fPrice+"\t| ";
				result += itemQuantity+"\t| ";
				result += (ftotal)+"\t\t|\n";
				
				foodBill += ftotal;
			}
			result += "+-----------------------+-------+-------+---------------+\n";
			result += "You Overall Food Bill is Rs."+foodBill+"\n";
	return result;
	}
	
	static String getFinalBill(int roomNo,int NICNo) throws SQLException {

		
		String roomBill = RoomBill(roomNo,NICNo);
		String finalFoodBill = FinalFoodBill(roomNo, NICNo);
		
		String result = roomBill + finalFoodBill;
		return result;
	}

	static int grantTotalAmount(int roomNo,int NICNo) throws SQLException {
		String query = "select c_balance_amt from customers where (c_nic_no=? and c_room_no=? and c_balance_amt != 0);";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, NICNo);
		ps.setInt(2, roomNo);
		ResultSet rs = ps.executeQuery();
		rs.next();		
		int grantTotalAmount = rs.getInt(1);
		return grantTotalAmount;
		
	}

	static void removeAllCustomerDetails(int roomNo,int NICNo) throws SQLException 
	{
		removeFoodOrderHistory(roomNo);
		setCustomerBalanceToZero(roomNo, NICNo);
		removeCusDetailsFromRoomsTable(roomNo);
	}

	private static void removeFoodOrderHistory(int roomNo) throws SQLException {
		String query = "delete from food_order where room_no=?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, roomNo);
		
		ps.executeUpdate();		
	
	}

	private static void setCustomerBalanceToZero(int roomNo,int NICNo) throws SQLException {
		String query = "update customers set c_balance_amt=0 where (c_nic_no=? and c_room_no=? and c_balance_amt != 0); ";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, NICNo);                             //-------------------------
		ps.setInt(2, roomNo);
		
		ps.executeUpdate();
		
	
	}

	private static void removeCusDetailsFromRoomsTable(int roomNo) throws SQLException {
		String query = "update rooms set c_nic_no=null,r_availability=\"Available\" where r_no=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, roomNo);
		
		ps.executeUpdate();		
	}

    
}
