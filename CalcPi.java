// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int max = Integer.parseInt(args[0]);

int i = 0;
double piApprox1 = 0;
double piApprox2 = 0;
double pi = Math.PI;

while (i<max){
	double sum = (1.0/(1+(2*i)));
	piApprox1 = piApprox1 + sum;
	i=i+2;
}

i= 1;
while (i<max){
	double sum = (1.0/(1+(2*i)));
	piApprox2 = piApprox2 - sum;
	i=i+2;
}

double piApproxTotal = (double)piApprox1 + piApprox2;

System.out.println("pi according to Java: " + pi);
System.out.println("pi, approximated:     " + (piApproxTotal*4.0));

	}
}
