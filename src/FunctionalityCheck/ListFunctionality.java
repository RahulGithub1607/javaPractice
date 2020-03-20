package FunctionalityCheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFunctionality {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("list one item");
		al.add("List 2 item");

		ListIterator<String> alt=al.listIterator();
		
		//traversing forward
		while(alt.hasNext())
		{
			System.out.println("Index "+alt.nextIndex()+ "Item name"+alt.next());
		}
	}

}
