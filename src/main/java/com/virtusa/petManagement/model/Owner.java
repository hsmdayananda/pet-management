package com.virtusa.petManagement.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OWNER")
public class Owner implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="ownerName")
    private String ownerName;

    @Column(name="ownerMobile")
    private String ownerMobile;

    @Column(name="ownerCity")
    private String ownerCity;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "id")
    private List<Pet> petData = new ArrayList<Pet>();

    public List<Pet> getPetData() {
        return petData;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", ownerMobile='" + ownerMobile + '\'' +
                ", ownerCity='" + ownerCity + '\'' +
                ", petData=" + petData +
                '}';
    }

    public void setPetData(List<Pet> petData) {
        for(Pet pet:petData){
            pet.setOwner(this);
        }

        this.petData = petData;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerCity() {
        return ownerCity;
    }

    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity;
    }

    public String getOwnerMobile() {
        return ownerMobile;
    }

    public void setOwnerMobile(String ownerMobile) {
        this.ownerMobile = ownerMobile;
    }
}
