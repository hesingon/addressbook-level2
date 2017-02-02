package seedu.addressbook.data.person;

public class AddressStreet {

	private final String street;
	
	public AddressStreet(String str){
		this.street = str;
		
	}
	
	public String getValue(){
		return this.street;
	}
}