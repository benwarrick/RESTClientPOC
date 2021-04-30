package com.benwarrick.RESTClientPOC.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.benwarrick.RESTClientPOC.service.CoinBaseClientServiceImpl;
import com.benwarrick.RESTClientPOC.service.Price;
import com.benwarrick.RESTClientPOC.service.Prices;
import com.benwarrick.RESTClientPOC.service.Token;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@EnableAutoConfiguration
public class CoinBaseController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {	
		
		CoinBaseClientServiceImpl test = new CoinBaseClientServiceImpl(); 
		/*Mono<Token> token = test.getToken(); 
		token
			.log()
			.subscribe(
				successValue -> System.out.println(successValue.getToken()),
				error -> System.err.println(error.getMessage()),
				() -> System.out.println("token mono consumed")
				);
		*/
		Flux<Prices>prices = test.getLatestPrices();
		prices.log().subscribe(
				i -> { for (Price p : i.getPriceList()) { System.out.println(p.getAsk());} }
				);
		
		
		return "test"; 
	}	
}
