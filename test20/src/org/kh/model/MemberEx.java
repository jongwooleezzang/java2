package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import section.Member;

public class MemberEx {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		MemberEx app = new MemberEx();
		app.mainCall();
	}	
		public void mainCall() {
			boolean sw = true;
			while(sw) {
				System.out.println("=== 회원 리스트 ===");
				System.out.println("1. 회원 추가");
				System.out.println("2. 회원 목록");
				System.out.println("3. 회원 삭제");
				System.out.println("4. 프로그램 종료");
				System.out.print("번호 선택 : ");
				int job = sc.nextInt();
				switch(job) {
					case 1:
						add();
						break;
					case 2:
						info();
						break;
					case 3:
						remove();
						break;
					case 4:
						sw = false;
						break;
					default:
						System.out.println("종료");
						sw = false;
				}
			}
		}
		
		public void add() {
			System.out.print("추가할 회원 코드입력 : ");
			int mcode = sc.nextInt();
			System.out.print("추가할 회원 id입력 : ");
			String id = sc.next();
			System.out.print("추가할 회원 비밀번호입력 : ");
			String pw = sc.next();
			System.out.print("추가할 회원 이름 입력 : ");
			String name = sc.next();
			System.out.print("추가할 회원 생년월일 입력 : ");
			int year = sc.nextInt();
			System.out.print("추가할 회원 연락처 입력 : ");
			String tel = sc.next();
			memList.add(new Member(mcode, id, pw, name , year, tel));
			System.out.println("회원 정보가 추가되었습니다.");
		}
		
		public void info() {
			for(Member f : memList ) {
				System.out.println(f.toString());
				
		
			}
		}
		
		public void remove() {
			System.out.print("삭제하고 싶은 회원 선택 : ");
			String name = sc.next();
			Member mem;
			for(int i=0;i<memList.size();i++) {
				mem = memList.get(i);
				if(mem.getName().equals(name)) {
					System.out.println(mem.toString()+"이 삭제되었습니다.");
					memList.remove(i);
				}
			}
		}
		
}

