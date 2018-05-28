package ORMclasses.university;

import java.util.Date;

public class AddressTypeORM 
{
	private Long Id;	// address_type_id
	private String addressTypeCode; // address_type_code
	private String addressTypeSubcode; // address_type_subcode
	private String addressTypeName; // address_type_name
	private Date evntTmeStmp; // evnt_tmestmp
	private String evntOperId; // evnt_oper_id
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getAddressTypeCode() {
		return addressTypeCode;
	}
	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}
	public String getAddressTypeSubcode() {
		return addressTypeSubcode;
	}
	public void setAddressTypeSubcode(String addressTypeSubcode) {
		this.addressTypeSubcode = addressTypeSubcode;
	}
	public String getAddressTypeName() {
		return addressTypeName;
	}
	public void setAddressTypeName(String addressTypeName) {
		this.addressTypeName = addressTypeName;
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


