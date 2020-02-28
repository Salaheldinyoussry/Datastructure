package eg.edu.alexu.csd.datastructure.hangman.cs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Hangman {

	private String[] dictionary;
	private String secretWord;
	private String newSecretWord;
	private int maxGuessNum;
	private int wrongGuessNum;
	
	public String[] readFile(String path) throws IOException
	{String[] words = {};
	try {
		BufferedReader in = new BufferedReader(new FileReader(path));
		int size = 0;
		while(in.readLine() != null) 
			size++;
		in.close();
		
		words = new String[size];
		in = new BufferedReader(new FileReader(path));
		for (int i = 0;i < size;i++)
			words[i] = in.readLine();
		in.close();
		
	}catch (IOException e) {
		System.out.println("ERROR");
	}
	
	return words;
}
	

void setDictionary(String[] words) {
	
	dictionary=words;
		
	
}

String selectRandomSecretWord() {
	
	Random r =new Random();
    int randomIndex=r.nextInt(dictionary.length);
    secretWord=dictionary[randomIndex];
   String temp="";
    for(int i=0; i<secretWord.length(); i++) {
	   temp+='-';
   }
    newSecretWord=temp;
    return secretWord;
}

String guess(Character c) throws Exception {
	if (c==null) {
	return newSecretWord;
	}
	if(!secretWord.matches("^[a-zA-Z]*$"))
	{
		throw new Exception(" buggy secret words");
	}
	
	
	
	
	
	
	int flag=0;
	
	StringBuilder sb=new StringBuilder(newSecretWord);
	
	char t;
	for (int i =0 ; i<secretWord.length(); i++) {
		if(Character.toLowerCase(c) == secretWord.toLowerCase().charAt(i)) {
          t=secretWord.charAt(i);
			sb.setCharAt(i, t);
			flag=1;
		
	}}
		
	newSecretWord=sb.toString();
	
		if(flag==0) {
			wrongGuessNum++;
			}


		if (maxGuessNum<=wrongGuessNum ) {
			System.out.println("you lost!!");

			return null;
		}
		
		if (secretWord.equals(newSecretWord))  {
		System.out.println("you won!!");
			return null;
		}
	return this.newSecretWord;

	
}



void setMaxWrongGuesses(Integer max) {
	if ((int)(max)>0) {
		maxGuessNum=max;
		
	}
	else {
		maxGuessNum=1;
	}
	wrongGuessNum=0;
}

}