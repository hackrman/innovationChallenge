package com.example.demo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="card_spot")
public class Spot {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="spot_id")
	private int spotId;
	private int matchId;
	private String spotName;
	private String spotStatus;
	private String cardDescription;
	private String imagePath;
	private String htmlInfo;

	@ManyToOne
	@JsonIgnore //added to remove row information from JSON
	private Row row;

	/**
	 * Default constructor for spot object
	 */
    public Spot() {
  
    }
	
    /**
     * Constructor for spot object
     * 
     * @param spotId
     * @param matchId
     * @param spotName
     * @param spotStatus
     * @param cardDescription
     * @param imagePath
     * @param row
     */
	public Spot(int spotId, int matchId, String spotName, String spotStatus, 
			String cardDescription, String imagePath, String htmlInfo, Row row) {
		super();
		this.spotId = spotId;
		this.matchId = matchId;
		this.spotName = spotName;
		this.spotStatus = spotStatus;
		this.cardDescription = cardDescription;
		this.imagePath = imagePath;
		this.htmlInfo = htmlInfo;
		this.row = row;
	}

	public int getSpotId() {
		return spotId;
	}

	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public String getSpotStatus() {
		return spotStatus;
	}

	public void setSpotStatus(String spotStatus) {
		this.spotStatus = spotStatus;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getHtmlInfo() {
		return htmlInfo;
	}
	
	public void setHtmlInfo(String htmlInfo) {
		this.htmlInfo = htmlInfo;
	}

	public Row getRow() {
		return row;
	}

	public void setRow(Row row) {
		this.row = row;
	}

}