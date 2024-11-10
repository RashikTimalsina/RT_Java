import java.lang.*;
class SentenceBuilder
{
	public static void main(String[] args)
	{

	StringBuilder sentenceBuilder=new StringBuilder();    		//creating 'sentenceBuilder' object 


	sentenceBuilder.append("Ronaldo & Messi  are the greatest footballers ever. ");		//Sentence 1
	
	sentenceBuilder.append(" They both play supernatural football. ");			//Added Sentence 2

	sentenceBuilder.append(" They are also recognized as GOAT. ");				//Added Sentence 3
	

	System.out.println(sentenceBuilder);
	}


}