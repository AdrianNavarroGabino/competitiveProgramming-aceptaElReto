// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    string name;
    bool noPicto;
    string result = "";
    
    int cases;
    cin >> cases;
    getline(cin, name);

     for(int i = 0; i < cases; i++) {
        getline(cin, name);
        noPicto = false;

        if(name[name.length() - 1] == 'A') {
            noPicto = true;
            result = "INDIO";
        }
        
        if(name[name.length() - 2] == 'I') {
            if(name[name.length() - 1] == 'X') {
                noPicto = true;
                result = "GALO";
            }
            else if(name[name.length() - 1] == 'C') {
                noPicto = true;
                result = "GODO";
            }
            else if(name[name.length() - 1] == 'S') {
                noPicto = true;
                result = "BRETON";
            }
        }
        else if(name[name.length() - 2] == 'E' && name[name.length() - 1] == 'Z') {
            noPicto = true;
            result = "HISPANO";
        }
        else if(name[name.length() - 2] == 'U' && (name[name.length() - 1] == 'S' || name[name.length() - 1] == 'M')) {
            noPicto = true;
            result = "ROMANO";
        }
        else if(name[name.length() - 2] == 'A') {
            if(name[name.length() - 1] == 'S') {
                noPicto = true;
                result = "GRIEGO";
            }
            else if(name[name.length() - 1] == 'F') {
                noPicto = true;
                result = "NORMANDO";
            }
            else if(name[name.length() - 1] == 'X') {
                noPicto = true;
                result = "BRETON";
            }
        }
        else if(name[name.length() - 2] == 'O' && name[name.length() - 1] == 'S') {
            noPicto = true;
            result = "BRETON";
        }

        if(name[0] == 'M' && name[1] == 'A' && name[2] == 'C') {
            if(noPicto) {
                cout << "MULATO" << endl;
            }
            else {
                cout << "PICTO" << endl;
            }
        }
        else if(noPicto) {
            cout << result << endl;
        }
        else {
            cout << "PLUS ULTRA" << endl;
        }
    }

    return 0;
}