package Execuate;

import java.sql.*;
import java.util.Scanner;

public class all_Functionality {
 
static  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "password");
			Statement st= con.createStatement();
			Scanner sc= new Scanner(System.in);
		
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}			
	}


	public int create_user() {
		System.out.println("Enter the User name ");
		String user= sc.nextLine();
		System.out.println("Enter the password ");
		String pass= sc.nextLine();
	}
	
	public static void main(String[] args) {
		try {
			all_Functionality obj= new all_Functionality();
			System.out.println("::::MENNU::::\n 1. Create User\n 2. Create table \n 3. Insert\n 4. Drop table\n 5. Delete record \n 6. Close Conection ");
			
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("  ");
		}
		// TODO Auto-generated method stub
		
	}

}
