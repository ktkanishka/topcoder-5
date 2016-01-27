public class BreakingTheCode{
	public String decodingEncoding( String code, String message ){
		String output = "";
		if( Character.isDigit( message.charAt( 0 ) ) ){
			for( int i = 0 ; i < message.length() ; i += 2 ){
				System.out.println( message );
				int index = Integer.parseInt( message.substring( i, i+2 ) );
				output += code.charAt( index - 1 );
			}
		} else {
			for( int i = 0 ; i < message.length() ; i ++ ){
				int index = code.indexOf( Character.toString( message.charAt( i ) ) );
				if( index < 10 )
					output += "0";
				output += ( index + 1 );
			}
		}
		return output;
	}
}