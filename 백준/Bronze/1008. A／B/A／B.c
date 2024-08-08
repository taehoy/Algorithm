#include <stdio.h>
#include <stdlib.h>

int main(void) {
    char buffer[100];
    double num1, num2, result;

    fgets(buffer, sizeof(buffer), stdin);
    sscanf(buffer, "%lf %lf", &num1, &num2);

    result = num1 / num2;

    printf("%.9lf\n", result);

    return 0;
}
