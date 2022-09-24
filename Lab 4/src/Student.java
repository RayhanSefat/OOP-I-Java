public class Student extends Person {
	private int currentYear;
	
	public Student(String givenName, String familyNamed, int currentYear) {
		super(givenName, familyNamed);
		this.currentYear = currentYear;
	}
}
