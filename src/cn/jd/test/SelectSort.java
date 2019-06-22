package cn.jd.test;
/*
 * 直接选择排序算法实例
 * 
 *@author Li Zhong Wei
 */
public class SelectSort {
	public static void main(String[] args) {
		//创建一个数组，这个数组元素是乱序的
		int[] array={63,4,24,1,3,15};
		//创建直接排序类的对象
		SelectSort sorter = new SelectSort();
		//调用排序对象的方法将数组排序
		sorter.sort(array);
	}
	
	/*
	 * 直接选择排序
	 * 			主要思想：将指定排序位置与其他数组元素分别对比
	 * @param array
	 * 	要排序的数组
	 */
	public void sort(int[] array) {
		int index;
		for(int i=1;i<array.length;i++) {			//交换次数
			index=0;								//记录最小元素下标
			for(int j=1;j<=array.length-i;j++) {	//当前区间最小元素下表
				if(array[j]>array[index]) {     	//如果后面的元素小于当前最小元素，则用Index记录下后面最小元素的下标
					index=j;
				}
			}
			//交换在位置array.length-i和index(最大值)上的两个数
			int temp=array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
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
		for(int i:array) {							//遍历数组
			System.out.print(">" + i);				//输出每个数组元素值
		}
		System.out.println();
	}
}
