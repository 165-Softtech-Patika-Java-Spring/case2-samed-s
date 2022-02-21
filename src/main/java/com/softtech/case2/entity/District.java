package com.softtech.case2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {

    @Id
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "PROVINCE_ID")
    private Long provinceId;
}
