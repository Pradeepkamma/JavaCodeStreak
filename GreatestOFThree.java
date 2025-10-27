
//Find the Greatest Number Among Three Numbers in Java

public class GreatestOFThree {

	public static void main(String[] args) {
		int num1 = 20, num2 = 6, num3 = 267;
		
		if (num1 >= num2 && num1 >= num3)
			System.out.println (num1 + " is the greater");
		
		else if (num2 >= num1 && num2 >= num3)
			System.out.println (num2 + " is the greater");
		
		else if (num3 >= num1 && num3 >= num2)
		System.out.println (num3 + " is the greater");
		//else
		//System.out.println (num3 + " is the greater");



	}

}

