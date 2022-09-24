class GraduateStudent extends Student implements Repeater {
  private String researchTopic;
  private String supervisorName;
  
  private void assignDetails(String researchTopic, String supervisorName){
    this.researchTopic = researchTopic;
    this.supervisorName = supervisorName;
  }
  
  public GraduateStudent(String name, int birthYear, String researchTopic, String supervisorName){
    super(name, birthYear);
    assignDetails(researchTopic, supervisorName);
  }
  
  //override
  public void examSystem(){
    System.out.println("Hello, " + this.name + "!");
    System.out.println("You will not have to attend any written exam. Some courses have viva. You have to submit your research paper before the deadline.\n");
  }

  @Override
  public int setFrequency() {
	  // TODO Auto-generated method stub
	  return 0;
  }
}
