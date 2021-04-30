package com.benwarrick.RESTClientPOC.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
	@JsonProperty
	private String pair;
	@JsonProperty
	private String timestamp;
	@JsonProperty
	private float price;
	@JsonProperty
	private int qty;	
	@JsonProperty
	private float ask;
	@JsonProperty
	private float bid;
	
	public Price() {
		super(); 
	}
	public Price(String pair, String timestamp, float price, int qty, float ask, float bid) {
		this.pair = pair;
		this.timestamp = timestamp;
		this.price = price;
		this.qty = qty;
		this.ask = ask;
		this.bid = bid;
	}
	public String getPair() {
		return pair;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public float getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public float getAsk() {
		return ask;
	}
	public float getBid() {
		return bid;
	}
		
}
