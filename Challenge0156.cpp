// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int floor1;
    int floor2;
    int result;
    
    while (scanf("%d", &floor1) && floor1 >= 0) {
        result = 0;
        while (scanf("%d", &floor2) && floor2 != -1) {
            result += abs(floor2 - floor1);
            floor1 = floor2;
        }
        cout << result << endl;
    }
    
    return 0;
}
