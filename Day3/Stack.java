public interface Stack<T>{
	public void push(T element);
    public T pop() throws RuntimeException;
    public T peek() throws RuntimeException;
    public int size();
    }
