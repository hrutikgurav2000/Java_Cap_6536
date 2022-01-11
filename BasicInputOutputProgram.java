import java.util.Scanner;

public class BasicInputOutputProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		float salary;
		String city;
		
		System.out.print("Enter your name: ");
		name= sc.next().toString();
		System.out.print("Enter your age: ");
		age= sc.nextInt();
		System.out.print("Enter your salary: ");
		salary= sc.nextFloat();
		System.out.print("Enter your City: ");
		city= sc.next().toString();
		System.out.print(name);
		System.out.print(age);
		System.out.print(salary);
		System.out.print(city);
	}

}
