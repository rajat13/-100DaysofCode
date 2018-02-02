import java.util.*;
import java.io.*;
public class heap{
	public static void main(String[] args) {
		/*ArrayList<Integer> heaparray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		buildmaxheap(heaparray);
		for(int t:heaparray)System.out.print(t);
		int k= 20;
		addtoheap(heaparray,k);
		System.out.println("");
		for(int n:heaparray)System.out.print(n);
		int max = extractmax(heaparray);
		System.out.println("");
		System.out.print(max);
		System.out.println("");
		for(int n:heaparray)System.out.print(n);*/
		ArrayList<Integer> result = heapsort(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		for(int j:result)System.out.print(j);
	}
	public static int parent(int i) {
		return (int) Math.floor((i-1)/2);
	}
	public static void buildmaxheap(ArrayList<Integer> heap) {
		for(int i=1;i<=heap.size()-1;i++)upheap(heap,i);
	}
	public static void upheap(ArrayList<Integer> array,int i) {
		while(i>=1) {
			int parent = parent(i);
			if(array.get(i)>array.get(parent)) {
				swap(i,parent,array);
				i=parent;
			}
			else break;
		}
	}
	public static void swap(int i,int j,ArrayList<Integer> array) {
		int temp = array.get(i);
		array.set(i,array.get(j));
		array.set(j, temp);
	}
	public static void addtoheap(ArrayList<Integer> heap,int element) {
		heap.add(element);
		upheap(heap,heap.size()-1);
	}
	public static int extractmax(ArrayList<Integer> heap) {
		if(heap.size()==1)return ((Integer)heap.remove(0));
		int max = heap.get(0);
		int temp = heap.remove(heap.size()-1);
		heap.set(0, temp);
		downheap(heap,0);
		return max;
	}
	
	public static void downheap(ArrayList<Integer> heap,int index) {
		int left = 2*index+1;
		int right = 2*index+2;
		if(left<heap.size() && heap.get(index)<heap.get(left)){
			if(right <heap.size() && heap.get(index)<heap.get(right)){
				if(heap.get(left)>heap.get(right)) {
					swap(left,index,heap);
					downheap(heap,left);
				}
				else if(heap.get(right)>heap.get(left)) {
					swap(right,index,heap);
				}
			}
			else {
			swap(left,index,heap);
			downheap(heap,left);
			}
		}
		else if(right<heap.size() && heap.get(index)<heap.get(right)) {
			swap(right,index,heap);
			downheap(heap,right);
		}
	}
	
	public static ArrayList<Integer> heapsort(ArrayList<Integer> heap) {
		int size = heap.size();
		buildmaxheap(heap);
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		if(size<=1)return heap;
		for(int i=0;i<size;i++) {
			resultArray.add(extractmax(heap));
		}
		return resultArray;
	}

}
