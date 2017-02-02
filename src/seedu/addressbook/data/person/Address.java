package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #21-03, 530161";
    // Format of address input: a/BLOCK, STREET, UNIT, POSTAL_CODE
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String SEPARATION = ",";
    
    private AddressBlock block;
    private AddressStreet street;
    private AddressUnit unit;
    private AddressPostalCode postalCode;
    
    public static final int BLOCK_IDX = 0;
    public static final int STREET_IDX = 1;
    public static final int UNIT_IDX = 2;
    public static final int POSTALCODE_IDX = 3;
    
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;
        String[] splited = trimmedAddress.split(SEPARATION);
        putInPlace(splited);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }
    
    private void putInPlace(String[] items){
    	block = new AddressBlock(items[BLOCK_IDX]);
    	street = new AddressStreet(items[STREET_IDX]);
    	unit = new AddressUnit(items[UNIT_IDX]);
    	postalCode = new AddressPostalCode(items[POSTALCODE_IDX]);
    	
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
