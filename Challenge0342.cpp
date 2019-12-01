// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int start;
    int end;
    int right;
    int numOfQuestions;
    int question;
    
    while(cin >> start >> end >> right && start != 0)
    {
        cin >> numOfQuestions;
        
        for(int i = 0; i < numOfQuestions; i++)
        {
            cin >> question;
            
            if(question < start || question > end)
            {
                continue;
            }
            else if(question <= right)
            {
                start = question;
            }
            else if(right < question)
            {
                end = question - 1;
            }
        }
        
        if(start == end)
        {
            cout << "LO SABE" << endl;
        }
        else
        {
            cout << "NO LO SABE" << endl;
        }
    }
    
    return 0;
}
