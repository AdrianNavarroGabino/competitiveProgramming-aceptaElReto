// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int weight, elephant, count;
    string aux;

    cin >> weight;

    while(weight != 0)
    {
		count = 0;
		
        cin >> elephant;
        
        while(elephant != 0)
        {
			if(elephant <= weight)
			{
				count++;
			}
			else
			{
				getline(cin, aux);
				break;
			}
			
			weight -= elephant;

			cin >> elephant;
        }

        cout << count << endl;

        cin >> weight;
    }

    return 0;
}
