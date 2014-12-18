package study;

import java.util.Random;

public class MyQuickSort {

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
	
	public static void sort(int left,int right,int[] arr){
		int l = left;
		int r = right;
		
		int middle = arr[(left+right)/2];
		int temp = 0;
		
		while(l<r){
			while(arr[l]<middle) l++;
			while(arr[r]>middle) r--;
			
			if(l>=r) break;

			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			if(arr[l]==middle) r--;
			if(arr[r]==middle) l++;
			
		}
		
		if(l==r){
			l++;
			r--;
		}
		
		if(left < r){
			sort(left,r,arr);
		}
		if(right > l){
			sort(l,right,arr);
		}
	}

	private static void p(int[] a) {
		for(int i : a){
			System.out.print(i + ",");
		}
		System.out.println();
		
	}
}
