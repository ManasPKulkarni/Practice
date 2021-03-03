package coupa;

public class AllCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello ");
		
		String str ="abcd";
		int len = str.length();
		AllCombinations allCombinations = new AllCombinations();
		allCombinations.permutate(str, 0, len-1);
	}

	public void permutate(String str, int st, int en) {
		if(st == en) {
			System.out.println(str);
		}
		else {
			for (int i = st; i <= en; i++) {
				str = swap(str, st, i);
				permutate(str, st+1, en);
				str = swap(str, st, i);
			}
		}
		
	}

	private String swap(String str, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
	}

}
