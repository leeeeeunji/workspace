
public class OverLoadingMain {

	public static void main(String[] args) {
		OverLoading overloading = new OverLoading();
		
		overloading.method();
		overloading.method(1,3);
		overloading.method("김수한", 54, 34);
		overloading.method(1, 2, 3);

	}

}
