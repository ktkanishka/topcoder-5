#include <iostream>
#include <cmath>

using namespace std;

class AliceGame{
	long long findMinimumValue(long long x, long long y){
		int totalTurns = sqrt( x + y );

		if( pow( totalTurns, 2 ) != ( x + y ) ){
			return -1;
		}

		int xTurns = 0;

		for( int i = totalTurns ; i > 0 ; i-- ){
			if( 2*i-1 <= x ){
				x -= 2*i-1;
				xTurns++;
			}

			cout << x << endl;
		}

		return xTurns;
	}
};