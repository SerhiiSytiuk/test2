package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="year_of_production")
    private int yearOfProduction;

    @ManyToOne
    @JoinColumn(name="director_id", referencedColumnName = "id")
    private Director owner;

    public Movie() {}

    public Movie(String name, int yearOfProduction, Director owner) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
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

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Director getOwner() {
        return owner;
    }

    public void setOwner(Director owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", owner=" + owner +
                '}';
    }
}
