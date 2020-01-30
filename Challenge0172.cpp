// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases;
	string table;
	
	while(cin >> cases && cases != 0)
	{
		cin >> table;
		
		if(table.find("D") != string::npos && table.find("I") != string::npos)
		{
			cout << "ALGUNO NO COME" << endl;
		}
		else
		{
			cout << "TODOS COMEN" << endl;
		}
	}
	
	return 0;
}
