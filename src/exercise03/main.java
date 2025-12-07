package exercise03;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        person person1 = new person();
        System.out.print("Enter the first people's name: ");
        person1.setName(input.nextLine());
        System.out.print("Enter the first people's age:");
        person1.setAge( input.nextInt());
        input.nextLine();
        person person2 = new person();
        System.out.print("Nhập tên người thứ hai: ");
        person2.setName(input.nextLine());
        System.out.print("Nhập tuổi người thứ hai: ");
        person2.setAge(input.nextInt());
        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lớn tuổi hơn " + person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName() + " lớn tuổi hơn " + person1.getName());
        } else {
            System.out.println("Cả hai người có cùng tuổi.");
        }

     input.close();}
}
