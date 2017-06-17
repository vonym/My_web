package com.briup.pojo;

public class Address {
	private Integer addrId;
	private String country;
	private String province;
	private String city;
	private String zip;

	public Address() {
	}

	public Address(Integer addrId, String country, String province, String city, String zip) {
		this.addrId = addrId;
		this.country = country;
		this.province = province;
		this.city = city;
		this.zip = zip;
	}

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", country=" + country + ", province=" + province + ", city=" + city
				+ ", zip=" + zip + "]";
	}
}
