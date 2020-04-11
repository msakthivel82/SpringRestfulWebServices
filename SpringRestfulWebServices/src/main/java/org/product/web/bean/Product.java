package org.product.web.bean;

public class Product{
	
	int id;
	String prodName;
	String prodBrand;
	long price;
	
	public Product() {
		super();
	}
	public Product(int i, String prodName,String prodBrand,long price) {
		super();
		this.id = i;
		this.prodName = prodName;
		this.prodBrand=prodBrand;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getProdBrand() {
		return prodBrand;
	}
	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}
	
	
}