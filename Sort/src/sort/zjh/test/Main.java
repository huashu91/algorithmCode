package sort.zjh.test;

import sort.zjh.algorithm.Sort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={52,29,-15,0,37,33,77,29,16,-16};
		int[] correct={-16,-15,0,16,29,29,33,37,52,77};
		int[] re=new int[testArray.length];
		int chs=0;
		switch(chs){
		case 0:re=Sort.bubbleSort(testArray);break;	//采用冒泡排序
		case 1:re=Sort.chooseSort(testArray);break;//采用选择排序
		case 2:re=Sort.simpleInsertSort(testArray);break;//采用简单选择排序
		}
		for(int i=0;i<testArray.length;i++){
				if(re[i]!=correct[i]){
					System.out.println("发生错误");
					return;
				}
			}
		System.out.println("结果正确");
	}

}
