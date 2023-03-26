package application;
import java.sql.*;

public class OracleCon	{

	public boolean CheckNoAlreadyRegisterAdmin(String CNIC) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver successfully loaded");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			System.out.println("Connection Established");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from AdminTable WHERE ACCOUNTNO ="+ CNIC);
			while(rs.next()) {
				String CheckCNIC= rs.getString("CNIC");
				if (CheckCNIC.equals(CNIC)==true) {
					System.out.println("New Admin Registered");
					return true;
				}
				
			}
			rs.close();
			stmt.close();
			con.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		}
		
		catch(SQLException e) {
			System.out.println("Connection Failed");
		}
		return false;
	}
	
	
	public void RegisterAdminFunction(String Username, String CNIC, String Password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver successfully loaded");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			System.out.println("Connection Established");

			String sql = "INSERT INTO AdminTable (Username, CNIC, Password) VALUES (?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, Username);
			statement.setString(2, CNIC);
			statement.setString(3, Password);
			int rowInserted = statement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Inserted Sucessfully!!!");
			}	
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		}
		
		catch(SQLException e) {
			System.out.println("Connection Failed");
		}
	}

}
