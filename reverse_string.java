import java.util.Scanner;
public class reverse_string{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		String reversed="";
 		for(int i =str.length()-1;i>=0;i--){
		reversed+=str.charAt(i);
              }
              System.out.print("Reversed String is:"+reversed);
       }
}