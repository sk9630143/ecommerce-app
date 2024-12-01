package in.customer.api.entity;

import lombok.Data;

@Data
public class Customer {

	private Integer cid;
	
	private String cname;
	
	private Integer noOfOrders;
	
	private Long orderTrackingId;

	public Customer(Integer cid, String cname, Integer noOfOrders, Long orderTrackingId) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.noOfOrders = noOfOrders;
		this.orderTrackingId = orderTrackingId;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(Integer noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	public Long getOrderTrackingId() {
		return orderTrackingId;
	}

	public void setOrderTrackingId(Long orderTrackingId) {
		this.orderTrackingId = orderTrackingId;
	}
	
	
}
