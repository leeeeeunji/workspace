
public class StudentPrint {

	public static void main(String[] args) {
		String str1,str2,str3,name1,name2;
		str1 = "---------------학생 성적출력---------------------";
		str2 = "학번  이름   국어 영어 수학 총점  평균  평점 석차";
		str3 = "-------------------------------------------------";
		name1 = "김경호";
		name2 = "김경수";
		
		
		int num1,num2,kor1,kor2,eng1,eng2,math1,math2,score1,score2,num3;
		num1 = 1;
		num2 = 2;
		kor1 = 70;
		kor2 = 80;
		eng1 = 85;
		eng2 = 75;
		math1 = 90;
		math2 = 95;
		score1 = kor1+eng1+math1;
		score2 = kor2+eng2+math2;
		num3 = 0;
		
		double dou1,dou2;
		dou1=(double)score1/3;
		dou2=(double)score2/3;
		
		char c1;
		c1 = 'F';
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.printf(num1+"    "+name1+"   "+kor1+"   "+eng1+"   "+math1+"   "+score1+"  %.2f   "+c1+"    "+num3+"\n",dou1);
		System.out.printf(num2+"    "+name2+"   "+kor2+"   "+eng2+"   "+math2+"   "+score2+"  %.2f   "+c1+"    "+num3+"\n",dou2);
		System.out.println(str3);
		
		
		
	}

}
