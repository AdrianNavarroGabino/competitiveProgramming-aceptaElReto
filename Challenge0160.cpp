// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int matrixSize;
    
    do
    {
        cin >> matrixSize;
        
        bool lowerTriangular = true;
        bool upperTriangular = true;
        
        int matrix[matrixSize][matrixSize];
        
        for(int i = 0; i < matrixSize; i++)
        {
            for(int j = 0; j < matrixSize; j++)
            {
                cin >> matrix[i][j];
                
                if(i > j && matrix[i][j] != 0)
                {
                    lowerTriangular = false;
                }
                
                if(i < j && matrix[i][j] != 0)
                {
                    upperTriangular = false;
                }
            }
        }
        
        if(matrixSize != 0 && (lowerTriangular || upperTriangular))
        {
            cout << "SI" << endl;
        }
        else if(matrixSize != 0 && !lowerTriangular && !upperTriangular)
        {
            cout << "NO" << endl;
        }
    } while(matrixSize != 0);
    
    return 0;
}
