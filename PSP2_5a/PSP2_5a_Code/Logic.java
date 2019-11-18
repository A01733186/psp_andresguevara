// Logic.java
import java.util.Scanner;

public class Logic {
	static Scanner input = new Scanner(System.in);
	static SimpsonIntegration integral = new SimpsonIntegration();
	private int n = 0;

	public void logic1a() {

		Output myOut = new Output();
		double result = getUserInput();

		myOut.writeData("out3.txt", "Result = " + result);
	}

	public static double getUserInput() {
		System.out.println("Enter the number of segments");
		int seg = input.nextInt();
		System.out.println("Enter the value of e");
		double e = input.nextDouble();
		System.out.println("Enter the value of dof");
		double dof = input.nextInt();
		System.out.println("Enter the value of x");
		double x = input.nextDouble();
		double result = integral.integrate(seg, e, dof, x);
		return result;
	}

}
