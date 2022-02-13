package com.tchokonthe.ssia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author martin
 * @created on 07/11/2021 at 19:01
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */


@Getter
@Setter
@Document("user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private int id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String username;

    private String password;

    private EncryptionAlgorithm algorithm;

    @DBRef
    private List<Authority> authorities;
}
