class MergeSort1{
	int[] array;
		int[] tempMergeArr;
			int length;
	public static void main(String[] args){
		int[] inputArr={48,36,13,52,19,94,21};
	MergeSort1 ms = new MergeSort1();
				ms.sort(inputArr);
			
		for(int i:inputArr){
			System.out.print(i+ " ");
		}
	}
	public  void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray (0,length-1);
	}
	public void divideArray(int lowerIndex,int higheIndex){
		if(lowerIndex<higheIndex){
			int middle=lowerIndex + (higheIndex-lowerIndex)/2;
			// it will sort the leftside of an array
			divideArray(lowerIndex,middle);
			//it will sort the right side of an array
			divideArray(middle+1, higheIndex);
		mergeArray(lowerIndex,middle,higheIndex);	
		}
	}
	public void mergeArray(int lowerIndex,int middle,int higheIndex){
		for(int i=lowerIndex; i<=higheIndex; i++){
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higheIndex){
			if(tempMergeArr[i]<=tempMergeArr[j]){
				array[k]=tempMergeArr[i];
				i++;
			}
			else{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
}