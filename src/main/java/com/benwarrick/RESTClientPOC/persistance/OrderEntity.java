package com.benwarrick.RESTClientPOC.persistance;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="k2orders")
public class OrderEntity {
	@Id
	private String pk;
	@Version
	private Integer version; 
	
	@Indexed (unique = true)
	private String orderId;
	
	private String sellingCurrency;
	private String buyingCurrency; 
	private String boughtQuantity; 
	private String orderType;
	
	public OrderEntity() {
		
	}	
	public OrderEntity(String orderId, String sellingCurrency, String buyingCurrency, String boughtQuantity, String orderType) {
		this.orderId = orderId;
		this.sellingCurrency = sellingCurrency;
		this.buyingCurrency = buyingCurrency;
		this.boughtQuantity = boughtQuantity;
		this.orderType = orderType;
	}


	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSellingCurrency() {
		return sellingCurrency;
	}
	public void setSellingCurrency(String sellingCurrency) {
		this.sellingCurrency = sellingCurrency;
	}
	public String getBuyingCurrency() {
		return buyingCurrency;
	}
	public void setBuyingCurrency(String buyingCurrency) {
		this.buyingCurrency = buyingCurrency;
	}
	public String getBoughtQuantity() {
		return boughtQuantity;
	}
	public void setBoughtQuantity(String boughtQuantity) {
		this.boughtQuantity = boughtQuantity;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	} 
	
	
}
