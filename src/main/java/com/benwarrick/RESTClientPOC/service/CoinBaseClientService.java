package com.benwarrick.RESTClientPOC.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinBaseClientService {
	public Mono<Token> getToken(); 
	public Flux<Prices> getLatestPrices(); 
	public Mono<OrderResponse> createOrder(String orderType, String buyingCurrency, String sellingCurrency, String buyingQty);

}
