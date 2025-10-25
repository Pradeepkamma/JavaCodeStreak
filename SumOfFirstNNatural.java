//Find the Sum of First N Natural Numbers in Java
//Method1 
public class SumOfFirstNNatural {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		
		for(int i=1;i<=n;i++)
			sum += i;
		System.out.println(sum);
	}
}

//Method 2 : Using Formula for the Sum of Nth Term
public class Main {
  public static void main (String[]args) {
    int n = 10;
    System.out.println ( n*(n+1)/2);
  }
}
