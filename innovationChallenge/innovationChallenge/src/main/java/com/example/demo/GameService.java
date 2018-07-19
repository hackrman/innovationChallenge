package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

	@Autowired
	RowRepository rowRepository;
	@Autowired
	SpotRepository spotRepository;
	
	 public Optional<Spot> getSpot(int spot_id){
		 return spotRepository.findById(spot_id);
	 }
	 
	 public Optional<Row> getRow(int row_id){
		 return rowRepository.findById(row_id);
	 }
	 
	 public void updateSpot(Spot spot, int spotId, String status) {
		 spot.setSpotStatus(status);
		 spotRepository.save(spot);
	 }
	 
	 public Iterable<Spot> findAllSpots() {
		 return spotRepository.findAll();
	 }
	 
	 public Iterable<Row> findAllRows() {
		 return rowRepository.findAll();
	 }
	 
}
