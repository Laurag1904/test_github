package queue;

public class ArrayQueue {

	private static int front;
	private static int rear;
	private static int capacity;
	private static int [] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int [size];
	}
	/**
	 *  If queue is full it prints full. 
	 *  otherwise, it adds item to the rear of queue and increments the pointer
	 * @param item adds to queue
	 */
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		} else {
			queue[rear]= item;
			rear++;
		}
	}
	/**
	 * queue is empty it prints "queue ist leer".
	 * otherwise it removes first element and updates the pointer
	 * @return the removed element
	 */
	public static int queueDequeue() {
		int firstElement = 0;	
		if(rear == front) {
			System.out.println("Queue ist leer.");
		} else {
			firstElement = queue[front];
			for(int i = 0; i <(rear-1); i++ ) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return firstElement;
	}
	/**
	 * prints all element in the queue. prints queue is empty 
	 * otherwise it iterated the elements from the front to the rear of the queue
	 */
	public static void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue ist leer!");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	/**
	 * retrieves and returns the element at the front of the queue without removing 
	 * @return element at the front of the queue
	 */
	public static int  queueFront() {
		int firstElement =0;
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else{
			firstElement = queue[front];
				
		}
	    return firstElement;
	}
	
	// HÜ: ArrayQueue Testklasse schreiben - alle Methoden von Array Queue testen 
	// Kapitel 5 nochmals durcharbeiten
	
	
}
