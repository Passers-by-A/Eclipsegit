package cn.jd.test;

public class ReverseSort {
	public static void main(String[] args) {
		//创建一个数组
		int[] array= {10,20,30,40,50,60};
		//创建反转排序类的对象
		ReverseSort sorter=new ReverseSort();
		//调用排序对象的方法，将数组反转
		sorter.sort(array);
	}
	/*
	 * 	反转排序
	 * 			主要思想：将数组两边的数替换，显示第一个和最后一个，再接着第二个和倒数第二个
	 * @param array
	 * 	要排序的数组
	 */
	public void sort(int[] array) {
		System.out.println("数组原有内容：");
		showArray(array);				//输出排序前的数组元素
		int temp;
		int len=array.length;
		for(int i=0;i<len/2;i++) {
			temp=array[i];
			array[i]=array[len-i-1];
			array[len-i-1]=temp;
		}
		System.out.println("数组反转后的内容：");
		showArray(array);				//输出排序后的数组元素
	}
	
	/*
	 * 	显示数组中的所有元素
	 *  
	 * @param array
	 * 	要显示的数组
	 */
	public void showArray(int[] array) {
		for(int i : array) {			//遍历数组
			System.out.print("\t"+i);	//输出数组的每个值
		}
		System.out.println();
	}
}
