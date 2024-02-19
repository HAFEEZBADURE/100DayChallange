package DSA_JAVA_DAY_1_4_TypeConversion;

public class TypeConversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float myFloat = 5;
		System.out.println(myFloat);

		int myInt = (int) 5.0f;
		System.out.println(myInt);

		double myDouble = 6;
		System.out.println(myDouble);

		long myLong = 10;
		System.out.println(myLong);

		long bug = 45;
		float dec = 3;
		double d = 3.5f;
		System.out.println(bug);
		System.out.println(dec);
		System.out.println(d);

//		exclicit
		int Myint1 = (int) 10.0;
		System.out.println(Myint1);

		int myDouble1 = (int) 10L;
		System.out.println(myDouble1);

		long Mylong1 = (long) 10.f;
		System.out.println(Mylong1);

		float eDec = (float) 3.4;
		long eBig = (long) 3.4;
		int eInt = (int) 3.4;

		System.out.println(eBig);
		System.out.println(eDec);
		System.out.println(eInt);

	}
}
