public class SampleSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySoln(95891900);
		}
	
    public static void mySoln(long N) {
        long enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print != 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

}
