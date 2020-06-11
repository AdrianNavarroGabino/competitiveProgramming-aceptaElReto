// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main() {
    int cases;
    long long int m1;
    long long int m2;
    long long int m3;
    
    cin >> cases;

    for(int i = 0; i < cases; i++) {
        cin >> m1 >> m2 >> m3;

        if(m1 > m2) {
            m1 = m1 + m2;
            m2 = m1 - m2;
            m1 = m1 - m2;
        }

        if(m2 > m3) {
            m2 = m2 + m3;
            m3 = m2 - m3;
            m2 = m2 - m3;
        }

        if(m1 > m2) {
            m1 = m1 + m2;
            m2 = m1 - m2;
            m1 = m1 - m2;
        }

        cout << m1 << " " << m2 << " " << m3 << endl;
    }
    
    return 0;
}