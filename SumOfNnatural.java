import java.util.Scanner;

//Find the Sum of N Natural Numbers in Java
//user input type

public class SumOfNnatural {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i =1; i<=n; i++)
			sum += i;
		System.out.println(sum);	
	}
}
