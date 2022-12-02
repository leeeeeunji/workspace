
public class StudentScorePrint {

	public static void main(String[] args) {
		
		int num1;
		String name1;
		int kor1,eng1,math1;
		int score1;
		double avg1;
		int rank1;
		
		int num2;
		String name2;
		int kor2,eng2,math2;
		int score2;
		double avg2;
		int rank2;
		
		num1=1;
		name1="김경호";
		kor1=70;
		eng1=75;
		math1=85;
		rank1=0;
		
		num2=2;
		name2="김경수";
		kor2=80;
		eng2=90;
		math2=100;
		rank2=0;
		
		score1=kor1+eng1+math1;
		avg1=score1/3.0;
		
		score2=kor2+eng2+math2;
		avg2=score2/3.0;
		
		
		if(kor1<0 || kor1>100) {
			System.out.println(kor1+"은 유효한 점수가 아닙니다.");
			return;
		}
		if(kor2<0 || kor2>100) {
			System.out.println(kor2+"은 유효한 점수가 아닙니다.");
			return;
		}
		if(eng1<0 || eng1>100) {
			System.out.println(eng1+"은 유효한 점수가 아닙니다.");
			return;
		}
		if(eng2<0 || eng2>100) {
			System.out.println(eng2+"은 유효한 점수가 아닙니다.");
			return;
		}
		if(math1<0 || math1>100) {
			System.out.println(math1+"은 유효한 점수가 아닙니다.");
			return;
		}
		if(math2<0 || math2>100) {
			System.out.println(math2+"은 유효한 점수가 아닙니다.");
			return;
		}
		
		char gra1='X';
		switch ((int)avg1/10) {
		case 9:
			gra1 = 'A';
			break;
		case 8:
			gra1 = 'B';
			break;
		case 7:
			gra1 = 'C';
			break;
		case 6:
			gra1 = 'D';
			break;

		default:
			gra1 = 'F';
			break;
		}
		
		char gra2='Z';
		switch ((int)avg2/10) {
		case 9:
			gra2 = 'A';
			break;
		case 8:
			gra2= 'B';
			break;
		case 7:
			gra2= 'C';
			break;
		case 6:
			gra2= 'D';
			break;
			
		default:
			gra2= 'F';
			break;
		}
	
		
		
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("학번  이름   국어 영어 수학 총점 평균 평점 석차\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%d    %s   %d   %d   %d   %d %.1f   %c    %d \n",num1,name1,kor1,eng1,math1,score1,avg1,gra1,rank1);
		System.out.printf("%d    %s   %d   %d   %d  %d %.1f   %c    %d \n",num2,name2,kor2,eng2,math2,score2,avg2,gra2,rank2);
		System.out.printf("-----------------------------------------------\n");
		
		
		
		

	}

}
