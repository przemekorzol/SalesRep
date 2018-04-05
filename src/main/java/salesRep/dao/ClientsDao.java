package salesRep.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import salesRep.model.Clients;

import java.util.List;

public class ClientsDao {
    public List<Clients> getAllClients(){
        Session session = DatabaseSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Clients.class);
        List<Clients> clientsList = criteria.list();

        transaction.commit();

        return clientsList;
    }

    public void putMovie(Clients c) {
        Session session = DatabaseSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(c);

        transaction.commit();
        session.close();
    }
}
