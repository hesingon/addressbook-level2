/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Darius
 *
 */
public interface Printable {
	/**
	  * Returns a concatenated version of the printable strings of each object.
	  */
	public String getPrintableString(Printable... printables);
}
