/**
 * 
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author yuryk
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    /**
     * 
     */
    public Quote() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @return the type
     */
    public String getType() {
	return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
     * @return the value
     */
    public Value getValue() {
	return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(Value value) {
	this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Quote [type=" + type + ", value=" + value + "]";
    }

}
