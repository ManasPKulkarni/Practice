import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1,-3};
		
		int val = solution(A);
	}
	
	public static int solution(int [] A) {
	
		int [] input = A;
		int checkval= 0;
		int b =0;
		
		Arrays.sort(input);
		IntStream inputStream = Arrays.stream(input);
		
		OptionalInt a = inputStream.sorted().max();
		if(a.isPresent()){
			 b = a.getAsInt() + 1;
		}	
		
		for (int i = 0; i < input.length; i++) {
			
			if(input[i] >= 0) {

				if((i < input.length-1) && (input[i+1] - input[i] > 1)) {
					b = input[i]+1;
				}
				
			}
			else
				b =1;
			
			
		}
	return b;
		
		
	}

}
