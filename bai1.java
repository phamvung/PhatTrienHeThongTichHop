import java.util.Scanner;

public class bai1{
    
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        chuoi = scanner.nextLine();

        System.out.println(chuoi.toUpperCase());
    }
}