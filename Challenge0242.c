// Adrián Navarro Gabino

#include <stdio.h>

int main(int argc, char *argv[])
{
	int countries;
    int students[100000];
    long long couples;
    long long sum;
    long long i;
    
    scanf("%d", &countries);

	while(countries != 0){
		sum = 0;
		
		for(i = 0; i < countries; i++){
			scanf("%d", &students[i]);
			sum += students[i]; 
		}

		couples = 0;
		
		for(i = 0; i < countries; i++){
			sum -= students[i]; 
			couples += sum * students[i]; 
		}

		printf("%lld\n", couples);
		
        scanf("%d", &countries);
	}
	return 0;
}
