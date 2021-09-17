import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n:");
        n=sc.nextInt();
        tong(n);
    }
    public static void tong(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
        }
        System.out.println("Tổng từ 1 tới "+ n +" là: "+ s);
    }
}
