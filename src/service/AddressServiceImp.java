package service;

import bean.AddresslistEntity;
import org.apache.commons.lang3.ObjectUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
    public void delete(String Id) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.delete(get_By_Id(Id));
        tx.commit();
    }

    @Override
    public void update(String Id, String Name, String Phone) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        AddresslistEntity al=get_By_Id(Id);
        al.setName(Name);
        al.setPhone(Phone);
        s.update(al);
        tx.commit();
    }


    @Override
    public List getALL(){
           String hql = "from AddresslistEntity";

            return getSession().createQuery(hql).list();

    }
    @Override
    public List FindByPhone(String phone){
        String queryString="from AddresslistEntity as model where model.phone="+phone;
        Query query=getSession().createQuery(queryString);
     //   query.setString(0,phone);
        List<AddresslistEntity> ads=query.list();
        return ads;
    }
    public Session getSession() {

        return sessionFactory.openSession();

    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AddresslistEntity get_By_Id(String Id){
        String queryString="from AddresslistEntity as model where model.id="+Id;
        Query query=getSession().createQuery(queryString);
        //   query.setString(0,phone);

        return (AddresslistEntity) query.getSingleResult();
    }
}
