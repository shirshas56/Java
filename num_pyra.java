import java.util.Scanner;
public class num_pyra{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows: ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		System.out.println();
	   }
	    sc.close();
	}
}