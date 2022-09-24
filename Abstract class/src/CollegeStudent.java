class CollegeStudent extends Student {
  private String collegeName;
  
  public CollegeStudent(String name, int birthYear, String collegeName){
    super(name, birthYear);
    this.collegeName = collegeName;
  }
  
  //override
  public void examSystem(){
    System.out.println("Hello, " + this.name + "!");
    System.out.println("You will have to attend written exams only. You don't have any continous asessment.\n");
  }
}
