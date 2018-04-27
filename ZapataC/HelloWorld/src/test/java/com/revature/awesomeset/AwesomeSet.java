package test.java.com.revature.awesomeset;

public class AwesomeSet {
	
	private int array[];
	
	public int[] getArraySet() {
		return array;
	}
	
	public void setArraySet (int[] arraySet) {
		this.array = arraySet;
	}
	
	// create set no values
	public static  int checkIsEmpty(int [] a) {
	
	if (a[0] == 0) {
		System.out.println("Array is 0");
		return 0;
	}
		
		return 1;
	}
	public static boolean isUnique(AwesomeSet a) {
		int length = a.getArraySet().length;
		int b [] = a.getArraySet();
		
		for(int i = 0; i < length; i++)
			for(int j = i+1; j < length; j++ ) {
				if (j!=i && b[j] == b[i])
		return false;}
		return true;
	}
	
	public static boolean contains(int newElement, AwesomeSet a) {
		int b [] = a.getArraySet();
		for(int i = 0; i < b.length; i++ ) {
			if(newElement == b[i]) {
				return true;
			} 
			
		}
		return false;
		
	}
	
/*	public static AwesomeSet add(int newElement, AwesomeSet a) {
		int b [] = a.getArraySet();
		if(a.contains(newElement, a)) {
			System.out.println("Cannot add");
			return null;
		}
		else {
			if(a.checkIsEmpty(a.getArraySet())==0) {
				b[0]= newElement;
				return new AwesomeSet(b);
			}
			if(a.checkIsEmpty(a.getArraySet())==1) {
				for(int i = 0; i < b.length; i++ ) {
					if(b[i] == 0)
						b[i] = newElement;
					
				}
			}
		}
	}
	*/

	public AwesomeSet(int[] arraySet) {
		super();
		this.array = arraySet;
	}
}