package collection_fram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg2 {

	public static void main(String[] args) {
		
		
		ArrayList<Character> letter = new ArrayList<>();
		
		
		letter.add('A');
		letter.add('B');
		letter.add('C');
		letter.add('E');
		letter.add('F');
		letter.add('G');
		
		System.out.println(letter);
		
		//=============== for loop static ================
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(letter.get(i));
		}
		
		//=============== for loop dynamic ================
		
		for(int i=0;i<=letter.size()-1;i++)
		{
			System.out.println(letter.get(i));
		}
		
		//=================== for each========================
		
		for(Character a:letter)
		{
			
			System.out.println(a);
		}
		
		//==================== for Iterator======================
		System.out.println("==============iterator===========");
		
		Iterator<Character> it = letter.iterator();
		
		while(it.hasNext())
			
		{
			System.out.println(it.next());
		}

	}

}
