package FunctionalityCheck;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<String>(); //creating array list ,ArrayList is a class
		
		list.add("ravi");
		list.add("raj");
		list.add("ram");
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

		
		
		
	}

}
