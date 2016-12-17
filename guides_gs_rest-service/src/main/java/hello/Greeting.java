/**
 * 
 */
package hello;

/**
 * @author yuryk
 *
 */
public class Greeting {
    private final long id;
    private final String content;

    /**
     * @param id
     * @param content
     */
    public Greeting(long id, String content) {
	super();
	this.id = id;
	this.content = content;
    }

    /**
     * @return the id
     */
    public long getId() {
	return id;
    }

    /**
     * @return the content
     */
    public String getContent() {
	return content;
    }

}
