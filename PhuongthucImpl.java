import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhuongthucImpl extends UnicastRemoteObject implements PTInterface{

    protected PhuongthucImpl() throws RemoteException {
        super();
    }
    
    public int soTu(String str){
        StringTokenizer st=new StringTokenizer(str);
        int dem=st.countTokens();
        return dem;
    }

    public String daonguoc(String str){
        StringBuffer sb= new StringBuffer(str);
        String kq=sb.reverse().toString();
        return kq;
    }

}