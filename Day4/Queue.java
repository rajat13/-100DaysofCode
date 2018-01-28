public interface Queue<T>{
    //Add the item of type t to end of queue
	public void enqueue(T item);
    // Remove and return the element at head of queue
	public T dequeue() throws RuntimeException;
    //Return the number of elements in queue
	public int size();
    // Return boolean whether queue is empty
	public boolean isEmpty();
    // Return the element at head of queue
	public T Top() throws RuntimeException;
	}
