import java.util.Scanner;

public class July18_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =0;
		
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		char c[] = s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			if(c[i] == '*') {
				n=i;
			}
		}
		
		System.out.println(s1.substring(0,n-1)+s1.substring(n+2,s1.length()));
	}

}