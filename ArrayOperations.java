public class ArrayOperations {

	// Delete the value at the given position in the argument array,
	// shifting all the subsequent elements down, and storing a 0
	// as the last element of the array.
	public static void delete (int[] values, int pos) {
		if (pos < 0 || pos >= values.length) {
			return;
		}
		// YOUR CODE HERE
		int[] temp=new int[values.length];
		for (int i=pos+1;i<values.length;i++ ){
			temp[i]=values[i];
		}
		for(int i=pos; i<values.length-1;i++){
			values[i]=temp[i+1];
		}
		values[values.length-1]=0;
	}
	
	// Insert newInt at the given position in the argument array,
	// shifting all the subsequent elements up to make room for it.
	// The last element in the argument array is lost.
	public static void insert (int[] values, int pos, int newInt) {
		if (pos < 0 || pos >= values.length) {
			return;
		}
		
		// YOUR CODE HERE
		int[] temp=new int[values.length];	
		for (int i=pos;i<values.length;i++ ){
			temp[i]=values[i];
		}
		values[pos]=newInt;
		for(int i=pos+1; i<values.length;i++){
			values[i]=temp[i-1];
		}
	}
	
	public static int[] zip(int[] a1, int[]a2){
		int[] result= new int[a1.length+a2.length];
		for(int i=0;i<result.length;i++){
			if (i%2==0){
				result[i]=a1[i/2];
			}
			else{
				result[i]=a2[i/2];
			}
		}
		return result;
	}
}
