package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//Map :HashMap,Hashtable,TreeMap,Properties =>키와 벨류 분리시에는 entry 혹은 element단위로 Iterator이나 Enumeration 이 필요함
public class MapExam {
	public static void main(String[] args) {
		Map<String, Integer>map1 = new HashMap<>();
		Map<String, String>map2 = new Hashtable<>();
		
		Map<Integer, String >map3 = new TreeMap<>();
		Properties map4 = new Properties();
		//list 와 차이점 항상 key 와 value 가 존재
		//index(순서) 가 없다 => 순서유지가 되지않는다
		map1.put("kim", 90); //추가
		map1.put("Lee", 91); //추가
		map1.put("Park", 92); //추가
		map1.put("Kwon", 93); //추가
		System.out.println(map1);
		System.out.println("Park :" +map1.get("Park"));//개별요소 접근시 인덱스가아니라 키로 접근한다
		//맵 순회1 : Iterator에 의한 접근
		//keys = {Kim,lee,park,kang,kwon}
		Iterator<String> keys = map1.keySet().iterator(); //맵의 키모음(keyset)이 하나의 요소로 취급된다
		while(keys.hasNext()){
			String key =keys.next();
			System.out.println(key+"="+map1.get(key));
		
		//맵 순회2 :entryset(키와 값의 쌍=>entry)에 의한 접근
		for(Map.Entry<String, Integer> en: map1.entrySet());
			String key1 = en.getkey
			Integer value = en.Properties
			System.out.println(key1+":"+value);
		//맵 순회 3 :KeySet 에 의한 접근
			System.out.println("keyset에 의한 순회");
			for(String k : map1.keySet()) {
				System.out.println(key1+":"+map1.get(key1));
			}
			
		
		if(map1.containsKey("Park")) {//특정키의 존재유무를 확인한
			
			System.out.println("Park :" +map1.get("Park"));
		}else {
			System.out.println("키가 Park인 요소는 존재하지 않습니다.");
		}
		
		if(map1.containsValue(100)) {//특정 벨류 존재유무를 확인
			System.out.println("100점 이 존재합니다.");
		}else {
				System.out.println("100점이 존재하지않습니다");
		}
		
		map2.put("김", "1코스"); //키는 중복될수없음 중복되면 마지막 값으로나옴
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("김", "2코스");
		map2.put("이", "3코스");
		map2.put("최", "1코스");
		System.out.println(map2);
		map2.remove("김");
		System.out.println("=====편집후====");
		System.out.println(map2);
		map2.clear();
		System.out.println("=====비우기후====");
		System.out.println(map2);
		//배열의 값을 TreeMap에 대입
		String[] names = {"a" ,"b", "c", "d", "e", "f", "g", "h", "i", "j" };
		for(int i=0 ; i<=9; i++) {
			map3.put(i, names[i]);
			
		}
		System.out.println("인원수 : "+map3.size());
		for(Integer i :map3.keySet()) {
			int k = i;
			String value1 = map3.get(i);
			
		}
		//Propertie의 키(필드이름) 과 값은 모두 문자열로 취급된다
		map4.setProperty("name", "김기태");
		map4.setProperty("age", "43");
		map4.setProperty("height", "173.7");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "100");
		
		
		
		
  }
	
 }
}
 
