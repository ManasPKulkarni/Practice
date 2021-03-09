package com.devSense.misc;
public class MaxByJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 4, 6, 3};
		int[] b = {1, 3, 2, 4};
		int[] c = {1, 1};
		
		/*
		 * For the sake of problems assume in array of size for blocks, 
		 * 2 frogs are sitting on the same block at the start of the game.
		 * as the game proceeds frogs try to get away from each other farthest 
		 * as possible. 
		 * */
		
		//String frog1 ="frog1";
		//String frog2 ="frog2";
		/* frog1 & frog2 is on position a[0] at the start of the game. */
		
		// Location of the frog
		int pos_frog1 = a[0];
		int pos_frog2 = a[0];
		int hop = 0;
		int distance = 0;
		
		if((pos_frog1 == pos_frog2) && (pos_frog1 == a[0])) {

			/*When Frogs are at a start of an array we should move only one frog
			 *the farthest possible index and then compute the distance*/
			for (int i = 0; i < a.length; i++) {
				if((i < a.length-1) &&(a[i+1] - a[i] >= 0)) {
					pos_frog1 = a[i+1];
					hop++;
					System.out.println(pos_frog1 + " positioned at  " + hop);
				}
				
			}
		}
		
		/* Maximum distance between frog1  and frog 2 at the end of the game 
		 * Number of hops + 1
		 * */
			
		distance = hop +1;
		System.out.println("Distance between Frog1 and Frog2 is : " + distance);
		
		
		/*When Frogs are at a not at start or the end of an array we should move both frogs
		 *in opposite direction the farthest possible index and then compute the distance*/
		
		pos_frog1 = b[2];
		pos_frog2 = b[2];
		
		hop = 0;
		distance = 0;
		
		if((b.length) -1 != pos_frog1)
		{
			System.out.println("Frog 1 position in array b is " + pos_frog1);
			int i = pos_frog1;
			for (int j = i; j < b.length; j++) {
				if((j < b.length-1) &&(b[j+1] - b[j] >= 0)) {
					pos_frog1 = b[j+1];
					hop++;
					System.out.println(pos_frog1 + "  positioned at  " + hop);
				}
				
			}
			int f2 = pos_frog2;
			for (int k = f2; k >=0; k--) {
				if(((k-1) >= 0 ) && (b[k-1] - b[k]+1 >= 0)){
					pos_frog2 = b[k-1];
					hop++;
					System.out.println(pos_frog2 + " positioned at " + hop);
				}
				
			}
		}

		distance = hop + 1;
		System.out.println("Distance between Frog1 and Frog2 is : " + distance);
		
	/*Location for the Frog in Array c*/
		
		pos_frog1 = c[0];
		pos_frog2 = c[0];
		hop = 0;
		distance = 0;
		
		if((pos_frog1 == pos_frog2) && (pos_frog1 == c[0])) {

			/*When Frogs are at a start of an array we should move only one frog
			 *the farthest possible index and then compute the distance*/
			for (int i = 0; i < c.length; i++) {
				if((i < c.length-1) &&(c[i+1] - c[i] >= 0)) {
					pos_frog1 = c[i+1];
					hop++;
					System.out.println(pos_frog1 + " positioned at  " + hop);
				}
				
			}
		}
		
		distance = hop + 1;
		System.out.println("Distance between Frog1 and Frog2 is : " + distance);
	}

}
