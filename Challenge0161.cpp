// Adrián Navarro Gabino

#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
	int len;
	
	while(cin >> len && len != 0)
	{
		int data[len];
		
		for(int i = 0; i < len; i++)
		{
			cin >> data[i];
		}
		
		int n = sizeof(data) / sizeof(data[0]);
		sort(data, data + n);
		
		if(len % 2 == 0)
		{
			cout << data[len / 2 - 1] + data[len / 2] << endl;
		}
		else
		{
			cout << 2 * data[len / 2] << endl;
		}
	} 
}
