package com.benwarrick.RESTClientPOC.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prices {
	@JsonProperty("latestPrices")
	private List<Price> priceList;
	public Prices() {
		super(); 
	}
	public Prices(List<Price> priceList) {
		this.priceList = priceList;
	}
	public List<Price> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<Price> priceList) {
		this.priceList = priceList;
	}

}
