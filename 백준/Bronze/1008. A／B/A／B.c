#include <stdio.h>
#include <stdlib.h>

int main(void) {
    char buffer[100];
    double num1, num2, result;

    if (fgets(buffer, sizeof(buffer), stdin) != NULL) {
        // 입력된 문자열을 두 개의 실수로 변환
        if (sscanf(buffer, "%lf %lf", &num1, &num2) == 2) {
            // 두 번째 수가 0이면 나눗셈 오류를 처리
            if (num2 != 0) {
                result = num1 / num2;
                // 결과를 소수점 이하 9자리까지 출력
                printf("%.9lf\n", result);
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
        } else {
            printf("Invalid input. Please enter two numbers.\n");
        }
    } else {
        printf("Error reading input.\n");
    }

    return 0;
}
