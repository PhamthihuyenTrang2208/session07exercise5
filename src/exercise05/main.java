package exercise05;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Product>List=new ArrayList<>();
        boolean check=true;
        do {
            System.out.printf("Menu:\n" +
                    "1: Thêm mới sản phẩm\n" +
                    "2: Hiển thị danh sách sản phẩm\n" +
                    "3: Cập nhật sản phẩm\n" +
                    "4: Xóa sản phẩm\n" +
                    "5: Thoát\n" +
                    "nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 5) {
                switch (choice) {
                    case 1:
                        Product p = new Product();
                        System.out.print("Nhập ID sản phẩm: ");
                        p.setId(sc.nextLine());
                        sc.nextLine();
                        System.out.print("Nhập tên sản phẩm: ");
                        p.setName(sc.nextLine());
                        System.out.print("Nhập giá sản phẩm: ");
                        p.setPrice(sc.nextDouble());
                        List.add(p);
                        System.out.println("Sản phẩm đã được thêm.");
                        break;
                    case 2:
                        if (List.size() == 0) {
                            System.out.println("Chưa có sản phẩm nào.");
                            break;
                        } else {
                            for (Product product : List) {
                                System.out.println(product);
                            }
                            break;

                        } case 3:
                            System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                            String  inputId = sc.nextLine();
                            sc.nextLine();
                            for (Product product : List) {
                                if(inputId==product.getId()){
                                    System.out.print("Nhập tên mới: ");
                                    product.setName(sc.nextLine());
                                    System.out.print("Nhập giá mới: ");
                                    product.setPrice(sc.nextDouble());
                                    System.out.println("Sản phẩm đã được cập nhật.");
                                }else{
                                    System.out.printf("không có sản phẩm nào có Id là "+inputId);

                                }

                            }break;
                            case 4:
                                System.out.println("Nhập ID cần xóa: ");
                                String inId=sc.nextLine();
                                sc.nextLine();
                                Iterator<Product> it=List.iterator();
                                while(it.hasNext()){
                                    Product product=it.next();
                                    if(inId==product.getId()){
                                        it.remove();
                                        System.out.println("Sản phẩm đã được xóa.");
                                    }
                                    else System.out.print("Không có sản phẩm nào có Id này");

                                }break;
                                case 5: default:
                                    System.out.println("Thoát chương trình...");
                                    System.exit(0);


                }
            }else{ check=false;
            System.out.print("Hãy nhập số hợp lệ từ 1 đến 5");}
        }
            while (check) ;

        }
}
