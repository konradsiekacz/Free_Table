package com.freetable.freetable.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservationList;
}
