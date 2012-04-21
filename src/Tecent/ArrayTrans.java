package Tecent;

public class ArrayTrans {

	private static int[] transform(int[] a, int[] b) {
		int i = 0;
		b[b.length - 1] = 1;
		for (i = b.length - 2; i >= 0; i--)
			b[i] = a[i + 1] * b[i + 1];
		for (i = 1; i < b.length; i++)
			a[i] = a[i] * a[i - 1];
		for (i = 1; i < b.length; i++)
			b[i] = b[i] * a[i - 1];
		return b;
	}

	private static int[] transform2(int[] a, int[] b) {
		// S=A(0)*A(1)*A(2)****A(N)
		// B(I)=10lgS-lgA(I)
		int i;
		b[0] = 1;
		for (i = 0; i < a.length; i++)
			b[0] *= a[i];
		System.out.println("\nb[0]=" + b[0]);
		for (i = a.length - 1; i >= 0; i--) {
			b[i] = (int) Math.pow(10, (Math.log10(b[0]) - Math.log10(a[i])))+1;
		}
		return b;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		int[] result2 = new int[array.length];
		result2 = transform2(array, result2);
		for (int i = 0; i < result2.length; i++)
			System.out.print(result2[i] + " ");

	}
}
