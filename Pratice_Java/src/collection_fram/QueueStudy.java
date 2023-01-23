package collection_fram;

import java.util.PriorityQueue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue  qu1 = new PriorityQueue<>();
		
		qu1.add("adc");
		qu1.add("sde");
		qu1.add("weq");
		qu1.add("der");
		qu1.add("ufp");
		qu1.add("tyu");
		
		System.out.println(qu1);
		
		System.out.println(qu1.element());
		System.out.println(qu1.poll());
		System.out.println(qu1);
		
		System.out.println(qu1.peek());
		System.out.println(qu1);
		
	

	}

}
