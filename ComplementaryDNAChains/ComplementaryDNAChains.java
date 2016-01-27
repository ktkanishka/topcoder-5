public class ComplementaryDNAChains{
    public int minReplaces( String first, String second ){
        if( first.length() != second.length() ){
            return -1;
        }
        
        if( first == second ){
            return 0;
        }
        
        int count = 0;
        for( int i = 0 ; i < first.length() ; i++ ){
            if( first.charAt( i ) == 'A' && second.charAt( i ) != 'T' ){
                count++;
            } else if( first.charAt( i ) == 'T' && second.charAt( i ) != 'A' ){
                count++;
            } else if( first.charAt( i ) == 'C' && second.charAt( i ) != 'G' ){
                count++;
            } else if( first.charAt( i ) == 'G' && second.charAt( i ) != 'C' ){
                count++;
            }
        }
        return count;
    }
}