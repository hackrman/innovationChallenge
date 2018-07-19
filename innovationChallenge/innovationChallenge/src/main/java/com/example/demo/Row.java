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
	
    /**
     * Default constructor for row object
     */
    public Row() {
    	
    }

    /**
     * Constructor for row object
     * 
     * @param id
     * @param rowLetter
     * @param spots
     */
	public Row(int id, String rowLetter, Collection<Spot> spots) {
		super();
		this.id = id;
		this.rowLetter = rowLetter;
		this.spots = spots;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRowLetter() {
		return rowLetter;
	}

	public void setRowLetter(String rowLetter) {
		this.rowLetter = rowLetter;
	}

	public Collection<Spot> getSpots() {
		return spots;
	}

	public void setSpots(Collection<Spot> spots) {
		this.spots = spots;
	}
	
}
