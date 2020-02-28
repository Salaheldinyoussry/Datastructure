package eg.edu.alexu.csd.datastructure.hangman.cs;

import java.io.IOException;
import java.util.Scanner;

public class m {

	public static void main(String[] args) throws Exception {
    Hangman h =new Hangman();
 String[] y=h.readFile("C:\\Users\\OWNER\\Desktop\\54.txt");

 
h.setDictionary(y);
h.selectRandomSecretWord();
h.setMaxWrongGuesses(3);
Scanner in =new Scanner(System.in);
String p;


char c ;
while(true) {
c= in.nextLine().charAt(0);
p=h.guess(c);
if(p==null) {
	break;
}
System.out.println(p);

}



}}
