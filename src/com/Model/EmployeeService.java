package com.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.connect.ConnectionFactory;


public class EmployeeService implements EmployeeDao {

	public ArrayList<Employee> displayEmployee() {
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		try {
			
			Connection connection=ConnectionFactory.getConnection();
		    Statement statement= connection.createStatement();
		    ResultSet set=statement.executeQuery("select * from employee" );
		    while(set.next()) {
		    	   System.out.println(set.getString(2));
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1");
			Connection connection=ConnectionFactory.getConnection();
		    System.out.println("2");
			Statement statement= connection.createStatement();
		    System.out.println("3");
			statement.executeUpdate("insert into employee(`name`,`password`) values('"+employee.getUsername()+"','"+employee.getPassword()+"')");
		    System.out.println("4");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateEmployee(int id) {
		// TODO Auto-generated method stub
		try
        {    
            Connection con=ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter userid to update : ");
            int id1 = sc.nextInt();
            System.out.println("Enter new Password for user : ");
            String pass = sc.next();
            String q = "update `1111`.`login` set `password` = '"+pass+"' where id = '"+id1+"'";
            statement.executeUpdate(q);
            System.out.println("Password updated sucessfully");
        }
         
        catch (Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		try
        {    
            Connection con=ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter userid to delete: ");
            int id = sc.nextInt();
            String q = "delete from `1111`.`login` WHERE id = '"+id+"'";
            statement.executeUpdate(q);
            System.out.println("Data deleted from the database");
        }
         
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

}
