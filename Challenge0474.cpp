// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int comisaria;
    int A;
    int B;
    int disComA;
    int disComB;
    int disAB;
	int cases;
	cin >> cases;
	
	for(int currentCase = 0; currentCase < cases; currentCase++)
	{
		cin >> comisaria >> A >> B;
		
		if(comisaria - A >= 0)
		{
			disComA = comisaria - A;
		}
		else
		{
			disComA = A - comisaria;
		}
        
		if(comisaria - B >= 0)
		{
			disComB = comisaria - B;
		}
		else
		{
			disComB = B - comisaria;
		}
		
		if(B - A >= 0)
		{
			disAB = B - A;
		}
		else
		{
			disAB = A - B;
		}
		
		if(disComA + disAB >= disComB + disAB)
		{
			cout << disComB + disAB << endl;
		}
		else
		{
			cout << disComA + disAB << endl;
		}
	}

	return 0;
}
