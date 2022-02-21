package com.softtech.case2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
public class Country {

    @Id
    @SequenceGenerator(name = "Country", sequenceName = "COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Country")
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "CODE", length = 20)
    private String code;

}
