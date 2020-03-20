package FunctionalityCheck;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {
		
		//does not allow duplicate
		
		HashSet<String> set= new HashSet<String>();
		set.add("ram");
		set.add("geeta");
		set.add("ram");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("elements:- "+itr.next());
			
		}	
		
		
		
	}

}
