package study;

import java.util.Random;

public class MyQuickSort1 {

	public static void main(String[] args) {
		int[] a = new int[10000];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			int t = random.nextInt(10000);
			a[i] = t;
		}

		p(a);

		long s = System.currentTimeMillis();
		sort(0, a.length - 1, a);
		System.out.println();
		System.out.println(a.length + ":" + (System.currentTimeMillis() - s));
		p(a);

	}

	public static void sort(int left, int right, int[] arr) {
		int l = left;
		int r = right;
		int m = arr[(l + r) / 2];
		int t = 0;
		while (l < r) {
			while (arr[l] < m)
				l++;
			while (arr[r] > m)
				r--;
			if (l >= r)
				break;

			t = arr[l];
			arr[l] = arr[r];
			arr[r] = t;

			if (arr[l] == m)
				r--;
			if (arr[r] == m)
				l++;
		}

		if (l == r) {
			l++;
			r--;
		}

		if (left < r) {
			sort(left, r, arr);
		}
		if (l < right) {
			sort(l, right, arr);
		}
	}

	private static void p(int[] a) {
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println();

	}

}
