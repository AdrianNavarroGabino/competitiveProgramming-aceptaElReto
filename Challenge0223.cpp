// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main() {
    int cases, numbers, number, max, maxAux, lowerLim, upperLim;
    cin >> cases;

    while(cases--) {
        cin >> numbers;
        max = 0;
        maxAux = 0;
        upperLim = -1;
        lowerLim = -1;

        for(int i = 0; i < numbers; i++) {
            cin >> number;
            if(number != 0) {
                maxAux++;
            }

            if(number == 0 || i == numbers - 1) {
                if(maxAux > max) {
                    max = maxAux;
                    upperLim = i - 1;
                    lowerLim = i - max;

                    if(i == numbers - 1 && number != 0) {
                        upperLim++;
                        lowerLim++;
                    }
                }
                
                maxAux = 0;
            }
        }

        if(max == 0) {
            cout << "SIGUE BUSCANDO" << endl;
        }
        else {
            cout << max << " -> [" << lowerLim << "," << upperLim << "]" << endl;
        }
    }

    return 0;
}