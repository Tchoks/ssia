package com.tchokonthe.ssia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author martin
 * @created on 23/11/2021 at 00:23
 * @project com.tchokonthe.ssia.entities
 * @email (martin.aurele12 @ gmail.com)
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Authority {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
}
