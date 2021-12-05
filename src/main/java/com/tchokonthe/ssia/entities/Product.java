package com.tchokonthe.ssia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author martin
 * @created on 23/11/2021 at 00:59
 * @project com.tchokonthe.ssia.entities
 * @email (martin.aurele12 @ gmail.com)
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    Currency currency;

}
