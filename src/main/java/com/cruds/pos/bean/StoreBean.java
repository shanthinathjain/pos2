package com.cruds.pos.bean;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "storebean")
public class StoreBean implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

		
		@Column(unique = true, name="store_id")
		private String storeId;

		@Column(nullable=false, length=255)
		private String name;

		@Column(nullable = false)
		private String street;

		@Column(nullable = false)
		private String mobileNo;

		@Column(nullable = false)
		private String city;

		@Column(nullable = false)
		private String state;

		@Column(nullable = false)
		private String pincode;

		public StoreBean() {}

		public StoreBean(String storeId, String name, String street, String mobileNo, String city, String state,
				String pincode) {
			super();
			this.storeId = storeId;
			this.name = name;
			this.street = street;
			this.mobileNo = mobileNo;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStoreId() {
			return storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		@Override
		public String toString() {
			return "StoreBean [id=" + id + ", storeId=" + storeId + ", name=" + name + ", street=" + street
					+ ", mobileNo=" + mobileNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}

}

