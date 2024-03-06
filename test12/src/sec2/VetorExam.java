package sec2;

import java.util.List;
import java.util.Vector;

public class VetorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		//글쓰기
		nVector.add(new Notice("제목1","내용1","정가나"));
		nVector.add(new Notice("제목2","내용2","정다라"));
		nVector.add(new Notice("제목3","내용3","김가나"));
		nVector.add(new Notice("제목4","내용4","김다라"));
		nVector.add(new Notice("제목5","내용5","이가나"));
		nVector.add(new Notice("제목6","내용6","이다라"));
		
		//글목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n:nVector) {//list순회1 (향상된for문)
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		nVector.remove(2);//2번째지우기
		System.out.println("====편집후====");	
		Notice no = new Notice("제목","내용","유정한");
		nVector.set(4,no); //중간에 삽입하기 (인스턴스 인덱스가 4인곳에 삽입)
		for(int i=0; i<nVector.size(); i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
			
		}
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지되고 있으나 Vector는 내용이 없으면 ,메모리에서 자동제거됨(몰라도됨) 
	}

}
