#include <iostream>
#include <string>
#include <sstream>
#include <iterator>
#include <vector>

class AustrianLotto{
public:
	 static std::vector<int> evaluate(std::string drawing, std::vector<std::string> picks){

	 	// Splitting the drawing vector into parts.

	 	std::stringstream ss2(drawing);
		std::istream_iterator<std::string> begin2(ss2);
		std::istream_iterator<std::string> end2;
		std::vector<std::string> drawingParts(begin2, end2);

		// Creating the results vector with size of the parts.

		std::vector<int> results;
	 	results.assign(drawingParts.size() + 1, 0);

	 	// Iterating through the different picks.

	 	for(int i = 0 ; i < picks.size() ; i++){

	 		// Splitting the current pick into its parts.

	 		std::stringstream ss(picks[i]);
			std::istream_iterator<std::string> begin(ss);
			std::istream_iterator<std::string> end;
			std::vector<std::string> picksParts(begin, end);

			int matches = 0;		// The amount of matches with the current draws number.

			// Iterating through the parts of the current pick.

			for(int j = 0 ; j < picksParts.size() ; j++){
				for(int k = 0 ; k < picksParts.size() ; k++){

					// Parsing the string parts to integers.

					int pick = std::stoi(picksParts[j]);
					int draw = std::stoi(drawingParts[k]);

					// Incrementing the matches for the current draws number.

					if( pick == draw ){
						matches++;
					}
				}
			}

			results[matches] = results[matches] + 1;		// Incrementing the results vector position if there were that many matches in the picks.

	 	}
	 	return results;
	 }
};

// TESTING

/*
int main(int argc, char* argv[]){


	std::string testDrawing = "3 11 18 23 37 45";
	std::vector<std::string> testPick;

	testPick.push_back("4 7 14 30 33 35");
	testPick.push_back("1 11 12 25 37 38");
	testPick.push_back("11 18 19 20 21 22");

	std::vector<int> result = AustrianLotto::evaluate(testDrawing, testPick);

	for(int i = 0 ; i < result.size() ; i++){
		std::cout << result[i] << " ";
	}

	std::cout << std::endl;

	return 0;
}
*/