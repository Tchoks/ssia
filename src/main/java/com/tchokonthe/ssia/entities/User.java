package com.tchokonthe.ssia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author martin
 * @created on 07/11/2021 at 19:01
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;


    @Enumerated(EnumType.STRING)
    private EncryptionAlgorithm algorithm;


    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorities;
}
