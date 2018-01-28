public class LinkedQueue<T> implements Queue<T>{
	private class Node<T>{
		private T item;
		private Node<T> next;
			
		private Node(){
			item = null;	
			next = null;	
			}
		private Node(T item, Node<T> next){
			this.item = item;
			this.next = next;
			}
		}

	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public LinkedQueue(){
		head = null;	
		tail = null;
		size=0;
		}
	
	public void enqueue(T item){
		Node<T> temp = new Node(item,null);
		if(head==null&&tail==null){
			head =temp;
			tail=temp;
			}
		else{
			this.tail.next = temp;
			this.tail=temp;
			}
		size++;
		}
	
	public T dequeue() throws RuntimeException{
		if(this.size ==0){
			throw new RuntimeException("Queue is empty");
			}
		T returnItem = this.head.item;
		if(tail==head){	
			tail=null;
			head=null;
			}
		else{
			head=head.next;
			}
		size--;
		return returnItem;	
		}
	public int size(){
		return this.size;
		}
	public boolean isEmpty(){
		return this.size==0;
		}
	public T Top(){
		if(this.size==0) throw new RuntimeException("Queue is empty");
		T returnItem = head.item;
		return returnItem;	
		}
	}		
