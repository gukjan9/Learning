#include <stdio.h>

int num[10];

void func_odd(int* arr);
void func_even(int* arr);

int main(void) {
    printf("총 10개의 숫자 입력 \n");
    for (int i = 0; i < 10; i++) {
        printf("입력: \n");
        scanf("%d", &num[i]);
    }
    func_odd(num);
    func_even(num);
}

void func_odd(int arr[]) {
    int odd_arr[5];
    int j = 0;

    for (int i = 0; i < 10; i++) {
        if (arr[i] % 2 == 1) {
            odd_arr[j++] = arr[i];
        }
    }
    printf("홀수 출력 : ");
    for (int i = 0; i < 5; i++) {
        printf("%d, ", odd_arr[i]);
    }
}

void func_even(int arr[]) {
    int even_arr[5];
    int j = 0;

    for (int i = 0; i < 10; i++) {
        if (arr[i] % 2 == 0) {
            even_arr[j++] = arr[i];
        }
    }
    printf("짝수 출력 : ");
    for (int i = 0; i < 5; i++) {
        printf("%d, ", even_arr[i]);
    }
}