#include <stdio.h>

int main(){
    int buffer[100];
    int num1, num2;
    
    fgets(buffer, sizeof(buffer), stdin);
    sscanf(buffer, "%d %d", &num1, &num2);
    
    printf("%d", num1 - num2);
}