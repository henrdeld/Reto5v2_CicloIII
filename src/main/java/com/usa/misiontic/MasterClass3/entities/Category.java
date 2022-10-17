package com.usa.misiontic.MasterClass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Partyroom> partyrooms;

/*
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Library> partyrooms;

 */

    //@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    //@JsonIgnoreProperties("category")
    //private List<Reservas> reservas;


    public List<Partyroom> getPartyrooms() {
        return partyrooms;
    }

    public void setPartyrooms(List<Partyroom> partyrooms) {
        this.partyrooms = partyrooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idCategory) {
        this.id = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
