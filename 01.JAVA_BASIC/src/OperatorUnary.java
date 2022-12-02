
public class OperatorUnary {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);

		boolean isPlay = true;
		System.out.println(isPlay);
		isPlay=!isPlay;

		int kor=90;
		boolean isValidScore = kor>=0 && kor<=100;
		System.out.println(isValidScore);
		boolean isInvalidScore = !isValidScore;
		System.out.println(isInvalidScore);
		
		
		/*
		 * 증가, 감소 연산자
		 * 	- 항은 반드시 변수여야 한다.
		 * 	- 형태 : ++(증가), --(감소)
		 * 	- 항변수의 값을 정수 1만큼 증가(또는 감소)시킨 후 항변수에 다시 대입
		 */
		
		System.out.println("----------[++i,--j]----------");
		int i=5;
		int j=5;
		
		++i;// i = i+1;
		--j;// j = j-1;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[i++,j--]----------");
		i=5;
		j=5;
		
		i++;// ++i랑 같음
		j--;// --j랑 같음
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[i++ , ++i]----------");
		i=5;
		j=5;
		System.out.println(++i);
		System.out.println(j++);//j값을 먼저 출력한 다음에 값이 증가해서 일단 5로 뜸
		System.out.println(i);
		System.out.println(j);//여기선 증가된 결과 값이 떠서 6으로 뜸
		
	}

}
