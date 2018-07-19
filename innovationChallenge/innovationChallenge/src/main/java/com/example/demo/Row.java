package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="card_row")
public class Row {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	private String rowLetter;
    
    @JsonIgnoreProperties("row")
    @OneToMany(mappedBy = "row", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Spot> spots = new ArrayList<>();
	
    public Row(){}

	public Row(int id, String rowLetter, Collection<Spot> spots) {
		super();
		this.id = id;
		this.rowLetter = rowLetter;
		this.spots = spots;
	}
}
