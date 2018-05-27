package mppcurse.curse.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.rmi.Remote;
@Entity
@Table(name = "cursa")
public class Curse implements Serializable,Remote {


    @Id
    private int id;
    @Column(name = "cap")
    private int cap;
    @Column(name="nrPart")
    private int nrPart;
    public Curse() { }
    public Curse(int id, int cap, int nrPart)  {
        this.id = id;
        this.cap = cap;
        this.nrPart = nrPart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getNrPart() {
        return nrPart;
    }

    public void setNrPart(int nrPart) {
        this.nrPart = nrPart;
    }

    @Override
    public String toString() {
     /*  StringBuilder friendsString=new StringBuilder();
        for (User user : friends){
            friendsString.append(user.getName());
            friendsString.append(", ");
        }*/
        return "Cursa{" +
                "id='" + id + '\'' +
                ", cap='" + cap + '\'' +
                 ", nrPart='"+nrPart+'\''+
                '}';
    }
}
