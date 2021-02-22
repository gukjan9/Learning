#include <stdio.h>
#include <string.h>
#define ArrSIZE 10000

char arr[ArrSIZE];

int main(void) {
    printf("문자열 입력: ");
    scanf("%s", arr);

    int size = strlen(arr);

    for (int i = 1; i < size / 2 + 1; i++) {
        if (size % 2 == 1) {
            if (arr[size / 2 - i] != arr[size / 2 + i]) break;
            if (i == size / 2) printf("회문 입니다.");
        }
        else if (size % 2 == 0) {
            if (arr[size / 2 - i] != arr[size / 2 + i - 1]) break;
            if (i == size / 2) printf("회문 입니다.");
        }
    }
}