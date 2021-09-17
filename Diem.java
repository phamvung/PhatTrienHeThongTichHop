import java.util.Scanner;

public class Diem {
    private static int x;
    private static int y;
    public Diem(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    
    public static void nhap(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        x=nhap.nextInt();
        System.out.println("Nhập tọa độ y: ");
        y=nhap.nextInt();
    }

    public static double khoangcach(){
        double kc;
        kc=Math.sqrt(x*x+y*y);
        return kc;
    }

    public static void main(String[] args) {
        Diem a=new Diem(2, 3);      
        System.out.println("Tọa độ ("+x+","+y+")");
        System.out.println("Khoảng cách đến gốc tọa độ: "+khoangcach());
        nhap();
        System.out.println("Tọa độ ("+x+","+y+")");
        System.out.println("Khoảng cách đến gốc tọa độ: "+khoangcach());
    }
}
