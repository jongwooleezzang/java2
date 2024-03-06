package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set : 값만 저장,중복을 허용하지 않는다.(Map은 허용) 순서유지 하지 않음 
//Set의 종류: HashSet, TreeSet
public class SetEx {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("김기태");
		set1.add("이정희");
		set1.add("이예린");
		set1.add("이종우");
		set1.add("김기태");
		set1.add("이성하");
		set1.add("이민규");
		set1.add("이원석");
		set1.add("이연정");
		
		System.out.println("요소의 수 :"+set1.size()); //9개를 추가했으나 중복이 발생하여 8개 중복허용 x
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 :");
		String name =sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당이름이 존재합니다.");
		}else {
			set1.add(name);
			System.out.println("없습니다.");
		}
		
		set1.remove("김기태"); //set1에 특정요소 삭제
        set1.clear();    //set1 비우기		
		
		
		if(set2.isEmpty()) {
			System.out.println("set2 가 비어있습니다");
		}else {
			System.out.println("set2 요소의 수: "+set2.size());
			
		}
		
		Set<Integer> set3 = new TreeSet<>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		//Set 의 순회 (향상된  for 문)
		for(Integer s:set3) {
			System.out.print
			(s);
		}
		//Set 의 순회 Iterator에 의한 순회
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print
			(it.next()+"\t");
			
		}
		
   }
}


