/**
 * @author Mika Ropponen
 */
package fi.softala.ttl.model;

import java.io.Serializable;

public class Option implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int optionID;
	private String optionText;
	
	public Option() {
		super();
		this.optionID = 0;
		this.optionText = "";
	}

	public Option(int optionID, String optionText) {
		super();
		this.optionID = optionID;
		this.optionText = optionText;
	}

	public int getOptionID() {
		return optionID;
	}

	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
}
