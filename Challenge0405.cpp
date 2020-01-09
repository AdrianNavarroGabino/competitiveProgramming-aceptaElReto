// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int page, current;
	string result;
	bool sequence;
	
	while(cin >> page && page != 0)
	{
		current = page;
		result = to_string(current);
		sequence = false;
		
		while(cin >> page && page != 0)
		{
			if(page != current + 1)
			{
				if(sequence)
				{
					result += "-" + to_string(current);
				}
				
				result += "," + to_string(page);
				sequence = false;
			}
			else
			{
				sequence = true;
			}
			
			current = page;
		}
		
		if(sequence)
		{
			result += "-" + to_string(current);
		}
		
		cout << result << endl;
	}
	
	return 0;
}
