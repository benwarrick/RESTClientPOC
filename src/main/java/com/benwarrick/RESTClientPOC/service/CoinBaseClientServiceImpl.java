package com.benwarrick.RESTClientPOC.service;

import org.apache.commons.collections.map.MultiValueMap;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CoinBaseClientServiceImpl implements CoinBaseClientService {

	private final WebClient webClient;

	public CoinBaseClientServiceImpl() {
		this.webClient = WebClient.builder().baseUrl("https://api.coinmetro.com")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json").build();
	}

	@Override
	public Mono<Token> getToken() {
		return webClient.get().uri("/open/demo/temp").retrieve().bodyToMono(Token.class);
	}

	@Override
	public Flux<Prices> getLatestPrices() {
		return webClient.get().uri("/open/exchange/prices").retrieve().bodyToFlux(Prices.class);
	}

	@Override
	public Mono<OrderResponse> createOrder(String orderType, String buyingCurrency, String sellingCurrency, String buyingQty) {
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String,String>();
		map.add("orderType", orderType);
		map.add("buyingCurrency", buyingCurrency);
		map.add("sellingCurrency", sellingCurrency);
		map.add("buyingQty", buyingQty);

		return webClient.post().uri("/open/exchange/orders/create")
				.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImY0ODgxYTgwIiwiaWQiOiI2MDgyMGQ1MGNlZGQyNzc5OGU1MWNkZTgiLCJpcCI6IjIzLjI4Ljg5LjEzNCIsImlhdCI6MTYxOTEzNTgyNH0.E0_hrdcUXW7MmcmZU7OWhuFQiwpWMYy97qrbGQyDz3E")
				.header("Content-Type", "application/x-www-form-urlencoded")
				//.body(BodyInserters.fromMultipartData(map))
				.body(BodyInserters.fromFormData(map))
				.retrieve()
				.bodyToMono(OrderResponse.class);
	}

}
