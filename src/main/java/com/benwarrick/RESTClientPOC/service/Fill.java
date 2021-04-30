package com.benwarrick.RESTClientPOC.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fill {
	@JsonProperty
	private float seqNumber;
	@JsonProperty
	private float timestamp;
	@JsonProperty
	private float qty;
	@JsonProperty
	private float price;
	@JsonProperty
	private String side;

	// Getter Methods

	public float getSeqNumber() {
		return seqNumber;
	}

	public float getTimestamp() {
		return timestamp;
	}

	public float getQty() {
		return qty;
	}

	public float getPrice() {
		return price;
	}

	public String getSide() {
		return side;
	}

	// Setter Methods

	public void setSeqNumber(float seqNumber) {
		this.seqNumber = seqNumber;
	}

	public void setTimestamp(float timestamp) {
		this.timestamp = timestamp;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setSide(String side) {
		this.side = side;
	}
}
