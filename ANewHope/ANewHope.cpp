#include <iostream>
#include <vector>

class ANewHope{
public:
	static int count(std::vector<int> firstWeek, std::vector<int> lastWeek, int D){
		int weeks = 1;

		std::vector<int> middleWeek;
		middleWeek.clear();
		middleWeek.assign(firstWeek.size(), 0);


		bool equalVector = true;
		for(int z = 0 ; z < middleWeek.size() ; z++){
			if( middleWeek[z] != lastWeek[z] ){
				equalVector = false;
				break;
			}
		}

		while( !equalVector ){


			for(int i = 0 ; i < lastWeek.size() ; i++){
				for(int j = 0 ; j < firstWeek.size() ; j++){
					if(lastWeek[i] == firstWeek[j]){

						int currentPos = j;
						bool equal = false;

						if(middleWeek[currentPos] == lastWeek[i]){
							equal = true;
						}

						while( !equal ){
							
							currentPos += D;

							if( currentPos < firstWeek.size() - 1 ){
								currentPos = 0;
							} else {
								currentPos -= firstWeek.size();
							}

							while( middleWeek[currentPos] != 0 ){
								currentPos++;
							}

							middleWeek[currentPos] = lastWeek[i];

							if(middleWeek[currentPos] == lastWeek[i]){
								equal = true;
							}
						}
					}
				}

			}

			weeks++;
			equalVector = true;
			for(int z = 0 ; z < middleWeek.size() ; z++){
				if( middleWeek[z] != lastWeek[z] ){
					equalVector = false;
					break;
				}
			}	

			firstWeek = middleWeek;
			middleWeek.clear();
			middleWeek.assign(firstWeek.size(), 0);

			if(weeks > ){
				break;
			}
		}

		return weeks;
	}

};

//TESTING

int main(int argc, char* argv[]){

	std::vector<int> firstWeek1;

	firstWeek1.push_back(1);
	firstWeek1.push_back(2);
	firstWeek1.push_back(3);
	firstWeek1.push_back(4);

	std::vector<int> lastWeek1;
	
	lastWeek1.push_back(4);
	lastWeek1.push_back(3);
	lastWeek1.push_back(2);
	lastWeek1.push_back(1);

	int D1 = 3;

	int result1 = ANewHope::count(firstWeek1, lastWeek1 , D1);

	std::cout << std::endl << result1 << std::endl;

	return 0;
}