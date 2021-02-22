#include <stdio.h>

int main(void){
    int num;
    int arr[10];

    printf("10진수 정수 입력 : ");
    scanf("%d", &num);

    for(int i = 0; num > 0; i++){
        arr[i] = num % 2;
        num /= 2;
    }
    for(int i = 3; i >= 0; i--){
        printf("%d", arr[i]);
    }
}