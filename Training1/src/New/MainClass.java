import java.io.*;

class MainClass
{
	public static void main(String args[])throws IOException
	{
		try{
		int x,y,z;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter x:");
		x= Integer.parseInt(br.readLine());
		System.out.println("Enter y:");
		y= Integer.parseInt(br.readLine());
		z=x+y;

		System.out.println("Z :" +z);
		}
		catch(NumberFormatException  nfe){
			System.out.println("Number form exce" +nfe);
			//nfe.printStackTrace();
		}
		catch(Exception ex){
			System.out.println("except");
			
			//nfe.printStackTrace();
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
