// Adrián Navarro Gabino

#include <iostream>
#include <map>

using namespace std;

int main() {
    int cases, line;
    int sentence = 0;
    int label[102], data[102];
    map<int,int> renumLines;
    string code;
    
    cin >> cases;
    for(int i = 0; i < cases; ++i){
        renumLines.clear();
        line = 1;
        for(sentence = 0; line; ++sentence)
        {
            cin >> line;
            
            if(!line)
                break;
                
            renumLines.insert(make_pair(line, 10 * (sentence + 1)));
            
            cin >> code;
            
            if(code.length() == 4){
                data[sentence] = 1;
                cin >> label[sentence];
            }
            else if(code.length() == 5){
                data[sentence] = 2;
                cin >> label[sentence];
            }
            else{
                data[sentence] = 3;
            }
        }
        
        for(int j = 0; j < sentence; ++j){
            cout << 10 * (j + 1);
            if(data[j] == 1)
                cout << " GOTO " << renumLines[label[j]] << endl;
            else if(data[j] == 2)
                cout << " GOSUB " << renumLines[label[j]] << endl;
            else if(data[j] == 3)
                cout << " RETURN" << endl;
        }
        cout << "---" << endl;
    }
    return 0;
}
