
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		char c1=0;
		while(c1<65535) {
			System.out.print(c1+" ");
			c1++;
			if(c1%100==0) {
				System.out.println();
			}
		}
		System.out.println();
		/*
		 * 영문소문자 출력
		 * -a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,
		 */
		char c2='a';
		while(c2<='z') {
			System.out.print(c2);
			System.out.print(",");
			c2++;
		}
		System.out.println();
		/*
		 *  영문소문자 출력
		 *  a,b,c,d,e,
		 *  f,g,h,i,j,
		 *  k,l,m,n,o,
		 *  p,q,r,s,t,
		 *  u,v,w,x,y,
		 *  z,
		 */
		char c3='a';
		int letterCount=0;
		while(c3<='z') {
			System.out.print(c3+" ");
			letterCount++;
			if(letterCount%5==0) {
				System.out.println("\n");
			}
			c3++;
			
		}
		
		System.out.println();
		System.out.println();
		char c7='A';
		while(c7<='Z') {
			System.out.println(c7+" ");
			if((c7-'A'+1)%5==0) {
				System.out.println("\n");
			}
			c7++;
		}
		
		
		
		
		
		/*
		 * Quiz
		 * -한글 출력(가~힣)
		 */
		System.out.println("-----------한글 출력-------------");
		char c4='가';
		while(c4<='힣') {
			System.out.print(c4);
			if((c4-'가'+1)%20==0) {
				System.out.println();
			}
			c4++;
		}
		
		/*
		 * Quiz
		 * -숫자형문자(0~9) 출력
		 */
		System.out.println();
		System.out.println("-----------숫자형 문자 출력-------------");
		 char c5='0';
		 while(c5<='9') {
			 System.out.print(c5);
			 if((c5-'0'+1)%20==0) {
				 System.out.println();
			 }
			 c5++;
		 }
	}

}
