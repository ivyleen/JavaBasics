import java.util.Scanner;

public class BasicExersices {
	
	public static void main (String[] args)	{
		
		// ex 1
		System.out.println("Write a program that prints all odd numbers between 0 and 50");

		for (int i = 1; i < 50; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("and all even numbers between 51 and 100");
				
		for(int i = 52; i <= 100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// ex2
		System.out.println("Write a program that prints all number that can be "
				+ "divided by 3 between a and b provided by operator in ascending order.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a.");
		int a = sc.nextInt();
		System.out.println("Enter b.");
		int b = sc.nextInt();
		
		int min, max;
		min = a;
		max = b;
		if ( a > b) {
			min = b;
			max = a;
		}
		
		for ( int i = min; i < max; i++) {
			if ( i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// ex3
		System.out.println("Write a program that tells if a number is prime.");
		
		System.out.println("Enter number.");
		int number = sc.nextInt();
		boolean isItPrime = true;
		
		for ( int i = 2; i < number; i++) {
			if ( number % i == 0)
			{
				isItPrime = false;
				break;
			}
		}
		
		if (isItPrime){
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is not prime.");
		}
		
		// ex 4
		System.out.println("Write a program that reads a positive number "
				+ "and writes its binary representation.");
		int decimal = 0;
		do {
			System.out.println("It needs to be positive.");
			decimal = sc.nextInt();
		} while (decimal < 0);
		int devided = decimal;
		long binary = 0L, multiplier = 1;
		
		for (int i = 0; i < decimal; i++) {
			binary = binary + multiplier*(devided%2);
			devided /= 2;			
			multiplier*=10;
		}
		
		System.out.println(binary);
		System.out.println("For check: ");
		System.out.println(Integer.toBinaryString(decimal));
		
		// ex 5
		System.out.println("Write a program that reads a short positive number"
				+ "and tells how many bits are 1 in it.");
		
		short chosenNumber = 0, counter = 0;
		do {
			System.out.println("It needs to be positive.");
			chosenNumber = sc.nextShort();
		} while (chosenNumber < 0);
		
		short dev = chosenNumber;
		for (int i = 0; i < chosenNumber; i++) {
			if (dev % 2 == 1)
			{
				counter++;
			}
			dev /= 2;			
		}
		
		System.out.println("Counter: " + counter);
		System.out.println("For check: ");
		System.out.println(Integer.toBinaryString(chosenNumber));
		
	}

}
