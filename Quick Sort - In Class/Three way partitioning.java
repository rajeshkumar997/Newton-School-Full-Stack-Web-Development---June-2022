public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal)
{
	// Your code here
	//a = [1 8 3 3 4]
	//loVal = 3
	//highVal = 5
	int size = A.size();
	ArrayList<Integer>arrli = new ArrayList<Integer>(size);
	//arrli = []
	//put all elements smaller than lowvalin arrli
	for(int i=0; i<size; i++){
		if(A.get(i) < lowVal){
			arrli.add(A.get(i));
		}
	}
	// arrli = [1]
	// put allelement in the range intoarrli
	for(int i=0; i<size;i++){
		if(A.get(i) >= lowVal && A.get(i) <= highVal){
			arrli.add(A.get(i));
		}
	}
	//arrli = [1 3 3 4]
	//put all elements greater than highVal intoarrli
	for(int i=0; i<size;i++){
		if(A.get(i)> highVal){
			arrli.add(A.get(i));
		}
	}
	return arrli;
	//arrli = [1 3 3 4 8]
}
