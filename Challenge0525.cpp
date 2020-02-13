// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases, a1, a2, b1, b2;
	
	cin >> cases;
	
	while(cases--)
	{
		cin >> a1 >> a2 >> b1 >> b2;
		
		if ( a1 > a2 ) {
			a1 = a1 + a2;
			a2 = a1 - a2;
			a1 = a1 - a2;
		}
		if ( b1 > b2 ) {
			b1 = b1 + b2;
			b2 = b1 - b2;
			b1 = b1 - b2;
		}

		if ((b1 < a1 && b2 > a1) || (b1 == a1 && b2 > a1) ||
				((a1 < b1 && b1 < a2) && b2 > a1)) {
			cout << "SOLAPADOS" << endl;
		}
		else {
			cout << "SEPARADOS" << endl;
		}
	}
	
	return 0;
}
