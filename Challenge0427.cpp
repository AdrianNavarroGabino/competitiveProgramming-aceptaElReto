// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases;
	string name, relationship;
	
	cin >> cases;
	
	while(cases--)
	{
		cin >> name >> relationship;
		
		if(name.compare("Luke") == 0 &&
				relationship.compare("padre") == 0)
		{
			cout << "TOP SECRET" << endl;
		}
		else
		{
			cout << name << ", yo soy tu " << relationship << endl;
		}
	}
	
	return 0;
}
