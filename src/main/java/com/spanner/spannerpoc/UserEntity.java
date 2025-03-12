package com.spanner.spannerpoc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "`user`")
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class UserEntity {

    @Id
    private String id;

    private String name;

    private Integer rollnumber;

    private Double mark;

    private Integer facility;


}
