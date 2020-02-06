// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	short workouts, num, calories;
	int total;
	
	while(cin >> workouts && workouts != 0)
	{
		cin >> num;
		total = 0;
		
		for(int i = 0; i < num; i++)
		{
			cin >> calories;
			total += calories;
		}
		
		if(total % workouts == 0)
		{
			cout << total / workouts << endl;
		}
		else
		{
			cout << total / workouts + 1 << endl;
		}
	}
	
	return 0;
}
