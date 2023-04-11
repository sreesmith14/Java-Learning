package com.deda.Exception;
 import java.io.*;
import com.deda.MainClass;
/*class UserException1 extends Exception{

	public UserException1() {
		System.out.println("no user");
	}
}*/

public class UserException extends Exception
{
	public UserException()
	{
		System.out.println("From UNF Exception");
		/*try{
			String username,password;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username:");
			username= br.readLine();
			System.out.println("Enter Password:");
			password= br.readLine();
			if (username.equals ("zebronics") && password.equals("admin"))
			{
				System.out.println("Hi Zeb " +username);
				MainClass mc = new MainClass();
				mc.main(args);

			}
			else
			{
				throw new UserException1();
			}
		}
			catch(UserException1 ecc)
			{
			System.out.println(ecc);
			}
	*/}
}

