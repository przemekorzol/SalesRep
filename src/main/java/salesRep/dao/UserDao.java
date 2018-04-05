package salesRep.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import salesRep.model.User;

import java.util.List;

public class UserDao {
    public List<User> getUser() {
        Session session = DatabaseSession.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Query query = session.createQuery("FROM person WHERE profession='DIRECTOR'");
        List people = query.list();
        t.commit();

        return people;
    }
    public void putMovie(User u) {
        Session session = DatabaseSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(u);

        transaction.commit();
        session.close();
    }
}
