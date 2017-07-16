package test;


import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

/**
 * Created by 2089769600 on 2017/7/16.
 */
public class test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        Address ail = (AddressImpl)ac.getBean("address");
        Addresslist al = new Addresslist();
        al.setName("kaka");
        al.setPhone("123456123");
        ail.add(al);
    }
}
