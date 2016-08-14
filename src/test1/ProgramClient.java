package test1;

import java.rmi.Naming;
import java.util.List;

public class ProgramClient {
    public static void main(String[] args) {
        try {
            //����Զ�̶���ע��RMI·����ӿڱ��������������һ��
            PersonService personService = (PersonService) Naming
                    .lookup("rmi://127.0.0.1:6600/PersonService");
            List<PersonEntity> personList = personService.GetList();
            for (PersonEntity person : personList) {
                System.out.println("ID:" + person.getId() + " Age:"
                        + person.getAge() + " Name:" + person.getName());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
