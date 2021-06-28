package File_Handling;

import java.io.Serializable;

public class Serializatio_n implements Serializable {
	private static final long serialVersionUID = -134123413241234L;
	private String type;
	private int number;
	
	public Serializatio_n(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Serializatio_n [serialVersionUID=" + serialVersionUID + ", type=" + type + ", number=" + number + "]";
	}

}
