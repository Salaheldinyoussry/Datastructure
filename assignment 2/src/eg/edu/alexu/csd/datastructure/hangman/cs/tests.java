package eg.edu.alexu.csd.datastructure.hangman.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	
	void test0() throws Exception {
		  Hangman h=new Hangman();
		  String []x=new String[] {"play"};
		  h.setDictionary(x);
          h.selectRandomSecretWord();
		  h.setMaxWrongGuesses(3);
		
		  assertEquals(h.guess('p'),"p---");

    assertEquals(h.guess('y'),"p--y");

    assertEquals(h.guess('l'),"pl-y");

}
	
	
	
	
	void test1() {
  Hangman h=new Hangman();
  String []x=new String[] {"play","lucky"};
   h.setDictionary(x);
   
   
   String []b=new String[] {"do",""};
   h.setDictionary(b);
   
   String []y=new String[] {"google","test"};
   h.setDictionary(y);

	
	}
	
	void test2() throws Exception {
		  Hangman h=new Hangman();
	 String v=h.guess('d');
	
	 String r=h.guess('1');

	 String o=h.guess('t');
	 
	 
	}
	
	void test3() throws Exception {
		  Hangman h=new Hangman();
		  h.setMaxWrongGuesses(4);
		  h.setMaxWrongGuesses(-4);
		  h.setMaxWrongGuesses(45567788);

}
}