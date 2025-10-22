package one;
import java.util.*;
public class LoginSystem {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		String username, password;
		String u="xyz@gamil.com",p="asd@1234";
		System.out.println("Enter Username: ");
		username=Sc.next();
		if(username.equals(u))
		{
			System.out.println("Correct Username");
			System.out.println("Enter Password :");
			password=Sc.next();
			if(password.equals(p))
			{
				System.out.println("Successfully Login");
			}
			else
			{
				System.out.println("Invalid Password");
			}
			}
			else 
			{
				System.out.println("Invalid username");
				
				
			
				
			
		}

	}

}
