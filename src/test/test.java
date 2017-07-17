package test;

import bean.AddresslistEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AddressService;
import service.AddressServiceImp;

/**
 * Created by 2089769600 on 2017/7/17.
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        AddressServiceImp ail = (AddressServiceImp) ac.getBean("address");
        AddresslistEntity al = new AddresslistEntity();
        al.setName("kaka");
        al.setPhone("6666633");
        System.out.println(ail.getALL().size());
    }
}
