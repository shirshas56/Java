import java.util.Scanner;
public class backward_mid_pyramid{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows: ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=n;j<=n-i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
		System.out.print(" *");
		}
		System.out.println();
	 	}
		sc.close();
	}
}

