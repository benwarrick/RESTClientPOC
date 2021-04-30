package com.benwarrick.RESTClientPOC.persistance;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepository  extends PagingAndSortingRepository<OrderEntity, String>{
	//Wrapping the method with Optional allows it to return zero or one Order Entities. 
	Optional<OrderEntity> findByOrderId(String orderId); 
}
