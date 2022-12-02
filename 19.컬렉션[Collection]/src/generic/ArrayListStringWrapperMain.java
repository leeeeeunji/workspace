package generic;

import java.util.*;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("-----------1. add------------");
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("KIM");
		nameList.add("JIM");
		nameList.add("HIM");
		nameList.add("YIM");
		nameList.add("TIM");
		nameList.add("KIM");
		nameList.add("FIM");
		nameList.add(new String("DIM"));
		System.out.println(nameList);
		System.out.println("-----------2. get(index)------------");
		System.out.println(nameList.get(1));
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(5));
		
		System.out.println("------------3. remove(index)-------------");
		nameList.remove(1);
		System.out.println(nameList);
		System.out.println("-----------3. remove(element)------------");
		nameList.remove(new String("TIM"));
		System.out.println(nameList);
		/*
		<<boolean java.util.ArrayList.remove(Object o)>>
		Removes the first occurrence of the specified element from this 
		 */
		nameList.remove("KIM");
		System.out.println(nameList);
		
		System.out.println("-----------------wrapper-----------------");
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(12);
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println("-----------------1. get------------------");
		int score1 = scoreList.get(2);
		System.out.println(score1);
		int score2 = scoreList.get(scoreList.size()-1);
		System.out.println(score2);
		System.out.println("-----------------2. set------------------");
		scoreList.set(2, 99);
		System.out.println(scoreList);
		
		System.out.println("----------------3. remove----------------");
		/*
		<<Integer java.util.ArrayList.remove(int index)>>
		 */
		scoreList.remove(5);
		/*
		 * Removes the first occurrence of the specified element from this list
		 */
		scoreList.remove(new Integer(90));// -> 인덱스가 아닌 값을 가리키는 것
		System.out.println(scoreList);
		
		
		
	}

}
