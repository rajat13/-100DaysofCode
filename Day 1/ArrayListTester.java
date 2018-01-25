/* @author : Rajat Goyal , Email : rajagoyal815@gmail.com
*  @date : 25-01-2018
*/

public class ArrayListTester{
	public static void main(String[] args){
		List<Integer> newList = new ArrayList<Integer>(4);
		System.out.println(newList.size());
		System.out.println(newList.isEmpty());
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		System.out.println("Number of elements present in list is "+newList.size());
		newList.add(6);
		System.out.println("Number of elements present in list is "+newList.size());
		System.out.println(newList.get(4));	
		System.out.println(newList.set(4,9));	
		System.out.println(newList.find(3));	
		}
	}
		
		 
