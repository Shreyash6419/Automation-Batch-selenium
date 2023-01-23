package collection_fram;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor {

	public static void main(String[] args) {
		
 		ArrayList<String> un1 = new ArrayList<>();
 		
 		un1.add("one");
 		un1.add("two");
 		un1.add("three");
 		un1.add("Four");
 		un1.add("five");
 		un1.add("six");
 		
 		System.out.println(un1);
 		
 		
 		Iterator<String> al = un1.iterator();
 		
 		while(al.hasNext())
 		{
 			System.out.println(al.next());
 		}
 		
 		System.out.println("=========for loop===========");
 		
 		for(int i=0;i<=un1.size()-1;i++)
 		{
 			System.out.println(un1.get(i));
 		}
 		
 		System.out.println("=========for each ========");
 		
 		for(String a:un1)
 		{
 			System.out.println(a);
 		}
 		

	}

}
