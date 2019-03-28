package com.shunyk.main;

import com.shunyk.member.Member;
import com.shunyk.member.MemberController;
import com.shunyk.member.MemberInput;
import com.shunyk.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		MemberInput mi = new MemberInput();
		MemberView mv = new MemberView();
		MemberController mc = new MemberController();


		/*
		//Member m = mi.memberJoin();
		//mv.view(m);
		Member[] members = new Member[100];
		for(int i=0; i<members.length; i++) {
			Member member= new Member();
			member.setId("id" + i);
			member.setPw("pw" + i);
			members[i] = member;
		}
		//members[0]= new Member();
		//members[0].setId("1234");
		//members[0].setPw("5678");
		
		Member member=mi.memberLogin(members);
		
		if(member != null) {
			System.out.println("로그인 성공");
		}*/
		mc.start();
		
	}

}
