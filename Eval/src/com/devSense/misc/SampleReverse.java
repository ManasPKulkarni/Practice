package temp;

public class SampleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
		
		int[] a = { 10, 3, 8, 7, 1, 2, 5};
		
		int index = 2;
		
//		System.out.println(a[0]);
		
		reverseArray(a, index);
		
	}
	
	public static void reverseArray(int [] a, int ind)
	{
		int index = ind +1;
		int [] b = new int [a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(i - index < 0)
			{
				int y = a.length -index + i;
				b[y] = a[i];  
			}
//			else if(i - index == 0)
//			{
//				b[i - index] = a[i] ;
//			}
			else	
			{
				b[i - index ] = a[i];	
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
//		System.out.println(b);
	}

}
