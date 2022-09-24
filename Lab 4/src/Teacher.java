public class Teacher extends Person {
	private String role;
	
	public Teacher(String givenName, String familyNamed, String role) {
		super (givenName, familyNamed);
		this.role = role;
	}
}
