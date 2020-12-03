import java.sql.*;

class Student {
	int rollno;
	String name;	
	Student(){}
	Student(int rollno){this.rollno=rollno;}
	Student (String name){this.name=name;}
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}
public class JDBCdao {

	public static void main(String args[]) {
		
//		StudentDAO dao=new StudentDAO();
			
//		Student s1=dao.getStudent(2);-->Fetching the student Details!!
//		
//		System.out.println(s1.name);
		
//		Student s2=new Student();
//		s2.rollno=3;
//		s2.name="Archana";
//		dao.connect();
//		dao.addStudent(s2);
//		dao.close();

		
//		Student s3=new Student();
//		s3.name="Raghu";
//		s3.rollno=2;
//		dao.connect();
//		dao.removeStudent(2);
//		dao.close();
//		
	}
	
}


class StudentDAO{
	//Driver Class for Connecting the MySQL and Java!!!
	
	Connection con=null;

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
			
		} catch (Exception e) { 
			System.out.println(e);
		}
	}
	
	public void close() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Student getStudent(int rollno) {
		try {
			
			Student s=new  Student();
			s.rollno=rollno;
			
			String query="select name from students where rollno="+rollno;
				
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			
			 String name=rs.getString(1);
			 s.name=name;
			 return s;
			 		
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			
		}
		return null;
	}
	
	public void addStudent(Student s) {
		String query="insert into students values(?,?);";
		
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1,s.rollno);
			pst.setString(2, s.name);
			
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void removeStudent(int rollno) {
		String query="delete from students where rollno="+rollno;
		PreparedStatement pst;
		try {
			 pst=con.prepareStatement(query);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}



























