import java.lang.*;

 public class July18_4 {
 public static void main(String[] args)
 {
    String main_string = "Pytho";  
    if (main_string.length()%2 == 0)
    System.out.println(main_string.substring(0, main_string.length()/2));	
    else
    	System.out.println("null");
  } 
 }