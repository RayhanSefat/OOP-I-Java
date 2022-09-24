public class RationalNumber {
	public int numerator;
	public int denominator;
	public String STR;
	
	public RationalNumber add (RationalNumber num1, RationalNumber num2){
		RationalNumber sum = new RationalNumber();
		
		sum.numerator = num1.numerator*num2.denominator + num2.numerator*num1.denominator;
		sum.denominator = num1.denominator * num2.denominator;
		
		return sum;
	}
	
	public RationalNumber subtract (RationalNumber num1, RationalNumber num2){
		RationalNumber sub = new RationalNumber();
		
		sub.numerator = num1.numerator*num2.denominator - num2.numerator*num1.denominator;
		sub.denominator = num1.denominator * num2.denominator;
		
		return sub;
	}
	
	public RationalNumber multiply (RationalNumber num1, RationalNumber num2){
		RationalNumber pod = new RationalNumber();
		
		pod.numerator = num1.numerator*num2.numerator;
		pod.denominator = num1.denominator * num2.denominator;
		
		return pod;
	}
	
	public RationalNumber divide (RationalNumber num1, RationalNumber num2){
		RationalNumber div = new RationalNumber();
		
		div.numerator = num1.numerator*num2.denominator;
		div.denominator = num1.denominator * num2.numerator;
		
		return div;
	}
	
	public RationalNumber stringRepresntation(RationalNumber num1){
		RationalNumber s = new RationalNumber();
		
		s.STR = String.valueOf(num1.numerator) + "/" + String.valueOf(num1.denominator);
		
		return s;
	}
	
	public RationalNumber stringRepresntationFloat(RationalNumber num1){
		RationalNumber s = new RationalNumber();
		
		float fraction = (float)num1.numerator / (float)num1.denominator;
		s.STR = String.valueOf(fraction);
		
		return s;
	}
}
