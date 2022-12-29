package dao.address;

import java.util.*;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao에서
		 * AddressDaoMain으로 데이타 리턴(전달)
		 */
		
		AddressDao addressDao = new AddressDao();
		System.out.println("1. insert");
		Address newAddress = new Address(0, "홍홍홍", "111-1111", "대구시민");
		int rowCount = addressDao.insert(newAddress);
		System.out.println(">> insert row count : " + rowCount);
		
		System.out.println("2. update");
		Address updateAddress = new Address(5, "김변경", "123-1234", "주소변경");
		rowCount = addressDao.update(updateAddress);
		System.out.println(">> update row count : " + rowCount);
		
		System.out.println("3. delete");
		rowCount = addressDao.delete(15);
		System.out.println(">> delete row count : " + rowCount);
		
		System.out.println("3. findByPrimaryKey");
		Address findAddress = addressDao.findByPrimaryKey(10);
		if(findAddress!=null) {
			System.out.println(">> " + findAddress);
		}else {
			System.out.println(">> " + "조건에 만족하는 주소록 존재하지 않음");
		}
		System.out.println(addressDao.findByPrimaryKey(1));
		System.out.println(addressDao.findByPrimaryKey(2));
		System.out.println(addressDao.findByPrimaryKey(3));
		
		System.out.println("4. findAll");
		List<Address> addressList = addressDao.findAll();
		System.out.println(addressList);
		
	}

}
