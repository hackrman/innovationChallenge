package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="module")
public class Module {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="module_id")
	private int moduleId;
	private int matchId;
	private String spotName;
	private String firstBulletPoint;
	private String secondBulletPoint;
	private String imagePath;
	private String moreInfoUrl;
	
	/**
	 * Default constructor for module object
	 */
	public Module() {
		
	}
	
	/**
	 * Constructor for module object
	 * 
	 * @param moduleId
	 * @param matchId
	 * @param spotName
	 * @param firstBulletPoint
	 * @param secondBulletPoint
	 * @param imagePath
	 * @param moreInfoUrl
	 */
	public Module(int moduleId, int matchId, String spotName, String firstBulletPoint, String secondBulletPoint,
			String imagePath, String moreInfoUrl) {
		super();
		this.moduleId = moduleId;
		this.matchId = matchId;
		this.spotName = spotName;
		this.firstBulletPoint = firstBulletPoint;
		this.secondBulletPoint = secondBulletPoint;
		this.imagePath = imagePath;
		this.moreInfoUrl = moreInfoUrl;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
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

	public String getFirstBulletPoint() {
		return firstBulletPoint;
	}

	public void setFirstBulletPoint(String firstBulletPoint) {
		this.firstBulletPoint = firstBulletPoint;
	}

	public String getSecondBulletPoint() {
		return secondBulletPoint;
	}

	public void setSecondBulletPoint(String secondBulletPoint) {
		this.secondBulletPoint = secondBulletPoint;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getMoreInfoUrl() {
		return moreInfoUrl;
	}

	public void setMoreInfoUrl(String moreInfoUrl) {
		this.moreInfoUrl = moreInfoUrl;
	}
	
}
