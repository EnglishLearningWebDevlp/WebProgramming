package service;
import bean.AddresslistEntity;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by 2089769600 on 2017/7/17.
 */
public interface AddressService {
    public void add(AddresslistEntity al);
    public void delete(String Id);
    public void update(String Id,String Name,String Phone);
    public List getALL();

    public List FindByPhone(String phone);

}
