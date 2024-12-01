package in.orders.api.entity;

import lombok.Data;

@Data
public class Order {

	private Long oid;
	
	private Integer pqty;
	
	private Double totalPrice;
	
	private Integer customerId;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Integer getPqty() {
		return pqty;
	}

	public void setPqty(Integer pqty) {
		this.pqty = pqty;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", pqty=" + pqty + ", totalPrice=" + totalPrice + ", customerId=" + customerId
				+ "]";
	}

	public Order(Long oid, Integer pqty, Double totalPrice, Integer customerId) {
		super();
		this.oid = oid;
		this.pqty = pqty;
		this.totalPrice = totalPrice;
		this.customerId = customerId;
	}
	
	
}
