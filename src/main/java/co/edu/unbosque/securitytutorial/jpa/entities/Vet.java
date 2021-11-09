package co.edu.unbosque.securitytutorial.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Vet")
@PrimaryKeyJoinColumn
public class Vet extends UserApp {

    @Column(name = "name", nullable = false)
    private String name;

    public Vet() {
    }

    public Vet(String username, String password, String email, String name) {
        super(username, password, email, "vet");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
