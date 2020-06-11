// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases, i, m, spentWater, result, times;
	cin >> cases;
	
	while(cases--)
	{
		cin >> i >> m;
		result = i;
		times = 0;
		
		while(cin >> spentWater && spentWater != -1)
		{
			result -= spentWater;
			
			if(result < m)
			{
				times++;
				result = i;
			}
		}
		
		cout << times << endl;
	}
}
