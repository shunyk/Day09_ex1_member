package com.shunyk.member;

import java.util.Scanner;

import com.shunyk.view.MemberView;

public class MemberController {

	private Scanner sc;
	private Member[] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;
	
	
	public MemberController() { 
		sc = new Scanner(System.in);
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
	}
	
	public void start() {
		
		boolean check = true;
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보 전체출력");
			System.out.println("4. 프로그램 종료");
			int select = this.sc.nextInt();

			switch (select) {
			case 1:
				Member m = mi.memberJoin();
				members=ma.add(members, m);
				break;
			case 2:
				Member member = mi.memberLogin(members);
				if(member != null) {
					System.out.println(member.getId() + "님 환영합니다.");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				mv.view(members);
				break;
			default:
				System.out.println("프로그램 종료");
				check = !check;
				break;
			}
		}

	}

}
