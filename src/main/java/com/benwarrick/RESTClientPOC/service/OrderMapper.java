package com.benwarrick.RESTClientPOC.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.benwarrick.RESTClientPOC.persistance.OrderEntity;

@Mapper (componentModel = "spring")
public interface OrderMapper {
	
	@Mappings({
		@Mapping(target = "pk", ignore = true),
		@Mapping(target = "version", ignore = true),
		@Mapping(target = "orderId", source="orderID"),
		@Mapping(target = "boughtQuantity", source="boughtQty")
	})
	OrderEntity apiResponseToEntity(OrderResponse api); 
}
