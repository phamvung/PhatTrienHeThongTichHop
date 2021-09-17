import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class bai3 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextFloat();
        System.out.println("Nhập b:");
        b = sc.nextFloat();
        System.out.println("Nhập c:");
        c = sc.nextFloat();
        ptbac2(a,b,c);
    }
    public static void ptbac2(float a,float b, float c){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phương trình vô số nghiệm");
                }
                else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else{
                System.out.println("Phương trình có 1 nghiệm "+ (-c/b));
            }
        }
        else{
            float d,x1,x2;
            d=(b*b-4*a*c);
            x1=(float)((-b+Math.sqrt(d))/2*a);
            x2=(float)((-b-Math.sqrt(d))/2*a);
            if(d>0){
                System.out.println("Phương trình có 2 nghiệm x1:" + x1 + " x2:"+x2);
            }
            else if(d==0){
                System.out.println("Phương trình có nghiệm kép x1= x2= "+x1);
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
