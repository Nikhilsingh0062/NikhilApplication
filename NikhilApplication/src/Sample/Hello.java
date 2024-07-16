package Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Hello {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add("code");
		a.add("hello");
		a.add('B');
		a.add(7.25);
		
		System.out.println(a);
		System.out.println("===========================");
		
	    Iterator it=a.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ListIterator It=a.listIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("===============================");
	while(It.hasPrevious()) {
	System.out.println(It.previous());
		
	}
	}

}