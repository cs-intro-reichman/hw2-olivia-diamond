// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);

double c = 0.0;
int i = 0;

for(i = 0 ; i< n; i++){
	if(i%2==0){
c = c + (1.0)/((2*i)+1);
	}else{
		c = c - (1.0)/((2*i)+1);
	}
}

c = 4*c;
double pi = Math.PI;


System.out.println("pi according to Java: " + pi);
System.out.println("pi, approximated:     " + c);
	}
}
