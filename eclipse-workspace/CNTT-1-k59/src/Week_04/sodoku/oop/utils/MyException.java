package sodoku.oop.utils;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private int id_exception;
	private String message;

	public MyException(int id_exception, String message) {
		super();
		this.id_exception = id_exception;
		this.message = message;
	}

	public int getId_exception() {
		return this.id_exception;
	}
	
	public String getMessage() {
		return this.message;
	}

	@Override
	public String toString() {
		return "Error: [id_exception=" + id_exception + ", contents=" + this.getMessage() + "]";
	}
	
}
