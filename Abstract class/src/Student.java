abstract class Student {
  protected String name;
  private int birthYear;
  
  public Student(String name, int birthYear){
    this.name = name;
    this.birthYear = birthYear;
  }
  
  public abstract void examSystem();
}
