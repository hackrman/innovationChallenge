package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="card_spot")
public class Spot {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="spot_id")
	private int spotId;
	private String spotName;
	private String spotStatus;

	@ManyToOne
	private Row row;

    public Spot() {
  
    }


}