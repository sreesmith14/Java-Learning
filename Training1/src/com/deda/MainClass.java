package com.deda;

import java.util.Scanner;

import Controller.EmployeeController;
import Controller.EmployeeInterface;
import com.deda.model.Employee;
import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome");
		EmployeeInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Serialize");
			System.out.println("4. DeSerialize");
			System.out.println("5. Sort Emp by ID");
			System.out.println("6. Sort by Emp name");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.serial();
				break;
			}
			case 4: {
				ec.deserial();
				break;
			}
			case 5: {
				ec.sortByEid();
				break;
			}
			case 6: {
				ec.sortByEname();
				break;
			}
			default: {
				System.out.println("Enter right choice");
				break;
			}
			}
			System.out.println("Do u want to continue Y or y");
			choice = sc.next();
		} while (choice.equals("Y") || choice.equals("y"));
		System.out.println("Exited");
		System.exit(0);

	}

}
