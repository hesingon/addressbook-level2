package seedu.addressbook.data.person;

public class AddressPostalCode {

	private final String postalCode;
	
	public AddressPostalCode(String str){
		this.postalCode = str;
		
	}
	
	public String getValue(){
		return this.postalCode;
	}
}
