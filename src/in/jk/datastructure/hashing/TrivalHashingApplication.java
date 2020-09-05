package in.jk.datastructure.hashing;

public class TrivalHashingApplication {
	
	
	// Index Mapping hashing 

	int[] dataArray = new int[10];

	public void add(int data) {
		int index =findIndex(data);
        dataArray[index] = data;
	}

	public int get(int data) {
		int index =findIndex(data);
	    return dataArray[index];
	}

	private int findIndex(int data) {

		int length = dataArray.length;
        int index = data / length;
        return index;
	}

	public static void main(String[] args) {

		TrivalHashingApplication hashingApplication = new TrivalHashingApplication();
		hashingApplication.add(10);
		hashingApplication.add(30);
		hashingApplication.add(40);
		hashingApplication.add(50);
		hashingApplication.add(20);
		hashingApplication.add(60);
		hashingApplication.add(70);
		hashingApplication.add(80);
		hashingApplication.add(90);
		System.out.println(hashingApplication.get(70));
	
	}

}
