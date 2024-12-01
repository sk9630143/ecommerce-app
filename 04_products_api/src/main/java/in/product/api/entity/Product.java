package in.product.api.entity;

import lombok.Data;

@Data
//@Entity
public class Product {
	
	public Product(Long pid, String pname, String pdesc, Double price) {
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.price=price;
	}

	private Long pid;
	
	private String pname;
	
	private String pdesc;
	
	private Double price;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", price=" + price + "]";
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
