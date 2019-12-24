// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cells, position, path, aux, result;
	
	while(cin >> cells >> position >> path && cells != 0)
	{
		aux = path - cells + position;
		result = aux > 0 ? cells - aux : position + path;
		cout << result << endl;
	}
	
	return 0;
}
