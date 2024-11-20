// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]){

int n = Integer.parseInt(args[0]);
String mode = args[1];
int i = 2;
String strC = "c";
String strV = "v";

if (mode.equals(strV)){
	System.out.println("1 4 2 1 (4)");
	for (i = 2; i <= n; i++){
		int current = i;
		int counter = 1;
		
		// find out way to make 1: 1421(4)
			while (current != 1){
				System.out.print(current + " ");
					if( current % 2 == 0){
						current = current / 2;
					}else{
						current = (current * 3) + 1;
					}
				counter ++;
					}
				System.out.println("1 (" + counter + ")");
				}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1." );
}else if (mode.equals(strC)){
	for (i = 1; i <= n; i++){
		int current = i;
		int counter = 1;
		
		// find out way to make 1: 1421(4)
			while (current != 1){
					if( current % 2 == 0){
						current = current / 2;
					}else{
						current = (current * 3) + 1;
					}
				counter ++;
					}
				}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1." );
}

}
}


