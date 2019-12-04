// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    cin >> cases;
    
    int m, a, c;
    string pixels;
    int length;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> m >> a >> c >> pixels;
        
        length = pixels.length();
        
        for(int j = 0; j < length; j++)
        {
            switch(pixels[j])
            {
                case 'B':
                    break;
                case 'M':
                    m--;
                    break;
                case 'A':
                    a--;
                    break;
                case 'C':
                    c--;
                    break;
                case 'R':
                    m--;
                    a--;
                    break;
                case 'N':
                    m--;
                    a--;
                    c--;
                    break;
                case 'V':
                    a--;
                    c--;
                    break;
                case 'L':
                    m--;
                    c--;
                    break;
            }
        }
        
        if(a >= 0 && m >= 0 && c >= 0)
        {
            cout << "SI " << m << " " << a << " " << c << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
    
    return 0;
}
