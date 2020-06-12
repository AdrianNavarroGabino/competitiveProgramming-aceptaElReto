// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main() {
    int w, h, result;

    while(cin >> w >> h && w != 0) {
        result = 0;

        while(w >= 10 && h >= 10) {
            if(w > h) {
                w = w + h;
                h = w - h;
                w = w - h;
            }

            result += h / w;
            h = h % w;
        }

        cout << result << endl;
    }
    
    return 0;
}