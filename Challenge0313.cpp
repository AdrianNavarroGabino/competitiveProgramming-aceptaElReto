// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, data1, data2;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> data1 >> data2;
        
        if(data1 >= -data2)
        {
            cout << "SI" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
    
	return 0;
}
