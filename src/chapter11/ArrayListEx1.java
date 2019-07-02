package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2);
		
		System.out.println("list1.contailsAll(list2): " +
												list1.containsAll(list2)); //모든 요소 포함하고 있을 떄만
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		//뒤에서부터 시작하는 이유는 앞에서부터 제거하면 요소가 삭제될 때마다 빈공간을 채우기위해 
		// 나머지 요소들이 자리 이동을 해서 이상한 결과를 가져온다.
		
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		
		print(list1,list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
