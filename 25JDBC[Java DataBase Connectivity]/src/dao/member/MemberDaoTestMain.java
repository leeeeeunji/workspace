package dao.member;

import java.text.*;
import java.util.*;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		int rowCount = memberDao.delete("aaaa");
		System.out.println("0.delete   --> " + rowCount);
		
		Member newMember2 = new Member("ffff", "ffff", "유재석", "서울시 강남구", 
				30, 'F', null);
		rowCount = memberDao.insert(newMember2);
		System.out.println("1.insert   --> " + rowCount);
		
		Member updateMember = new Member("xxxx", "xxxx", "현빈", "서울시 용산구", 
				35, 'F', null);
		rowCount = memberDao.update(updateMember);
		System.out.println("2.update   --> " + rowCount);
		
		Member selectById = memberDao.findByPrimaryKey("zzzz");
		if(selectById != null) {
			System.out.println(">> " + selectById);
		}else {
			System.out.println("조건에 만족하는 회원 없음");
		}
		System.out.println("3.selectById-> " + selectById);
		
		List<Member> memberList = memberDao.findAll();
		System.out.println("4.selectAll--> " + memberList);
		
	}

}
