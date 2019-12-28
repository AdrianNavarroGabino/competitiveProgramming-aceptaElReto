// Adrián Navarro Gabino

#include <iostream>
#include <math.h>

using namespace std;

double f(double x, int nums[], int degree)
{
	double c = 1;
	double y = 0;
	
	for(int i = 0; i <= degree; i++)
	{
		y += c * nums[i];
		c = c * x;
	}
	
	if(y < 0)
	{
		return 0;
	}
	if(y > 1)
	{
		return 1;
	}
	
	return y;
}

int main()
{
	int degree, rectangles;
	double result;
	
	while(cin >> degree && degree != 20)
	{
		result = 0;
		
		int nums[degree + 1];
		
		for(int i = degree; i >= 0; i--)
		{
			cin >> nums[i];
		}
		
		cin >> rectangles;
		
		for(int i = 0; i < rectangles; i++)
		{
			result += f(i * (1.0 / rectangles), nums, degree);
		}
		
		result *= (1.0 / rectangles);
		
		if(result - 0.5 >= 0.001)
		{
			cout << "CAIN" << endl;
		}
		else if(result - 0.5 <= -0.001)
		{
			cout << "ABEL" << endl;
		}
		else
		{
			cout << "JUSTO" << endl;
		}
	}
	
	return 0;
}
