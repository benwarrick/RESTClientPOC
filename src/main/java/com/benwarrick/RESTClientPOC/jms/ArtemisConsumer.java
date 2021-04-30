package com.benwarrick.RESTClientPOC.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.benwarrick.RESTClientPOC.persistance.OrderEntity;
import com.benwarrick.RESTClientPOC.persistance.OrderRepository;
import com.benwarrick.RESTClientPOC.service.CoinBaseClientServiceImpl;
import com.benwarrick.RESTClientPOC.service.OrderMapper;
import com.benwarrick.RESTClientPOC.service.OrderResponse;
import com.benwarrick.RESTClientPOC.service.Price;
import com.benwarrick.RESTClientPOC.service.Prices;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Component
public class ArtemisConsumer {

	private final OrderRepository orderRepository; 
	private final OrderMapper orderMapper;
	
	@Autowired
	public ArtemisConsumer(OrderRepository orderRepository, OrderMapper orderMapper) {
		this.orderRepository = orderRepository; 
		this.orderMapper = orderMapper; 
	}
	
	
	@JmsListener(destination = "test.topic::test.queue")
	public void receive(String msg){
		System.out.println("Got Message: " + msg);
		
        CoinBaseClientServiceImpl client = new CoinBaseClientServiceImpl();
		
        Mono<OrderResponse>orderCreate = client.createOrder("market", "USD", "BTC", "5");
        orderCreate.log().subscribe(
        		successValue -> processResponse(successValue),
        		error -> System.err.println(error.getMessage()),
				() -> System.out.println("mono consumed")
        		);
        
        /*
        Flux<Prices>prices = client.getLatestPrices();
		prices.log().subscribe(
				i -> { for (Price p : i.getPriceList()) { System.out.println(p.getAsk());} }
				);
				*/
	}
	
	public void processResponse(OrderResponse orderResponse) {
		
		System.out.println(orderResponse.getOrderID() + " " + orderResponse.getSellingCurrency() + orderResponse.getBuyingCurrency() + " Qty: " 
				+ orderResponse.getBoughtQty() + " Type: " + orderResponse.getOrderType()) ;
		try {
		//OrderEntity entity = new OrderEntity("125","USD","DSU","5","Sell");
		//OrderEntity newEntity = orderRepository.save(entity);
		OrderEntity entity = orderMapper.apiResponseToEntity(orderResponse); 
		OrderEntity newEntity = orderRepository.save(entity); 
		System.out.println("Test: " + newEntity.getBoughtQuantity()); 
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.toString()) ;
		}
	}
}