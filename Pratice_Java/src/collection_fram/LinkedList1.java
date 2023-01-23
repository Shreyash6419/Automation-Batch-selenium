package collection_fram;


import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        LinkedList<String> LL = new LinkedList<String>();
		
		LL.add("masterpice");
		LL.add("Shreyash");
		LL.add("classic");
		
		System.out.println(LL);
		
		LL.addFirst("Rockstar");
		
		LL.addLast("confidence");
		
		LL.add(3,"mastermind");
		
		LL.add("Barclays");
		LL.add("BNY Mellon");
		LL.add("synechorn");
		
		
		System.out.println(LL);
		
		LL.remove(2);
		
		System.out.println(LL);
		
		System.out.println(LL.size());
		
		for(int i=0;i<=LL.size()-1;i++)
		{
			System.out.println(LL.get(i));
		}
		
		System.out.println("==============================================");
		
		for( String a1:LL)
		{
			System.out.println(a1);
		}

	}

}
