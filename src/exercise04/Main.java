package exercise04;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter min score: ");
        int min = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter max score: ");
        int max = scan.nextInt();
        Student[] studentArray=new Student[5];
        studentArray[0]=new Student("Alice",20,"A1",8.5);
        studentArray[1] = new Student("Bob", 21, "A1", 7.0);
        studentArray[2] = new Student("Charlie", 19, "A2", 9.0);
        studentArray[3] = new Student("David", 22, "A2", 6.5);
        studentArray[4] = new Student("Eve", 20, "A1", 8.0);
        System.out.println("Danh sách sinh viên có điểm trung bình từ " + min + " đến " + max + ":");
        for(Student student:studentArray){
            if(student.getAvgScore()>=min && student.getAvgScore()<=max) {
                System.out.println(student);
            }
        }scan.close();
    }
}
