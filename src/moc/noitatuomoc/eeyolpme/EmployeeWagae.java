package moc.noitatuomoc.eeyolpme;

import java.util.Random;

public class EmployeeWagae {

	public static void main(String[] args) {
		System.out.println("Welcome to LineComparison ComputationProgram on Master Branch");
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		if (randomNumber == 1)
			System.out.println("Employee is present Today ");
		else
			System.out.println("Employee is Absent Today ");
	}

}
