// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int len, data;
	bool identity;
	
	while(cin >> len && len != 0)
	{
		identity = true;
		
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len; j++)
			{
				cin >> data;
				
				if(i != j && data != 0)
				{
					identity = false;
				}
				else if(i == j && data != 1)
				{
					identity = false;
				}
			}
		}
		
		if(!identity)
		{
			cout << "NO" << endl;
		}
		else
		{
			cout << "SI" << endl;
		}
	}
	
	return 0;
}
