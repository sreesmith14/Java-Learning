package Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface EmployeeInterface {
	public void addEmployee() throws IOException;
	public void viewEmployee();
	public void serial() throws IOException;
	public void deserial() throws IOException;
	public void sortByEid();
	public void sortByEname();

}
