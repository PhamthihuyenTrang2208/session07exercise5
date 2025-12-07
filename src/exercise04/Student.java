package exercise04;

public class Student {
    private String name;
    private String Class;
    private int age;
    private double avgScore;
    public Student(String  name, int age, String Class, double avgScore) {
        this.name = name;
        this.Class = Class;
        this.age = age;
        this.avgScore = avgScore;

    }

    public String getName() {
        return name;
    }
     public String getclass(){
    return Class;
  }
  public int getAge() {
        return age;
  }
  public double getAvgScore() {
        return avgScore;
  }
    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + Class + ", Điểm trung bình: " + avgScore;
    }

}
