package com.benwarrick.RESTClientPOC.service;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderResponse {
	@JsonProperty
	private String orderType;
	@JsonProperty
	private String buyingCurrency;
	@JsonProperty
	private String sellingCurrency;
	@JsonProperty
	private float buyingQty;
	@JsonProperty
	private String userID;
	@JsonProperty
	private String orderID;
	@JsonProperty
	private float timeInForce;
	@JsonProperty
	private float boughtQty;
	@JsonProperty
	private float soldQty;
	@JsonProperty
	private float creationTime;
	@JsonProperty
	private float seqNumber;
	@JsonProperty
	private float firstFillTime;
	@JsonProperty
	private float lastFillTime;
	@JsonProperty
	ArrayList<Fill> fills = new ArrayList<Fill>();
	@JsonProperty
	private float completionTime;
	@JsonProperty
	private float takerQty;

	// Getter Methods

	public String getOrderType() {
		return orderType;
	}

	public String getBuyingCurrency() {
		return buyingCurrency;
	}

	public String getSellingCurrency() {
		return sellingCurrency;
	}

	public float getBuyingQty() {
		return buyingQty;
	}

	public String getUserID() {
		return userID;
	}

	public String getOrderID() {
		return orderID;
	}

	public float getTimeInForce() {
		return timeInForce;
	}

	public float getBoughtQty() {
		return boughtQty;
	}

	public float getSoldQty() {
		return soldQty;
	}

	public float getCreationTime() {
		return creationTime;
	}

	public float getSeqNumber() {
		return seqNumber;
	}

	public float getFirstFillTime() {
		return firstFillTime;
	}

	public float getLastFillTime() {
		return lastFillTime;
	}

	public float getCompletionTime() {
		return completionTime;
	}

	public float getTakerQty() {
		return takerQty;
	}

	// Setter Methods

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setBuyingCurrency(String buyingCurrency) {
		this.buyingCurrency = buyingCurrency;
	}

	public void setSellingCurrency(String sellingCurrency) {
		this.sellingCurrency = sellingCurrency;
	}

	public void setBuyingQty(float buyingQty) {
		this.buyingQty = buyingQty;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public void setTimeInForce(float timeInForce) {
		this.timeInForce = timeInForce;
	}

	public void setBoughtQty(float boughtQty) {
		this.boughtQty = boughtQty;
	}

	public void setSoldQty(float soldQty) {
		this.soldQty = soldQty;
	}

	public void setCreationTime(float creationTime) {
		this.creationTime = creationTime;
	}

	public void setSeqNumber(float seqNumber) {
		this.seqNumber = seqNumber;
	}

	public void setFirstFillTime(float firstFillTime) {
		this.firstFillTime = firstFillTime;
	}

	public void setLastFillTime(float lastFillTime) {
		this.lastFillTime = lastFillTime;
	}

	public void setCompletionTime(float completionTime) {
		this.completionTime = completionTime;
	}

	public void setTakerQty(float takerQty) {
		this.takerQty = takerQty;
	}
}
