package com.softtech.case2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {

    @Id
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long id;

    @Column(name = "BUILDING_NO", length = 10)
    private String buildingNo;

    @Column(name = "APARTMENT_NO")
    private int apartmentNo;

    @Column(name = "STREET_ID")
    private Long streetId;
}
