// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases, people, person, evenQueue;
	bool odd, isPossible;
	string aux;
	
	cin >> cases;
	
	while(cases--)
	{
		cin >> people;
		odd = false;
		isPossible = true;
		evenQueue = 0;
		
		while(people--)
		{
			cin >> person;
			
			if(odd && person % 2 == 0)
			{
				isPossible = false;
				getline(cin, aux);
				break;
			}
			else if(!odd)
			{
				if(person % 2 == 0)
				{
					evenQueue++;
				}
				else
				{
					odd = true;
				}
			}
		}
		
		if(isPossible)
		{
			cout << "SI " << evenQueue << endl;
		}
		else
		{
			cout << "NO" << endl;
		}
	}
	
	return 0;
}
