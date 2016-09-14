


import java.util.List;
import java.util.ArrayList;

public class HighSumList {

	static int highestSumList(List<List<Integer>> lst) {
		
		List<Integer> firstList = lst.get(0);
		List<Integer> sumList = new ArrayList<Integer>();
		int j;
		int sum,index;
		int[] temp;
		for (int i=0;i<firstList.size();i++){
			sum=firstList.get(i);
			index=i;
			for (j=1;j<lst.size();j++){
				temp = getMaxDetails(lst.get(j),index);
				index = temp[1];
				sum= sum+temp[0];
			}
			sumList.add(i,sum);
		}
		
		temp=getMaxDetails(sumList,0);
		return temp[0];
	}
	
	//gets the maximum value and its index from a list
	static int[] getMaxDetails(List<Integer> list, int index){
		int[] maxDetails = new int[2];
		int i=0,x ,maxIndex=index, maxValue=0;
		  for (i=index; i<list.size(); i ++) {
			x=list.get(i);
		    if (x>maxValue) {
		      maxValue = x;
		      maxIndex = i;
		    }

		  }
		maxDetails[0]=maxValue;
		maxDetails[1]=maxIndex;
		return maxDetails;
	}
	
	public static void main(String args[])
	{
		 List<List<Integer>> lst = new ArrayList<List<Integer>>();

		  List<Integer> innerList = new ArrayList<Integer>(3);
		  innerList.add(1);
		  innerList.add(0);
		  innerList.add(0);
		  innerList.add(0);
		  lst.add(innerList);
		  innerList = new ArrayList<Integer>(3);
		  innerList.add(2);
		  innerList.add(5);
		  innerList.add(0);
		  innerList.add(0);
		  lst.add(innerList);
		  innerList = new ArrayList<Integer>(3);
		  innerList.add(3);
		  innerList.add(2);
		  innerList.add(1);
		  innerList.add(0);
		  lst.add(innerList);
		  innerList = new ArrayList<Integer>(3);
		  innerList.add(1);
		  innerList.add(3);
		  innerList.add(2);
		  innerList.add(1);
		  lst.add(innerList);
		  
		  int sum = highestSumList(lst);
		  System.out.println("Highest Sum is " + sum);
		
	}
	
	
	
	
}
