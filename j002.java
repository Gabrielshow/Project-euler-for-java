//Java solution to project euler question 2
public final class sum-of-even-fibonacci-numbers{
	
	public String run() {
		int sum = 0;
		int x = 1;  // current Fibonacci number
		int y = 2;  // next Fibonacci number in the sequence
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;
		}
		return Integer.toString(sum);
	}
	
}

public static void main(String[] args) {
		System.out.println(new sum-of-even-fibonacci-numbers().run());
	}