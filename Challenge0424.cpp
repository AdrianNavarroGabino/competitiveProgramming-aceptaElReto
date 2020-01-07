// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int operations, moneyValue, totalMoney, maxMoney;
	
	while(cin >> operations && operations != 0)
	{
		totalMoney = 0;
		maxMoney = 0;
		
		for(int i = 0; i < operations; i++)
		{
			cin >> moneyValue;
			
			totalMoney += moneyValue;
			
			if(totalMoney > maxMoney)
			{
				maxMoney = totalMoney;
			}
		}
		
		cout << totalMoney << " " << maxMoney << endl;
	}
	
	return 0;
}
