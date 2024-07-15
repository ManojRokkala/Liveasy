package com.Liveasy.controller;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Liveasy.entity.LogisticEntity;
import com.Liveasy.request.Request;
import com.Liveasy.response.Response;
import com.Liveasy.service.LogisticsService;


@RestController
public class Controller {

	@Autowired
	LogisticsService service;
	
	@GetMapping("/load")
	public ResponseEntity<Object> getAllDetails() {
		return service.getAllDetails();
	}
	
	@GetMapping("/load/{loadid}")
	public ResponseEntity<Object> getDetails(@PathVariable("loadid") String loadId) {
		return service.getLogisticDetails(loadId);
	}
	
	@PostMapping("/load")
	public LogisticEntity saveDetails(@RequestBody Request request) {
		return service.saveLogisticDetails(request);
	}
	
	@PutMapping("/load/{loadid}")	
	public void updateDetails(@RequestBody Request request) {
		service.updateLogisticDetails(request);
	}
	
	@DeleteMapping("/load/{loadid}")
	public void deleteDetails(@PathVariable("loadid") String loadId) {
		service.deleteLogisticDetails(loadId);
	}
}
