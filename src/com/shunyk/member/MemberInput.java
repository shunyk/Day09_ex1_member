package com.shunyk.member;

import java.util.Scanner;

public class MemberInput {
	
	private Scanner sc;
	
	public MemberInput() { 
		sc = new Scanner(System.in);
	}
	
	public Member memberLogin(Member[] members) {
		Member member = null;
		System.out.println("아이디를 입력하세요");
		String yId = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String yPw = sc.next();
		
		for(int i=0; i<members.length; i++) {
			if(members[i].getId().equals(yId) && members[i].getPw().equals(yPw)) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	
	public Member memberJoin() {

		Member member = new Member();
		System.out.println("아이디 입력");
		member.setId(sc.next());
		System.out.println("비밀번호 입력");
		member.setPw(sc.next());
		System.out.println("나이 입력");
		member.setAge(sc.nextInt());
		System.out.println("이메일 입력");
		member.setEmail(sc.next());
		System.out.println("전화번호 입력");
		member.setPhone(sc.next());
		
		return member;
	}
	
}
