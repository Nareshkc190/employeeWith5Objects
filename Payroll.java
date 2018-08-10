package employee;

public class Payroll {
	
	public static double calculatePay(Employee current){
		double salary;
		if(current.payRate == "yearly"){
			salary = ((current.salary/52) * 2);
		}
		else if(current.payRate == "yearly"){
			salary = (current.salary * current.hours * 2);
		}
		else
			salary = 0.0;
		
		return salary;
	}
	
	

	public static void main(String[] args) {
		
		Employee john = new Employee("John Doe", 12345, 250000.00,"hourly", "July 16", "Associate",45);
		Employee clarissa = new Employee("Clarissa Martinez", 190000.00,"yearly", "July 16", "Associate");
		Employee son = new Employee("Son rossy", 24000.00,"yearly", "July 6", "Associate");
		Employee reeta = new Employee("Reeta magar", 50000.00,"yearly", "July 1", "Associate");
		Employee mike = new Employee("Mike Hannigan", 70000.00,"yearly", "July 23", "Associate");
//		System.out.println(employee2.toString());
//		System.out.println("\n");
//		System.out.println(calculatePay(employee1));
//		System.out.println(calculatePay(employee2));
//		compareSalary(employee1, employee2);
//		Employee.compareSalary1(employee2, employee1);
//		employee1.compareSalary(employee2);
//	System.out.println(john.toString() + "\n");

		Employee[] arrayEmployee = new Employee[5];
		arrayEmployee[0] = john;
		arrayEmployee[1] = clarissa;
		arrayEmployee[2] = son;
		arrayEmployee[3] = reeta;
		arrayEmployee[4] = mike;
		
		for(Employee employee: arrayEmployee){
			System.out.println(employee);
		}

		
		
		}

	 static void compareSalary(Employee employee1, Employee employee2) {
		 if(employee1.salary >employee2.salary)
				System.out.println("salary greater");
			else
				System.out.println("salary less");
		
	}
}