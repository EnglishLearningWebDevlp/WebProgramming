package action;

import org.apache.struts2.interceptor.RequestAware;
import service.AddressServiceImp;
import bean.AddresslistEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by 2089769600 on 2017/7/17.
 */
public class AddressAction implements RequestAware {


    public void setAddress(AddressServiceImp address) {
        this.address = address;
    }

    @Autowired
    private AddressServiceImp address;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String addTo() {
        AddresslistEntity al = new AddresslistEntity();
        al.setName(getName());
        al.setPhone(getPhone());
        address.add(al);
        return SUCCESS;
    }
    public String ToDelete(){
        address.delete(getId());
        return SUCCESS;
    }
    public String ToUpdate(){
        address.update(getId(),getName(),getPhone());
        return SUCCESS;
    }

    String name;
    String phone;
    String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private Map<String, Object> request;
    @Override
    public void setRequest(Map<String, Object> map) {
        this.request=map;
    }
   public String list(){
        request.put("address",address.getALL());
        return SUCCESS;
   }
   public String queryByPhone(){
       request.put("item",address.FindByPhone(getPhone()));
       return SUCCESS;
   }
}
