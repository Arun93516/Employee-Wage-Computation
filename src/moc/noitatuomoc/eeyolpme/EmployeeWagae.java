package moc.noitatuomoc.eeyolpme;

import java.util.Random;

public class EmployeeWagae {

	public static void main(String[] args) {

		System.out.println("Welcome to LineComparison ComputationProgram on Master Branch");

		int PerhourWage = 20;
		int FullDay = 8;
		int Salary = 0;
		int HalfDay = 4;
		int WorkingDayPerMonth = 20;
		int monthlySalary = 0;
		int WorkingHourPerMonth = 0;
		int Days = 1;

		Random random = new Random();
		int randomNumber = random.nextInt(3);

		while (Days != 20 && WorkingHourPerMonth != 100) {

			switch (randomNumber) {
			case 1:
				System.out.println("Employee is present Full Day  ");
				Salary = PerhourWage * FullDay;
				WorkingHourPerMonth = WorkingHourPerMonth + FullDay;
				break;
			case 2:
				System.out.println("Employee is Working Half Day only ");
				WorkingHourPerMonth = WorkingHourPerMonth + HalfDay;
				Salary = PerhourWage * HalfDay;
				break;
			case 0:
				System.out.println("Employee is Absent Today ");
			}

			monthlySalary = monthlySalary + Salary;
			System.out.println("Day " + Days + " : " + Salary);
			Days++;
		}

		System.out.println("Employee Monthly Salary is : " + monthlySalary);
	}
}
