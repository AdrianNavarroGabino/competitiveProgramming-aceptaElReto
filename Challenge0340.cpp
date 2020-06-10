// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases, w, h, result, min, max;
    cin >> cases;
	
	while(cases--)
	{
		cin >> w >> h;

        min = w > h ? h : w;
        max = w > h ? w : h;

        result = 4 * min * (min + 1) / 2 + (min * 2 + 1) * (max - min);

        cout << result << endl;
	}
	
	return 0;
}