import java.util.Scanner;

public class bai5 {
    private static Integer a[];
    private static int n;
    public static void main(String[] args) {
        
        taomang();
        tong();
    }
    public static void taomang(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập số phần tử:");
        n=nhap.nextInt();
        a=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=new Integer(nhap.nextInt());
        }
    }
    public static void tong(){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                s=s+a[i];
            }
        }
        System.out.println("Tổng số nguyên dương là: "+s);
    }
}
