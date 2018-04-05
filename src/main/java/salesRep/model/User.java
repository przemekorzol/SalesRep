package salesRep.model;

import salesRep.model.Clients;

import javax.persistence.*;
import java.util.List;

@Table
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;
    private String company;
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Clients> clientsList;
    private String name;
    private String lastname;

    public User() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

//    public List<Clients> getClientsList() {
//        return clientsList;
//    }
//
//    public void setClientsList(List<Clients> clientsList) {
//        this.clientsList = clientsList;
//    }
}
