import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PTInterface extends Remote{

    public int soTu(String str) throws RemoteException;
    public String daonguoc(String str) throws RemoteException;
}