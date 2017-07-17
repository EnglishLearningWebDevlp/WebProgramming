package service;

import bean.AddresslistEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by 2089769600 on 2017/7/17.
 */
public class AddressServiceImp implements AddressService{
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(AddresslistEntity al) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(al);
        tx.commit();
    }
    @Override
    public List getALL(){
           String hql = "from AddresslistEntity";

            return getSession().createQuery(hql).list();

    }
    public Session getSession() {

        return sessionFactory.openSession();

    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
