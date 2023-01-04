package com.itwill.member;

import java.util.*;

public class MemberService {
	private MemberDao memberDao;
	public MemberService() throws Exception {
		this.memberDao = new MemberDao();
	}
	/*
	 * 회원가입
	 * 	- 아이디 중복인 경우, 메세지를 띄운다.
	 */
	 public boolean addMember(Member newMember) throws Exception {
		 boolean isSuccess = false;
		 /*
		  * 아이디 존재여부 체크
		  * 	- 존재하면 메세지
		  * 	- 존재하지 않으면 가입
		  */
		 if(memberDao.findByPrimaryKey(newMember.getM_id()) == null) {
			int rowCount = memberDao.insert(newMember);
			isSuccess = true;
		 }else {
			 isSuccess = false;
		 }
		 
		 return isSuccess;
	 }
	
	/*
	 * 회원 로그인
	 */
	public int login(String id, String password) throws Exception {
		/*
		 * 0 : 성공
		 * 1 : 아이디 존재하지 않음
		 * 2 : 패스워드 불일치
		 */
		int loginResult = -9999;
		Member findMember = memberDao.findByPrimaryKey(id);
		if(findMember == null) {
			//아이디 존재하지 않을 때
			loginResult = 1;
			
		}else {
			//아이디 존재
			if(password.equals(findMember.getM_password())) {
				//패스워드 일치
				loginResult = 0;
			}else {
				//패스워드 불일치
				loginResult = 2;
			}
		}
		return loginResult;
	}
	/*
	 * 회원 아이디 중복 체크
	 */
	public boolean isDuplicateId(String m_id) throws Exception {
		Member findMember = memberDao.findByPrimaryKey(m_id);
		if(findMember == null) {
			return false;
		}else {
			return true;
		}
	}
	
	/*
	 * 회원 상세보기
	 */
	public Member memberDetail(String m_id) throws Exception {
		return memberDao.findByPrimaryKey(m_id);
	}
	
	/*
	 * 회원 수정
	 */
	public int memberUpdate(Member member) throws Exception {
		return memberDao.update(member);
	}
	
	/*
	 * 회원 탈퇴
	 */
	public int memberDelete(String m_id) throws Exception {
		return memberDao.delete(m_id);
	}
	
	/* << admin >>
	 * 회원 전체리스트
	 */
	public List<Member> memberList() throws Exception{
		return memberDao.findAll();
		
	}
	
	/* admin
	 * 회원 전체검색
	 * 회원 이름으로 검색
	 * 회원 주소로 검색
	 * 회원 나이로 검색
	 * 회원 결혼여부로 검색
	 * 회원가입일로 검색
	 */
	

}
