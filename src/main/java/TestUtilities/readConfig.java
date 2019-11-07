package TestUtilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class readConfig
{
	
	
	Properties pro;
	public readConfig()
	{
	FileInputStream file =null;
	try {
		file=new FileInputStream("D:\\Maven1\\config.properties");
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
		
		pro=new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
					e.printStackTrace();
					System.out.println("error"+e.getMessage());
		}
	}


		public String geturl()
		{
			String baseurl=pro.getProperty("url");
			return baseurl;
		}
		public String getusername()
		
		{
			String username=pro.getProperty("user");
			return username;
		}
		
		public String getpassword()
		{

		String password=pro.getProperty("pwd");
		return password;
	    }
		public String getpath()
		{
			String chromepath=pro.getProperty("path");
			return chromepath;
			
		}
		public String getFirstname()
		{
			String firstname=pro.getProperty("fname");
			return firstname;
		}
		public String getLastname()
		{
			String lastname=pro.getProperty("lname");
			return lastname;
		}
		public String getImagepath()
		{
			String photo=pro.getProperty("photo");
			return photo;
		}
}
