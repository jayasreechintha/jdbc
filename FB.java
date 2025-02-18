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

public class FB extends BaseClass{
	@BeforeClass
	private void bc() {
		EdgeBrowser();
		launchUrl("https://www.facebook.com//");
		maxwindow();

	}
	@AfterClass
	private void ac() {
		

	}
	@Test
	private void tc1() throws Exception {
		String url = "jdbc:mysql://localhost:3306/std_data";
		String name ="root" ;
		String pwd ="2000";
		String query ="select * from facebook where username='ram@gmail.com';";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String user = rs.getString(1);
		String pass = rs.getString(2);
		System.out.println(user);
		
		WebElement n = driver.findElement(By.xpath("//input[@name='email']"));
		//sendvalues(n, user);
		n.sendKeys(user);
		
//		WebElement p = driver.findElement(By.xpath("//input[@name='pass']"));
//		sendvalues(p, pass);

	}
	

}
