package seedu.addressbook.data.person;

public class AddressBlock {
	
	private final String blockNum;
	
	public AddressBlock(String str){
		this.blockNum = str;	
	}
	
	public String getValue(){
		return this.blockNum;
	}
}
