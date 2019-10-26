// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int campMin = 4050;
	int campMax = 10800;
    int metros;
    int numCamps;
	int cases;
	cin >> cases;
	
	for(int currentCase = 0; currentCase < cases; currentCase++)
	{
		cin >> metros >> numCamps;
		
		if(numCamps * campMin <= metros && numCamps * campMax >= metros)
		{
			cout << "SI" << endl;
		}
		else
		{
			cout << "NO" << endl;
		}
	}

	return 0;
}
