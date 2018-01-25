/**
*  @author : Rajat Goyal, email : rajagoyal815@gmail.com
*  @Date   : 25/01/2018
*
*/
public class ArrayList<T> implements List<T>{

	private int size;
	private int current;
	private T[] array;
	private static int DEFAULT_CAPACITY =10;
	private static int DEFAULT_ERROR_CODE =-1;
	private static int FACTOR = 2;

    // Create an empty ArrayList of Object type T with DEFAULT_CAPACITY 
	public ArrayList(){
		this(DEFAULT_CAPACITY);
		}

    //Create empty Arraylist of specified capacity with object types t
	public ArrayList(int capacity){
		size = 0;
		current =0;
		array = (T[]) new Object[capacity];
		}


	/**  @param: T element
	*    If ArrayList is already full ,first grow the list , add element to list at end and update size 
	**/
	public void add(T element){
		if(this.size==array.length){
			grow();
			}
		array[size]=element;
		size++;
		System.out.println("Element "+ element +" added at index "+ ((this.size)-1));
		}

	/** @param int index
	*   @param T element
	*   Add te element at specified index, shift the elements if neccesary
	*   case 1 :index greater than size : throw exception
	*   case 2: index equal to size of list(new element at end of list) follow add method;
	*   case 3: index between start and end: shift the elements forward from index to end , insert element at index and update the size
	*/  
	public void add(int index, T element) throws IndexOutOfBoundsException{
		if(index>=0 || index<array.length){
			if(index<this.size){
				if(this.size==array.length)grow();
				for(int i = this.size-1;i>=index;i--){
					array[i+1]=array[i];
					}
				array[index]=element;
				size++;
		System.out.println("Element "+ element +" added at index "+ index);

			}	}
		else if(index==array.length){
			add(element);
			}
			else throw new IndexOutOfBoundsException();
			}

	/* @param index
	*Return the element at specified index if index is valid
	*/
	public T get(int index) throws IndexOutOfBoundsException{
		if(index<0 || index>=this.size) throw new IndexOutOfBoundsException();
		return array[index];
		}

	/* @param index, element
	*Replace the element at specified index with specified element and return the replaced element
	*/
	public T set(int index, T element) throws IndexOutOfBoundsException{
		if(index>=this.size) throw new IndexOutOfBoundsException();
		T returnElement = array[index];
		array[index]=element;
		return returnElement;		
		}

	// Return number of elements in list 
	public int size(){
		return this.size;
		}

    //return whether list is empty
	public boolean isEmpty(){
		return this.size==0;
		}
	//find the first occurence of element specified and return its index otherwise return DEFAULT_ERROR_CODE;
	public int find(T element){
		int returnIndex = DEFAULT_ERROR_CODE;
		for(int i=0;i<this.size;i++){
			if(array[i].equals(element)){
				returnIndex = i;
				break;
				}
			}
		return returnIndex;
		}

/* @param index
*  Check if index is valid then shift the elements backwards from index to end make last element null, update the size and return the element at index*/ 
	public T remove(int index) throws IndexOutOfBoundsException{
		if(index<0 || index>=this.size) throw new IndexOutOfBoundsException();
		T returnElement = array[index];
		for(int i = index+1;i<this.size;i++){
			array[i-1]=array[i];
			}
		array[this.size]=null;
		this.size--;
		System.out.println("Element at index"+index+" removed");
		return returnElement;
		}


//Grow the array by initializing new array of size FACTOR times original array, copying all elements to new array and changing reference of old array to new
	private void grow(){
		int numElements = this.size;
		int arrayLength = array.length;
		T[] tempArray = (T[])new Object[FACTOR*arrayLength];
		for(int i=0;i<this.size;i++){
			tempArray[i] = array[i];	
			}
		array = tempArray;
		System.out.println("ArrayList increased by factor"+FACTOR);
}

	}
		
