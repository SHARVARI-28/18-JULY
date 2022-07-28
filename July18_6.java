import java.util.Scanner;

public class July18_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		
		if(s1.length() > s2.length()) {
			System.out.println(s2+s1+s2);
		}

		else {
			System.out.println(s1+s2+s1);
		}
	}
}