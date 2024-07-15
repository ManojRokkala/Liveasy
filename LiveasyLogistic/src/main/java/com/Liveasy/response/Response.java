package com.Liveasy.response;


import java.time.LocalDate;

public class Response {

	private String shipperId;
	
	private String loadingPoint;
	
	private String unloadingPoint;
	
	private String productType;
	
	private String truckType;
	
	private int numOfTrucks;
	
	private long weight; 
	
	private String comment;
	
	private LocalDate date;
	
	
	public Response(String shipperId,String loadingPoint, String unloadingPoint, String productType, String truckType, int numOfTrucks,
			long weight, String comment, LocalDate date) {
		this.shipperId= shipperId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.numOfTrucks = numOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}


	public String getLoadingPoint() {
		return loadingPoint;
	}


	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}


	public String getUnloadingPoint() {
		return unloadingPoint;
	}


	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getTruckType() {
		return truckType;
	}


	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}


	public int getNumOfTrucks() {
		return numOfTrucks;
	}


	public void setNumOfTrucks(Integer numOfTrucks) {
		this.numOfTrucks = numOfTrucks;
	}


	public long getWeight() {
		return weight;
	}


	public void setWeight(long weight) {
		this.weight = weight;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getShipperId() {
		return shipperId;
	}


	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
}
