package org.product.web.bean;

public class ConfigDetails{
	
	int prodId;
	String processorName;
	String harddiskCapasity;
	String ramSize;
	String screenSize;
	String operatingSystem;
	
	public ConfigDetails() {
		super();
	}
	public ConfigDetails(int i, String processorName,String harddiskCapasity,String ramSize,String screenSize,String operatingSystem) {
		super();
		this.prodId = i;
		this.processorName = processorName;
		this.harddiskCapasity=harddiskCapasity;
		this.ramSize=ramSize;
		this.screenSize=screenSize;
		this.operatingSystem=operatingSystem;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProcessorName() {
		return processorName;
	}
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}
	public String getHarddiskCapasity() {
		return harddiskCapasity;
	}
	public void setHarddiskCapasity(String harddiskCapasity) {
		this.harddiskCapasity = harddiskCapasity;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}