public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping: a = " +a+ " and b =" +b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping: a = " +a+ " and b =" +b);
	}
}
