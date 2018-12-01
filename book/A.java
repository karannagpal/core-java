import java.io.*;

public class A
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a character: ");
		char ch = (char)br.read();

		System.out.println("you entered: " + ch);
	}
}



