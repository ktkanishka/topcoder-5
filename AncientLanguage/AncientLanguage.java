import java.util.*;
public class AncientLanguage{
	public int minWords( String[] t ){

		String text = "";
		Vector<String> words = new Vector<String>();

		for( String str : t ){
			text += str;
		}

		int index = 0;
		while( text.length() > 0 ){
			String currentWord;

			if( text.length() == 2 ){
				currentWord = text;
			} else {
				currentWord = text.substring(index, index+2);
			}

			index++;

			if( words.indexOf( currentWord ) == -1 ){
				words.add( currentWord );
				text = text.replaceAll( currentWord, "" );
            	index = 0;
            }
            
            System.out.println( text );
		}


		return words.size();
	}
}