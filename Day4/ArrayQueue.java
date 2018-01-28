public class ArrayQueue<T> implements Queue<T>{
	private T[] array;
	private int top;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 20;
	public static final int FACTOR =2;

	public ArrayQueue(){
		this(DEFAULT_CAPACITY);
		}
	
	public int getArraylength(){
		return array.length;
		}
	public ArrayQueue(int capacity){
		array = (T[]) new Object[capacity];
		top=0;
		size=0;
		}
	public void enqueue(T item){
		if(size==array.length){
			resize();
			}
		int index = (top+size)%array.length;
		array[index] = item;
		size++;
		}

	public T dequeue() throws RuntimeException{
		if(this.size==0) throw new RuntimeException();
		T returnItem = array[top];
		top = (top+1)%array.length;
		size--;
		return returnItem;
		}
	public int size(){
		return this.size;
		}

	public boolean isEmpty(){
		return this.size==0;
		}
	private void resize(){
		T[] newArray = (T[]) new Object[FACTOR*array.length];
		if((top+size-1)%array.length>top){
			for(int i=0;i<array.length;i++){
				newArray[i]=array[i];
				}
			}
		else{
			for(int i=0;i<array.length-top;i++){
				newArray[FACTOR*array.length-1-i]=array[array.length-1-i];
			}
			for(int j=0;j<(top+size)%array.length;j++){
				newArray[j]=array[j];
				}
			top = top+(FACTOR-1)*array.length;
			
			}
			array=newArray;
		}

	public T Top() throws RuntimeException{
		if(this.size==0)throw new RuntimeException("Queue is empty");
		return array[top];
		}

	}
		
