package service;
import bean.Addresslist;

import java.util.List;

/**
 * Created by 2089769600 on 2017/7/16.
 */
public interface Address {
    public void add(Addresslist al);
    public List<Addresslist> getAll();
}
