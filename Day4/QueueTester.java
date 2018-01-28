public class QueueTester{
	public static void main(String[] args){
		Queue<Integer> queue1 = new ArrayQueue<Integer>(20);
				Queue<String> queue2 = new LinkedQueue<String>();
				ArrayQueue<Integer> queue3 = new ArrayQueue<Integer>(2);
				Queue<String> queue4 = new LinkedQueue<String>();
				queue2.enqueue("Rajat");
				queue2.enqueue("Is");
				queue2.enqueue("Cool");
				System.out.println(queue2.dequeue());
				System.out.println(queue2.size());
				System.out.println(queue2.dequeue());
				System.out.println(queue2.size());
				System.out.println(queue2.dequeue());
				queue3.enqueue(1);
				queue3.enqueue(2);
				System.out.println(queue3.getArraylength());
				queue3.enqueue(3);
				queue3.enqueue(3);
				System.out.println(queue3.getArraylength());
				System.out.println(queue3.dequeue());
				System.out.println(queue3.size());
				System.out.println(queue3.dequeue());
				System.out.println(queue3.size());
				System.out.println(queue3.dequeue());
		}
}
