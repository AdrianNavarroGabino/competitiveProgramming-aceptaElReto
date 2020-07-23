// Adrián Navarro Gabino

#include <iostream>
#include <math.h>

using namespace std;

char primes[100000] = {0};

bool isPrime(int num) {
    if(!primes[num]) {
        if(num % 2 == 0) {
            primes[num] = -1;
            return 0;
        }
        for(int i = 3; i < num / 2; i += 2) {
            if(num % i == 0) {
                primes[num] = -1;
                return false;
            }
        }
        primes[num] = 1;
        return true;
    }
    return primes[num] == 1;
}

int calculatePrimes(int num) {
    int count = 1;

    if(num < 2) {
        return 0;
    }

    for(int i = 3; i <= num; i += 2) {
        count = isPrime(i) ? count + 1 : count;
    }
    
    return count;
}

int main() {

    double errors[] = {1, 0.1, 0.01, 0.001, 0.0001, 0.00001};
    int num, exp, numOfPrimes;
    double error;

    while(cin >> num >> exp && num != 0) {
        numOfPrimes = calculatePrimes(num);

        error = numOfPrimes * 1.0 / num - 1.0 / log(num);
        error = error < 0 ? error * -1 : error;

        cout << (error > errors[exp] ?
            "Mayor" : (error < errors[exp] ? "Menor" : "Igual")) << endl;
    }

    return 0;
}