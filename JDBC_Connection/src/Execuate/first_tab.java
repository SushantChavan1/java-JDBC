package Execuate;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class first_tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "password");
		Statement st= con.createStatement();
		//st.executeQuery("create table stud(roll integer primary key , name varchar2(20), percent float not null)");
		
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.print("Enter Roll :  ");
			int roll= sc.nextInt();
			System.out.print("Enter name :  ");
			String nm= sc.next();
			System.out.print("Enter percent :  ");
			Float prcnt= sc.nextFloat();
			
			st.executeQuery("insert into stud values('"+roll+"','"+nm+"','"+prcnt+"')");
		}
		ResultSet rst= st.executeQuery("select * from stud");
		while(rst.next()) {
			System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getFloat(3));
		}
				
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
		

}
