package com.RestFulApi.PhoneBookApiTaleas.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Users {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    @OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "up_fk",referencedColumnName = "id" )
    private List <PhoneNumber> phoneNumbers;
}