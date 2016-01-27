#include <iostream>
#include <vector>
#include <string>

class Aaagmnrs{
public:
	static std::vector<std::string> anagrams(std::vector<std::string> phrases){

		// Nested for loop to compare phrases against each other.

		for( int i = 0 ; i < phrases.size() ; i++ ){
			
			for( int j = 0 ; j < phrases.size() ; j++ ){

				// Creating temporary variables to do edits on without changing original vector.

				std::string newString = "", tmp1, tmp2;

				tmp1 = phrases[i];
				tmp2 = phrases[j];

				// Removing spaces from the phrases.

				std::size_t spaces = tmp1.find(" ");
				std::size_t spaces2 = tmp2.find(" ");

				while(spaces != std::string::npos || spaces2 != std::string::npos){

					if(spaces != std::string::npos){
						tmp1.erase( tmp1.begin() + spaces );
					}

					if(spaces2 != std::string::npos){
						tmp2.erase( tmp2.begin() + spaces2 );
					}

					spaces = tmp1.find(" ");
					spaces2 = tmp2.find(" ");
				}

				// Checking to make sure phrases aren't compared against themselves or phrases of different lengths.

				if( i != j && tmp1.length() == tmp2.length() ){
					
					// Searching the second phrase for the letters in the first.

					for( int k = 0 ; k < tmp1.length() ; k++ ){

						bool found = false;

						for( int x = 0 ; x < tmp2.length() ; x++ ){

							// Comparing each letter to one another in lowercase format.

							if( tolower( tmp1.at( k ) ) == tolower( tmp2.at( x ) ) ){

								found = true;							// The letter has been found.
								newString.push_back( tmp2.at( x ) );	// Adding the letter to the newString variable for later comparison.
								tmp2.erase( tmp2.begin() + x );			// Removing the used letter from the phrase.
								break;
							}
						}

						if(!found){
							break;
						}
					}

					// Comparing the original phrase to the newString built phrase.

					bool equal = true;
					if(tmp1.length() == newString.length()){
						for( int k = 0 ; k < tmp1.length() ; k++ ){
							if( std::tolower( tmp1.at( k ) ) != std::tolower( newString.at( k ) ) ){
								equal = false;
								break;
							}
						}
					} else {
						equal = false;
					}
					
					// Removing the anagram phrase from the vector.

					if( equal ){
						phrases.erase( phrases.begin() + j );
						i--;	// This fixed a bug where some items were being skipped, although now more duplicate comparisons are being made. IDK.
					}
				}				
			}
		}
		return phrases;
	}
};