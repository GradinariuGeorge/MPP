package mppcurse.curse.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.rmi.Remote;
@Entity
@Table(name = "operatori")
public class Operatori implements Serializable,Remote{
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "user")
    private String user;
    @Column(name = "pass")
    private String pass;

    public Operatori() {}

    public Operatori(int id, String nume, String user, String pass) {
        this.id = id;
        this.nume = nume;
        this.user = user;
        this.pass = pass;
    }
    public Operatori( String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
