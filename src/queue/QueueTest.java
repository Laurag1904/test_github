package queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);

		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
			queue.display();
		}
		
		queue.dequeue(1);
		
	}

}
