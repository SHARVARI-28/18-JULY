import java.util.Scanner;

public class July18_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any String");
		String str = sc.nextLine();
		
		System.out.println(str.substring(1,(str.length()-1)));

	}

}