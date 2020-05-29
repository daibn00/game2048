package sodoku.oop.utils;

public interface Operations {
	public void readData() throws MyException;
	public void readData(String filename) throws MyException;
	public void saveData(String filename) throws MyException;
}
