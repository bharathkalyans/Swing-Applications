import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*1.import java.sql.*;
 * 2.Load and Register Drivers.-->com.mysql.jdbc.driver
 * 3.Create a Connection.
 * 4.Create the Statements.-->Use Prepared Statement if we have lot of attributes!!
 * 5.Execute the Queries.
 * 6.Process the Results.
 * 7.Close the Connection
*/
public class Classroom2 {

	public static void main(String[] args) throws Exception {
		
		
		  String url="jdbc:mysql://localhost:3306/employee"; 
		  String uname="root";
		  String pwd=""; 
		   int deptno=8;
		  String depname="WGASG";
		  String query="insert into dept values(?,?);";
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection con=DriverManager.getConnection(url,uname,pwd);
		  //Statement st=con.createStatement();
		  PreparedStatement st=con.prepareStatement(query);
		  
		  st.setInt(1, deptno);
		  st.setString(2, depname);
		  int count=st.executeUpdate();
		  System.out.println(count +" Rows Affected");	
		  
		  	Statement st2=con.createStatement();
		  	
			  String query2="select * from dept;";
		  
			  ResultSet rs2=st.executeQuery(query2);
			  
			  System.out.println("Department name's are ::");
			  
			  while(rs2.next()) { 
				  String name=rs2.getString("dname"); 
				  String depno=rs2.getString(2); System.out.println(name+" D No. is :"+ depno);
			 }
			  
		
		  st.close(); 
		  con.close();
		
	}
}


