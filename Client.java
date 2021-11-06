import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client{
    public static void main(String[] args) throws NotBoundException {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(5555);
            PTInterface pti=(PTInterface) reg.lookup("PhuongThuc");
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhap chuoi:");
            String str=sc.nextLine();
            
            if (str.equals("exit")) {
                System.out.println("Exit!!!");
            } else {
                System.out.println("1.Dem so tu \n2.Dao nguoc chuoi");
                int chon;
                System.out.println("Chon phuong thuc:");
                while(true){
                chon=sc.nextInt();
                    if(chon != 0){
                        if(chon>=1 && chon<=2){
                            switch (chon) {
                                case 1:
                                    System.out.println("So tu:"+pti.soTu(str));
                                    break;
                                case 2:
                                    System.out.println("Chuoi dao nguoc:"+pti.daonguoc(str));
                                    break;
                            }
                        }else{
                            System.out.println("Chon 1 trong 2 phuong thuc");
                        }
                    }
                else{
                    System.out.println("Exit!!!");
                }
            }
        }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}