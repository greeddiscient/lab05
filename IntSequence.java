public class IntSequence {

    // instance variables
    protected int[] myValues;   // sequence elements
    int myCount;                // number of array cells used by sequence

    // constructor
    // capacity: actual size of the array or the (temporary) maximum
    // number of elements it can hold
    public IntSequence(int capacity) {
        // YOUR CODE HERE
    	myValues= new int[capacity];
    	myCount=0;
    	
    }

    // Add the argument to the sequence by placing it in the first
    // unused spot in the array and incrementing the count.
    // Assume that the sequence isn't full.
    public void add(int toBeAdded) {
        // YOUR CODE HERE
    	if (myCount> myValues.length-1){
    		System.err.println("no more space");
    		System.exit(1);
    	}
    	
    	myValues[myCount]=toBeAdded;
    	myCount++;
    	
    }

    // Insert toInsert into the sequence at position insertPos,
    // shifting the later elements in the sequence over to make room
    // for the new element.
    // Assumptions: The array isn't full, i.e. myCount < myValues.length
    // Also, insertPos is between 0 and myCount, inclusive.
    public void insert(int toInsert, int insertPos) {
    	if (insertPos < 0 || insertPos > myCount) {
    		return;
    	}
    	
    	if(insertPos==myCount){
    		myValues[insertPos]=toInsert;
    	}
    	
    	int[] temp=new int[myCount];	
    	for (int i=insertPos;i<myCount;i++ ){
    		temp[i]=myValues[i];
    	}
    	myValues[insertPos]=toInsert;
    	for(int i=insertPos+1; i<=myCount;i++){
    		myValues[i]=temp[i-1];
    	}
    	
       
        myCount++;
    }
    
    

    // other methods go here

    public boolean isEmpty(){
    	if (myCount==0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    public int size(){
    	return myCount;
    }
    
    public int elementAt(int pos){
    	if (pos>myCount){
    		System.err.println("not in sequence");
    		System.exit(1);
    	}
    	
    	return myValues[pos];
    	
    }
    
    public String toString(){
    	String s= new String();
    	for (int i=0;i<=myCount-1;i++){
    		if (i==myCount-1){
    			s+=myValues[i];
    		}
    		else{
    			s= s+myValues[i]+ " ";
    		}
    	}
    	return s;
    }
    
    public void remove(int pos){
    	if (pos < 0 || pos >= myCount) {
			return;
		}
    	if (pos==myCount-1){
    		myCount--;
    		return;
    	}
    	int[] temp=new int[myCount];
		for (int i=pos+1;i<myCount;i++ ){
			temp[i]=myValues[i];
		}
		for(int i=pos; i<myCount-1;i++){
			myValues[i]=temp[i+1];
		}
		myCount--;
		
    }
   
    public boolean contains(int k){
    	for(int i=0;i<myCount;i++){
    		if (myValues[i]==k){
    			return true;
    		}
    	}
    	return false;
    }
    
}

