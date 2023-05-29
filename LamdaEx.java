package LamdaExpression;

interface Sample {
	public void add();
}

interface Sample2 {

	public int add(int a, int b);
}

interface Sample3 {
	public void add(int a, int b, int c);
}

public class LamdaEx {
	public static void main(String[] args) {
		Sample s = () -> {
			System.out.println("addition");
		};
		s.add();
		Sample2 s1 = (y, z) -> {
			return y + z;

		};
		System.out.println(s1.add(10, 20));
		Sample3 s2 = (a, b, c) -> {
			System.out.println(a + b + c);
		};
		s2.add(20, 40, 700);

	}
}
