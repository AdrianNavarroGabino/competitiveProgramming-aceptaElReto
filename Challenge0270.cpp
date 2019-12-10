// Adrián Navarro Gabino

#include <iostream>
#include <map>

using namespace std;

int main()
{
    string student, mark;
    int exercises;
    
    do
    {
        cin >> exercises;
        cin.get();
        map<string, int> marks;
        marks.clear();
        if(exercises != 0)
        {
            for(int i = 0; i < exercises; i++)
            {
                getline(cin, student);
                getline(cin, mark);
                marks[student] += (mark == "CORRECTO" ? 1 : -1);
            }

            for (auto &result : marks)
            {
                if (result.second != 0)
                {
                    cout << result.first.c_str() << ", " << result.second << endl;
                }
            }

            cout << "---" << endl;
        }
    } while (exercises != 0);

    return 0;
}
