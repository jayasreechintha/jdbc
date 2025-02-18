package org.jdbe_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBook_example1 extends BaseClass{
	@BeforeClass
	private void bc() {
		// TODO Auto-generated method stub

	}
	@AfterClass
	private void ac() {
		// TODO Auto-generated method stub

	}
	@Test
	private void tc() throws Exception {
		String url = "jdbc:mysql://localhost:3306/std_data";
		String name ="root" ;
		String pwd ="2000";
		String query ="select * from facebook";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String s = rs.getString("username");
		System.out.println(s);
		
		driver.get("https://www.facebook.com/");
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='email']"));
		sendvalues(uname,s);

	}

}
