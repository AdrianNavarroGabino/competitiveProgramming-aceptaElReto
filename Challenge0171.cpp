// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int len, abbeys, maxHeight;
	
	while(cin >> len && len != 0)
	{
		int mountains[len];
		
		for(int i = 0; i < len; i++)
		{
			cin >> mountains[i];
		}
		
		abbeys = 1;
		maxHeight = mountains[len - 1];
		
		for(int i = len - 2; i >= 0; i--)
		{
			if(mountains[i] > maxHeight)
			{
				maxHeight = mountains[i];
				abbeys++;
			}
		}
		
		cout << abbeys << endl;
	}
	
	return 0;
}
