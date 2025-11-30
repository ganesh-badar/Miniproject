package mypack;

import java.sql.*;

import javax.swing.JOptionPane;

public class StudModel {
	MyConnection mycon;
	
	public void addStudent(Student s)
	{
		try
		{
			 Connection con = MyConnection.getConnection();
			 PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1, s.getRollno());
			pst.setString(2, s.getName());
			pst.setString(3, s.getCity());
			pst.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(null,"RECORD SAVED");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void updateStudent(Student s)
	{
		try
		{
			 Connection con = MyConnection.getConnection();
			 PreparedStatement pst = con.prepareStatement("update student set name=?,city=? where rollno=?");
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setInt(3, s.getRollno());
			pst.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(null,"RECORD UPDATED");
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	public void deleteStudent(Student s)
	{
		try
		{
			 Connection con = MyConnection.getConnection();
			 PreparedStatement pst = con.prepareStatement("delete from student where rollno=?");
			pst.setInt(1, s.getRollno());
			pst.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(null,"RECORD DELETED");
			
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void searchStudent(Student s)
	{
		try
		{
			 Connection con = MyConnection.getConnection();
			 PreparedStatement pst = con.prepareStatement("select * from student where rollno=?");
			pst.setInt(1, s.getRollno());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
			}
			else
				JOptionPane.showMessageDialog(null,"NOT FOUND");
			
			con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
			}
	}

}