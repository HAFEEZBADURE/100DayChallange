package statements;

public class If_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 9;
		if (age < 10) {
			System.out.println("Kid");
		} else if (age >= 13 && age < 20) {
			System.out.println("Teenager");
		} else if (age >= 25 && age < 50) {
			System.out.println("adult");
		} else if (age >= 50 && age < 100) {
			System.out.println("old age");
		} else {
			System.out.println("Uncategorized"); 
		}
	}

}
