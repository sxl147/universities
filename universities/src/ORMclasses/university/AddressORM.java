package ORMclasses.university;

import java.util.Date;

public class AddressORM 
{
	private Long Id;	// address_id
	private Long addressTypeId; // address_type_id
	private Long connectorId;	// connector_id
	private String fullStreetName; // full_street_name
	private Long cityId; // city
	private Long stateId;	// state_id
	private String zipCode; // zip_code
	private Date evntTmeStmp; // evnt_tmestmp
	private String evntOperId; // evnt_oper_id
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(Long addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public Long getConnectorId() {
		return connectorId;
	}
	public void setConnectorId(Long connectorId) {
		this.connectorId = connectorId;
	}
	public String getFullStreetName() {
		return fullStreetName;
	}
	public void setFullStreetName(String fullStreetName) {
		this.fullStreetName = fullStreetName;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long city) {
		this.cityId = city;
	}
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Date getEvntTmeStmp() {
		return evntTmeStmp;
	}
	public void setEvntTmeStmp(Date evntTmeStmp) {
		this.evntTmeStmp = evntTmeStmp;
	}
	public String getEvntOperId() {
		return evntOperId;
	}
	public void setEvntOperId(String evntOperId) {
		this.evntOperId = evntOperId;
	}
}
