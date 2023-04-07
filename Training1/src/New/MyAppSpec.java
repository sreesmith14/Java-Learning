import java.io.*;

class UserNotFoundException extends Exception
{
		public UserNotFoundException()
		{
			System.out.println("no user");
		}
}

class MyAppSpec
{
public static void main(String args[])throws IOException
	{
		try{
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
	
			}
			else
			{
				throw new UserNotFoundException();
			}
		}
			catch(UserNotFoundException ecc)
			{
			System.out.println(ecc);
			}
	}
}