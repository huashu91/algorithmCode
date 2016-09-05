package sort.zjh.algorithm;

public class Sort {
	
	/**简单冒泡排序
	 * @param o 待排序数组
	 * @return 排序结果
	 */
	public static int[] bubbleSort(int[] o){
		int temp=0;
		for(int i=1;i<o.length;i++){
			for(int j=0;j<o.length-i-1;j++){
				if(o[j]>o[j+1]){
					temp=o[j];o[j]=o[j+1];o[j+1]=temp;
				}
			}
//			System.out.println("第"+(i+1)+"趟排序结果："+Arrays.toString(o));
		}
		return o;
	}
	
	/**简单选择排序
	 * @param o
	 * @return
	 */
	public static int[] chooseSort(int[] o){
		int temp=0;
		int num=-1;//num记录最大值位号，初始设为-1
		for(int i=0;i<o.length-1;i++){
			num=0;
			for(int j=1;j<o.length-i;j++){
				if(o[num]<o[j])num=j;
			}
			temp=o[num];o[num]=o[o.length-i-1];o[o.length-i-1]=temp;
//			System.out.println("第"+(i+1)+"趟排序结果："+Arrays.toString(o));
		}
		return o;
	}
	
	public static int[] simpleInsertSort(int[] o){
		int temp=0;
		for(int i=1;i<o.length;i++){
			temp=o[i];
			for(int j=0;j<i;j++){
				o[i-j]=o[i-1-j];
				if(o[i-1-j]<=temp){
					o[i-j]=temp;
					break;
				}
				if(i==j+1)o[0]=temp;
			}
//			System.out.println("第"+(i)+"趟排序结果："+Arrays.toString(o));
		}
		return o;
	}
}
