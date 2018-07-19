package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/game")
public class GameController {

	@Autowired 
	GameService aService;

	 @GetMapping("/spot/")
	 public List<Spot> getAllSpots() {
		 return (List<Spot>) aService.findAllSpots();
	 }
	 
	 @GetMapping("/row/")
	 public List<Row> getAllRows() {
		 return (List<Row>) aService.findAllRows();
	 }
	
	 @GetMapping("/spot/{spot_id}")
	 public Optional<Spot> getSelectedSpot(@PathVariable int spot_id){
		 return aService.getSpot(spot_id);
	 }
	 
	 @GetMapping("/row/{rowId}")
	 public Optional<Row> getSelectedRow(@PathVariable int rowId){
		 return aService.getRow(rowId);
	 }
	 
	 @PutMapping("/spot/flipped/{spotId}")
	 public void flipSpot(@RequestBody Spot spot, @PathVariable int spotId){
		 aService.updateSpot(spot, spotId, "flipped"); 
	 }
	 
	 @PutMapping("/spot/unflipped/{spotId}")
	 public void unflippedSpot(@RequestBody Spot spot, @PathVariable int spotId){
		 aService.updateSpot(spot, spotId, "unflipped"); 
	 }
	 
	 /*@PostMapping("/{rowId}/addSpot")
	 public void addSpot(@RequestBody Spot spot, @PathVariable int rowId) {
		 aService.updateSpot(spot);
	 }*/
	
}
