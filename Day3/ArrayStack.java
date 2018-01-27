public class ArrayStack<T> implements Stack<T>{
    private static int DEFAULT_CAPACITY = 100;
    private T[] array = null;
    private int top;
  
    public ArrayStack(){
        this(0);
        }
    public ArrayStack(int capacity){
        array = (T[]) new Object[capacity];
        top = -1;
        }
    public void push(T item) throws RuntimeException{
        if(top+1==array.length){
              resize();
              }
        top++;
        array[top] = item;
        }
    public T pop(){
        if(top<0){
           throw new RuntimeException("Stack Underflow");
           }
        T returnItem = array[top];
        top--;
        return returnItem;
        }
    public T peek(){
       if(top<0){
          throw new RuntimeException("Stack is empty");
          }
       return array[top];
       }
    public int size(){
       return top+1;
    }
private void resize(){
    T[] newArray = (T[]) new Object[2*array.length];
    for(int i=0;i<this.top+1;i++){
        newArray[i] = array[i];
        array = newArray;
        }
	}
}
