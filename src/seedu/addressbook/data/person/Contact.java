/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Darius
 *
 */
public abstract class Contact {

	
    public String value = "default";
    protected boolean isPrivate;
    
    public String toString() {
        return value;
    }
    
    public abstract boolean equals(Object other);
    
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
