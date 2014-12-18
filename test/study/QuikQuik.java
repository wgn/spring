package study;


/**
 * 经测试最强快速排序法8百万数据2秒ko 最牛的快速算法，内有测试数据8百万级，分享给大家
 * 
 * @authorchulian
 * @seeQuikQuik
 * @version1.0 日期：2011
 **/
public class QuikQuik {
	public static void main(String[] args) {
		int len = 10;
		//int[] a = null;
		/*Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			int t = random.nextInt(80000000);
			a[i] = t;
		}*/
		int[] a = {7,1,5,3,2,0,6};
		p(a);
		
		long s = System.currentTimeMillis();
		sort(0, a.length - 1, a);
		System.out.println();
		System.out.println(a.length + ":" + (System.currentTimeMillis() - s));
		p(a);
	}

	private static void p(int[] a) {
		for(int i : a){
			System.out.print(i + ",");
		}
		System.out.println();
		
	}

	// 快速排序法
	public static void sort(int left, int right, int[] arr) {
		int l = left;
		int r = right;
		int pivot = arr[(left + right) / 2];
		int temp = 0;
		while (l < r) {
			while (arr[l] < pivot)
				l++;
			while (arr[r] > pivot)
				r--;
			if (l >= r)
				break;
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			if (arr[l] == pivot)
				--r;
			if (arr[r] == pivot)
				++l;
		}
		if (l == r) {
			l++;
			r--;
		}
		p(arr);
		if (left < r)
			sort(left, r, arr);
		if (right > l)
			sort(l, right, arr);
	}
}