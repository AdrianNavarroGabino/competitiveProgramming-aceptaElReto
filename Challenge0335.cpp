// Adrián Navarro Gabino

#include <iostream>

using namespace std;

typedef long long ll;

int main() {
    int T;
    cin >> T;
    ll n;
    while (T--) {
        cin >> n;
        cout << n*(n+1)*(n+2)/6 << endl;
    }
    
    return 0;
}
