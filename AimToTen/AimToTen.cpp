#include <cmath>
#include <vector>

class AimToTen{
public:
	int need( std::vector<int> marks){
		int total = 0;

		for( int i = 0 ; i < marks.size() ; i++ ){
			total += marks[i];
		}

		return fmax(19 * marks.size() - 2 * total, 0);
	}
};