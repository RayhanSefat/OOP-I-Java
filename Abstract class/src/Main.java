
class Main {
  public static void main(String[] args) {
    CollegeStudent student1 = new CollegeStudent("Rafid", 1969, "Chattogram College");
    student1.examSystem();
    
    UndergradStudent student2 = new UndergradStudent("Nafis", 1963, "University pf Dhaka", "Software Engineering");
    student2.examSystem();
    
    GraduateStudent student3 = new GraduateStudent("Tumpa", 1958, "Machine Learning", "Dr. APJ Abdul Kalam");
    student3.examSystem();
  }
}
