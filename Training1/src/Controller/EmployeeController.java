package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import com.deda.model.Employee;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	List emplist = new ArrayList();

	public void addEmployee() throws IOException {
		emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid = sc.nextInt();
		emp.setEid(eid);

		System.out.println("Enter Ename");
		String ename = sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Succesfully");
	}

	public void viewEmployee() {
		// System.out.println(emp);
		Iterator i = emplist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

	public void serial() throws IOException {
		try {
			//Employee emp = new Employee();

			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emplist);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		}
	}

	public void deserial() throws IOException {
		try{
			
			
			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			emplist = (ArrayList)ois.readObject();
			System.out.println("DeSerilized from file dedalus.txt");
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			ois.close();
			fis.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
			catch(ClassNotFoundException cnf)
			{
				System.out.println("No Emp class");
			}
	}
	
	@Override
	public void sortByEid() {
		Collections.sort(emplist);
		System.out.println("After sorting by EID");
		System.out.println(emplist);
	}

	@Override
	public void sortByEname() {
		Collections.sort(emplist, Employee.NameComparator);
		System.out.println(emplist);
		
	}
}
