package salesRep.model;

import javax.persistence.*;
@Table
@Entity(name="clients")
public class Clients {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated
    private ClientType clientType;
    private String city;
    private String street;
    @OneToOne(fetch = FetchType.EAGER)
    private User salesRep;

    public Clients() {
    }
    public User getSalesRep() {
        return salesRep;
    }

    public void setSalesRep(User salesRep) {
        this.salesRep = salesRep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    // TO DO
}
