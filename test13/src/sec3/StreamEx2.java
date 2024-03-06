package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//String 타입의 List Stream 방식활용
//Steam.메소드();
public class StreamEx2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("이연정");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		lst.add("박범수");
		
		//ArrayList의 Stream 화 
		Stream<String> stream = lst.stream(); 
		stream.forEach(s->System.out.println(s));
		System.out.println("==정렬후==");
		lst.stream().sorted().forEach(s->System.out.println(s));
		
		//요소수 계산하여 출력
		 int cnt = (int) lst.stream().count();
		 System.out.println("인원수(요소의수) : "+cnt);
		
	
	}
}
