package test1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

// ��ΪԶ�̶�����õĽӿڣ�����̳�Remote��
public interface PersonService extends Remote {
    public List<PersonEntity> GetList() throws RemoteException;
}
