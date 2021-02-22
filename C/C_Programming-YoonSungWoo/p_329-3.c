#include <stdio.h>

int main(void) {
    int num_arr[10];
    int num;

    printf("총 10개의 숫자 입력 \n");

    int j = 0, k = 9;

    for (int i = 0; i < 10; i++) {
        printf("입력: ");
        scanf("%d", &num);

        if (num % 2 == 1) num_arr[j++] = num;
        else if (num % 2 == 0) num_arr[k--] = num;
    }
    printf("배열 요소의 출력 : ");
    for (int i = 0; i < 10; i++) {
        printf("%d ", num_arr[i]);
    }
}