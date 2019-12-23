// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	string line;
	int len;
	char letter;
	
	while(getline(cin, line) && line != "FIN")
	{
		len = line.length();
		
		for(int i = 0; i < len; i++)
		{
			if(line.at(i) != ' ')
			{
				letter = line.at(i) != 90 ? (line.at(i) + 1) : 'A';
			}
			else
			{
				letter = ' ';
			}
			
			cout << letter;
		}
		
		cout << endl;
	}
	
	return 0;
}
