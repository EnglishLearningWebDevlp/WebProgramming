package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;
import bean.Addresslist;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by 2089769600 on 2017/7/16.
 */
public class AddressAction extends ActionSupport{
    private String name;
    private String phone;


    private AddressImpl address;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String add()
    {
        Addresslist al = new Addresslist();
        al.setName(getName());
        al.setPhone(getPhone());
        address.add(al);
        return SUCCESS;
    }
    private Map<String, Object> request;
    public List<Addresslist> getAll(){
        return address.getAll();
    }
    public String list() {
        if(address==null){
          System.out.println(1);
           request.put("address",address.getAll());
        }
        return "list";
    }



    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }
    public void setAddress(AddressImpl address) {
        this.address = address;
    }

}
