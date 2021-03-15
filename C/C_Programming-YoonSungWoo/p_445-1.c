#include <stdio.h>
#include <string.h>
#define SIZE 100

int main(void){
    int total = 0;
    char arr[SIZE];
    fgets(arr, sizeof(arr), stdin);

    int len = strlen(arr);

    for(int i = 0; i < len; i++){
        if(arr[i] >= '1' && arr[i] <= '9') total += arr[i] - '0';   // 0은 해줄 필요 없음
    }

    printf("%d", total);

    return 0;
}