package com.itwill.member.test;

import com.itwill.member.*;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		//System.out.println("0.delete   --> " + memberDao.delete("eeee"));
		
		//Member insertMember = new Member("gggg", "gggg", "현빈", "경기도 구리시", 27, "F", null);
		//System.out.println("1.insert   --> " + insertMember);
		
		//Member updateMember = memberDao.findByPrimaryKey("ffff");
		//updateMember.setM_name("이광수");
		//System.out.println("2.update   --> " + memberDao.update(updateMember));
		
		Member selectId = memberDao.findByPrimaryKey("zzzz");
		System.out.println("3.selectById-> " + selectId);
		
		System.out.println("4.selectAll--> " + memberDao.findAll());
		
	}

}
