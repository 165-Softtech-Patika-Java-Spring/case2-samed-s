package com.softtech.case2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PROVINCE")
@Getter
@Setter
public class Province {

    @Id
    @SequenceGenerator(name = "Province", sequenceName = "PROVINCE_ID_SEQ")
    @GeneratedValue(generator = "Province")
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "PLATE")
    private Long plate;

    @Column(name = "COUNTRY_ID")
    private Long countryId;
}
