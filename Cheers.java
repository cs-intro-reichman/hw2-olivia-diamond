// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

String word = args[0];
int times = Integer.parseInt(args[1]);

String wordUpper = word.toUpperCase();
int length = word.length();

String article = "a";

String specialLetters = "AEFHILMNORSX";

for (int x = 0; x< length ; x++){
                char currentChar = wordUpper.charAt(x);
        if (specialLetters.indexOf(currentChar) != -1){
                System.out.println("Give me an " + currentChar + ":" + " " + currentChar + "!");

        }else{
                System.out.println("Give me a  " + currentChar + ":" + " " + currentChar + "!");  
        }
        
        }

System.out.println("What does that spell?");

for (int i=0 ; i<times ; i++){
        System.out.println(wordUpper + "!!!");
}

        }
                }
