package moc.noitatuomoc.eeyolpme;

import java.util.Random;

public class EmployeeWagae {

	public static void main(String[] args) {
		System.out.println("Welcome to LineComparison ComputationProgram on Master Branch");

		int PerhourWage = 20;
		int FullDay = 8;
		int Salary = 0;
		int HalfDay = 4;

		Random random = new Random();
		int randomNumber = random.nextInt(3);
		switch (randomNumber) {
		case 1:System.out.println("Employee is present Full Day  ");
			Salary = PerhourWage * FullDay;
			break;
		case 2:System.out.println("Employee is Working Half Day only ");
			Salary = PerhourWage * HalfDay;
			break;
		case 0:System.out.println("Employee is Absent Today ");
		}
	System.out.println("Employee Salary is :" + Salary);
}
}