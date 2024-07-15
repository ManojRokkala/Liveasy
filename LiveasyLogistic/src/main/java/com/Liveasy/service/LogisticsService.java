package com.Liveasy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Liveasy.entity.LogisticEntity;
import com.Liveasy.repository.LogisticRepository;
import com.Liveasy.request.Request;
import com.Liveasy.response.Response;

@Service
public class LogisticsService {

	@Autowired
	 LogisticRepository repository;
	
	public ResponseEntity<Object> getAllDetails() {
		List<LogisticEntity> data= repository.findAll();
		if(data.isEmpty()) {
			return new ResponseEntity<Object>("No records to show", HttpStatus.NOT_FOUND);
		}
		else {	
		List<Response> result = new ArrayList<Response>();
		data.forEach(e->{
			Response response = new Response(
					e.getShipperId(),
					e.getLoadingPoint(),
					e.getUnloadingPoint(),
					e.getProductType(),
					e.getTruckType(),
					e.getNumOfTrucks(),
					e.getWeight(),
					e.getComment(),
					e.getDate());			
			result.add(response);
		});
		return new ResponseEntity<Object>(result, HttpStatus.OK);

		}
	} 
	
	public ResponseEntity<Object> getLogisticDetails(String shipperId) {
		
		if(repository.existsById(shipperId)){
		LogisticEntity result=repository.findById(shipperId).get();
		Response response = new Response(
				result.getShipperId(),
				result.getLoadingPoint(),
				result.getUnloadingPoint(),
				result.getProductType(),
				result.getTruckType(),
				result.getNumOfTrucks(),
				result.getWeight(),
				result.getComment(),
				result.getDate());
				return new ResponseEntity<Object>(response, HttpStatus.OK);
		}
		else {return new ResponseEntity<Object>("Data not found",HttpStatus.NOT_FOUND);}
	} 
	
	
	public LogisticEntity saveLogisticDetails(Request request) {
		LogisticEntity entity = new LogisticEntity(
				request.getShipperId(),
				request.getLoadingPoint(),
				request.getUnloadingPoint(),
				request.getProductType(),
				request.getTruckType(),
				request.getNumOfTrucks(),
				request.getWeight(),
				request.getComment(),
				request.getDate());
		return repository.save(entity);
//		LogisticEntity response = repository.save(entity);
//		return response.equals(entity) ? "Entry saved successfully" : "Entry not saved";
	}
	
	public void deleteLogisticDetails(String shipperId) {
		repository.deleteById(shipperId);
		
	}
	
	public void updateLogisticDetails(Request request) {
		LogisticEntity data=repository.findById(request.getShipperId()).get();
		data.setLoadingPoint(request.getLoadingPoint());
		data.setUnloadingPoint(request.getUnloadingPoint());
		data.setProductType(request.getProductType());
		data.setTruckType(request.getTruckType());
		data.setNumOfTrucks(request.getNumOfTrucks());
		data.setWeight(request.getWeight());
		data.setComment(request.getComment());
		data.setDate(request.getDate());
		repository.save(data);
	}
}
