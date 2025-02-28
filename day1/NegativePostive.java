import java.util.Scanner;
public class NegativePostive{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int num = sc.nextInt();
    //Condition to check if the number is negative or postive
		if (num > 0)
			System.out.println("The Number is Positive");
    else if (num < 0)
      System.out.println("The Number is Negative");
    else
      System.out.println("Zero");
  }
}
