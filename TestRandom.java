// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int times = Integer.parseInt(args[0]);
		int greaterCount = 0;
		int lessCount = 0;
		double number = 0.0;

	for (int i = 0 ; i<times ; i++ ){
		number = Math.random();
			if (number> 0.5){ greaterCount = greaterCount + 1;
			}else{
			lessCount = lessCount +1;
		}
	}

		System.out.println( ">0.5: " + greaterCount + " times");
		System.out.println( "<=0.5: " + lessCount + " times");


		if (lessCount>0){
			double ratio = ((double)greaterCount/ lessCount);
			System.out.println( "Ratio: " + ratio);
		}else{
			double ratio = 0;
		}

		
	}
}
