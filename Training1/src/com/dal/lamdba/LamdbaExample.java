package com.dal.lamdba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LamdbaExample {

	public static void main(String args[]) {
		// Java 7 --1
		// Task task = new Task();
		// task.connect();

		// Java 7 syntax 2
		// Runnable r = new MyTaskThread();
		// Thread thread = new Thread(r);
		// thread.start();

		// Java 7 -- Syntax 3
		// Runnable r =new Runnable() {
		// @Override
		// public void run() {
		// Task task = new Task();
		// task.connect();
		// }
		// };
		// Thread t1 = new Thread(r);
		// t1.start();

		// Java 8 -- Syntax 1
		// Runnable r = () -> {
		// Task task = new Task();
		// task.connect();
		// };
		// Thread t1 = new Thread(r);
		// t1.start();

		// Java 8 -- Syntax 2
		// Thread th1 = new Thread(() -> {
		// Task task = new Task();
		// task.connect();
		// });
		// th1.start();

		// Java 8 -- Syntax 3
		// new Thread(() -> {
		// new Task().connect();
		// }).start();

		// Method Reference
		// new Thread(new Task()::connect).start();

		User u1 = new User(11, "Dell", "Dell@gmail.com");
		User u2 = new User(12, "Lenovo", "Lenovo@gmail.com");
		User u3 = new User(13, "Acer", "Acer@gmail.com");

		List<User> li = new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		System.out.println("User List :" + li);

		//Iterator<User> i = li.iterator();
		//while (i.hasNext()) {
		//	System.out.println(i.next());	
		//}
	li.forEach(lis->System.out.println(lis));
	//li.forEach(System.out::println);	
		
		
	}
}
