class UndergradStudent extends Student {
  private String universityName;
  private String department;
  
  private void assignDetails(String universityName, String department){
    this.universityName = universityName;
    this.department = department;
  }
  
  public UndergradStudent(String name, int birthYear, String universityName, String department){
    super(name, birthYear);
    assignDetails(universityName, department);
  }
  
  //override
  public void examSystem(){
    System.out.println("Hello, " + this.name + "!");
    System.out.println("You will have to attend written exams for each course. Some courses have viva too. You will be continously evaluated according to your class performane.\n");
  }
}
