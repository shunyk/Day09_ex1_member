package com.shunyk.view;

import java.util.Scanner;

import com.shunyk.member.Member;

public class MemberView {
	Member member = new Member();

	public void view(Member member){
		System.out.println("ID : " + member.getId());
		System.out.println("PW : " + member.getPw());
		System.out.println("AGE : " + member.getAge());
		System.out.println("Email : " + member.getEmail());
		System.out.println("Phone : " + member.getPhone());
	}

	public void view(Member[] members) {
		for(int i=0; i<members.length; i++) {
			Member member = members[i];
			System.out.println("ID : " + member.getId());
			System.out.println("PW : " + member.getPw());
			System.out.println("AGE : " + member.getAge());
			System.out.println("Email : " + member.getEmail());
			System.out.println("Phone : " + member.getPhone());
			System.out.println("========================");
		}
	}

}
