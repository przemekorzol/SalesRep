package salesRep.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import salesRep.dao.DatabaseSession;
import salesRep.model.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
//        user.setClientsList(null);
        user.setCompany("Real");
        user.setLogin("ty");
        user.setPassword("a");
        user.setName("a");
        user.setLastname("a");
        SessionFactory sessionFactory = DatabaseSession.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
