package com.itwill.address;

import java.util.*;
/*
* - 주소록관리 비즈니스로직(업무)을 수행하는 클래스
* - GUI객체(스윙,서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스
* - AddressDao객체 를 이용해서 데이타에 접근하는 클래스
*/
public class AddressService {
	private AddressDao addressDao;
	
	public AddressService() throws Exception {
		addressDao = new AddressDao();
	}
	/*
	 * 주소록쓰기
	 */
	public int addressWrite(Address address) throws Exception {
		return addressDao.insert(address);
	}
	/*
	 * 주소록 번호로 1개 보기
	 */
	public Address addressDetail(int no) throws Exception {
		return addressDao.findByPrimaryKey(no);
	}
	/*
	 * 주소록 번호로 1개 수정
	 */
	public int addressUpdate(Address updateAddress) throws Exception {
		return addressDao.update(updateAddress);
	}
	/* 
	 * 주소록 번호로 삭제하기
	 */
	public int addressDelete(int no) throws Exception {
		return addressDao.delete(no);
	}
	/*
	 * 주소록 전체보기
	 */
	public List<Address> addressList() throws Exception {
		return addressDao.findAll();
	}
	
}
