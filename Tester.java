import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 9 * Math.pow(10.0, 9.0);
		System.out.println(num);
		
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		
		System.out.println("Enter first power");
		Scanner sc1 = new Scanner(System.in);
		double n2 = sc1.nextDouble();
	
		double sum1 = n1 * Math.pow(10, n2);
		
		System.out.println("Enter second number");
		Scanner sc2 = new Scanner(System.in);
		double n3 = sc2.nextDouble();
		
		System.out.println("Enter second power");
		Scanner sc3 = new Scanner(System.in);
		double n4 = sc3.nextDouble();
		
		double sum2 = n3 * Math.pow(10, n4);
		
		System.out.println("Enter length");
		Scanner sc4 = new Scanner(System.in);
		double temp = sc4.nextDouble();
		double n5 = temp*temp;
		
		double answer = num*(sum1*sum2)/n5;
		
		System.out.println("The force exerted: " + answer + "N");
	}
}
