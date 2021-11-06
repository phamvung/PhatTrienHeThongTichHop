import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Server{
    public static void main(String[] args) {
        try{
            PhuongthucImpl obj= new PhuongthucImpl();
            System.out.println("Khoi tao doi tuong phuongthuc thanh cong");
    
            LocateRegistry.createRegistry(5555);
            Registry reg=LocateRegistry.getRegistry(5555);
            reg.bind("PhuongThuc", obj);
            System.out.println("Da dang ki thanh cong doi tuong");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}