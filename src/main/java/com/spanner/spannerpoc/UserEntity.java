package com.spanner.spannerpoc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "`user`")
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    private String id;

    private String name;

    private Integer rollnumber;

    private Double mark;

    private Integer facility;


}
