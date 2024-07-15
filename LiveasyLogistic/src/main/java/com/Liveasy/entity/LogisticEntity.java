package com.Liveasy.entity;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logistics_details")
public class LogisticEntity {

	public LogisticEntity() {
		super();
	}

	@Id
	@Column(name="shipping_id")
	private String ShipperId;
	
	@Column(name="loading_point")
	private String loadingPoint;
	
	@Column(name="unloading_point")
	private String unloadingPoint;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="truck_type")
	private String truckType;
	
	@Column(name="number_of_trucks")
	private Integer numOfTrucks;
	
	@Column(name="weight")
	private long weight; 
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="date" )
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern ="dd-mm-yyyy")
	private LocalDate date;

	
	public LogisticEntity(String shipperId, String loadingPoint, String unloadingPoint, String productType,
			String truckType, Integer numOfTrucks, long weight, String comment, LocalDate date) {
		super();
		this.ShipperId = shipperId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.numOfTrucks = numOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}

	
	public String getShipperId() {
		return ShipperId;
	}

	public void setShipperId(String shipperId) {
		ShipperId = shipperId;
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

	public void setNumOfTrucks(int numOfTrucks) {
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
	
}
