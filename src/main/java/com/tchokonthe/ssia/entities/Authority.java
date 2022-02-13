package com.tchokonthe.ssia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author martin
 * @created on 23/11/2021 at 00:23
 * @project com.tchokonthe.ssia.entities
 * @email (martin.aurele12 @ gmail.com)
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("authority")
public class Authority {


    @Id
    private Integer id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String name;

}
