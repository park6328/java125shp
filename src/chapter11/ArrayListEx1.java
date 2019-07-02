package src.chapter11;

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
		
	hello world
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2);
		
		System.out.println("list1.contailsAll(list2): " +
												list1.containsAll(list2)); //紐⑤뱺 �슂�냼 �룷�븿�븯怨� �엳�쓣 �뻹留�
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		//list2�뿉�꽌 list1�뿉 �룷�븿�맂 媛앹껜�뱾�쓣 �궘�젣�븳�떎.
		//�뮘�뿉�꽌遺��꽣 �떆�옉�븯�뒗 �씠�쑀�뒗 �븵�뿉�꽌遺��꽣 �젣嫄고븯硫� �슂�냼媛� �궘�젣�맆 �븣留덈떎 鍮덇났媛꾩쓣 梨꾩슦湲곗쐞�빐 
		// �굹癒몄� �슂�냼�뱾�씠 �옄由� �씠�룞�쓣 �빐�꽌 �씠�긽�븳 寃곌낵瑜� 媛��졇�삩�떎.
		
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
