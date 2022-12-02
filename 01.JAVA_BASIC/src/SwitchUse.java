
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수 판별
		 */
		int number=23;
		switch (number%2) {
		case 0:
			System.out.println(number+"은 짝수");
			break;
		case 1:
			System.out.println(number+"은 홀수");
			break;
		}

		char direction='d';
		switch (direction) {
		case 'A':
		case 'a':
			System.out.println("move left~");
			break;
		case 'D':
		case 'd':
			System.out.println("move ringt~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~");
			break;
		case 'X':
		case 'x':
			System.out.println("move down~");
			break;
		case 'S':
		case 's':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move~");
			break;
		}
		
		/*
		 * Quiz : 대소문자 구별없이 A,a 실행하도록 해보세요.
		 */
	}

}
