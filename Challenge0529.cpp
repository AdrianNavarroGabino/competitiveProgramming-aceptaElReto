// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
	int cases, len, maxNumber, connections, connectionsAux;
	string log;
	
	cin >> cases;
	
	while(cases--)
	{
		cin >> log;
		
        connections = 0;
        maxNumber = 0;
        connectionsAux = 0;
        
        len = log.length();
        
        for(int i=0; i < len; i++)
        {
             if(log.at(i) == 'O')
             {
                if(connections == 0)
                {
					connectionsAux = 1;
				}
                if(connectionsAux == 1)
                {
					maxNumber++;
				}
                else
                {
					connections--;
				}
            }
            else
            {
                connectionsAux = 0;
                connections++;
                maxNumber = max(maxNumber, connections);
            }
        }
        cout << maxNumber << endl;
    }
	
	return 0;
}
