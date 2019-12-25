// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	string word;
	int cases;
	cin >> cases;
	
	for(int i = 0; i < cases; i++)
	{
		cin >> word;
		
		for (int i = word.length() - 1; i >= 0; i--)
		{
            if (isupper(word[word.length() - 1 - i]))
                cout << char(toupper(word[i]));
            else
                cout << char(tolower(word[i]));
		}
		cout << endl;
	}
	
	return 0;
}
