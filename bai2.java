import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên:");
        x = scanner.nextInt();
        if(ktsont(x)){
            System.out.println(x +" là số nguyên tố");
        }
        else{
            System.out.println(x +" không phải số nguyên tố");
        }
    }
    public static boolean ktsont(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x % i == 0){
                return false;
            }
            return true;
        }
        return false;
    }
}
