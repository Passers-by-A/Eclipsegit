package cn.jd.test;

public class BubbleSort {
	public static void main(String[] args) {
		//创建一个数组，这个数组元素是乱序的
		int[] array= {36,4,24,1,3,15};
		//创建冒泡排序类的对象
	    BubbleSort sorter=new BubbleSort();
	    //调用排序方法将数组排序
	    sorter.sort(array);
	}
	/*
	 * 冒泡排序
	 * 
	 *			主要思想：将大的数一次一次往后冒
	 * @param array
	 * 			要排序的数组
	 */
	public void sort(int[] array) {
		for(int i=1;i<array.length;i++) {
			//比较相邻两个元素，较大的数往后冒泡
			for(int j=0;j<array.length-i;j++) {
				if(array[j]>array[j+1]) {
					int temp =array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		showArray(array);
	}
	/*
	 * 显示数组中的所有元素
	 *  
	 * @param array
	 * 要显示的数组
	 */
	public void showArray(int[] array) {
		for(int i:array) {
			System.out.print(">" + i );
		}
		System.out.println();
	}
}




