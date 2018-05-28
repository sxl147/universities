package ORMclasses.university;

public class BinaryFieldORM 
{
	private Long Id;	// binary_field__id
	byte[] binaryFieldBits; // binary_field_bits
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public byte[] getBinaryFieldBits() {
		return binaryFieldBits;
	}
	public void setBinaryFieldBits(byte[] binaryFieldBits) {
		this.binaryFieldBits = binaryFieldBits;
	}
}
