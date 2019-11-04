// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    string word;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> word;
        
        if(word.find("a") != string::npos &&
            word.find("e") != string::npos &&
            word.find("i") != string::npos &&
            word.find("o") != string::npos &&
            word.find("u") != string::npos)
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
