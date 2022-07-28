import java.util.Scanner;

public class July18_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		if(s1.charAt(0) == 'x' && s1.charAt(s1.length()-1) == 'x') {
			System.out.println(s1.substring(1,s1.length()-1));
		}
		
		else
			System.out.println(s1);

	}

}