import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		RationalNumber num1 = new RationalNumber();
		RationalNumber num2 = new RationalNumber();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the numerator of the first ratonal number: ");
		num1.numerator = sc.nextInt();
		System.out.print("Enter the denominator of the first ratonal number: ");
		num1.denominator = sc.nextInt();
		System.out.print("Enter the numerator of the second ratonal number: ");
		num2.numerator = sc.nextInt();
		System.out.print("Enter the denominator of the second ratonal number: ");
		num2.denominator = sc.nextInt();
		
		RationalNumber sum = new RationalNumber();
		sum = sum.add(num1, num2);
		System.out.println(num1.numerator+"/"+num1.denominator+" + "+num2.numerator+"/"+num2.denominator+" = "+sum.numerator+"/"+sum.denominator);
		
		RationalNumber sub = new RationalNumber();
		sub = sub.subtract(num1, num2);
		System.out.println(num1.numerator+"/"+num1.denominator+" - "+num2.numerator+"/"+num2.denominator+" = "+sub.numerator+"/"+sub.denominator);
		
		RationalNumber pod = new RationalNumber();
		pod = pod.multiply(num1, num2);
		System.out.println(num1.numerator+"/"+num1.denominator+" * "+num2.numerator+"/"+num2.denominator+" = "+pod.numerator+"/"+pod.denominator);
		
		RationalNumber div = new RationalNumber();
		div = div.divide(num1, num2);
		System.out.println(num1.numerator+"/"+num1.denominator+" / "+num2.numerator+"/"+num2.denominator+" = "+div.numerator+"/"+div.denominator);
		
		RationalNumber num3 = new RationalNumber();
		System.out.print("Enter the numerator of the ratonal number to be represented by string: ");
		num3.numerator = sc.nextInt();
		System.out.print("Enter the denominator of the ratonal number to be represented by string: ");
		num3.denominator = sc.nextInt();
		RationalNumber st = new RationalNumber();
		st = st.stringRepresntation(num3);
		System.out.println("String format: "+st.STR);
		
		RationalNumber num4 = new RationalNumber();
		System.out.print("Enter the numerator of the ratonal number to be represented by floating point format: ");
		num4.numerator = sc.nextInt();
		System.out.print("Enter the denominator of the ratonal number to be represented by floating point format: ");
		num4.denominator = sc.nextInt();
		RationalNumber ft = new RationalNumber();
		ft = st.stringRepresntationFloat(num4);
		System.out.println("Floating point format: "+ft.STR);
	}
}
