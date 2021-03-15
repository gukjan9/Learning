#include <stdio.h>
#include <string.h>

int main(void){
    char str1[20];
    char str2[20];
    printf("문자열 입력 1 : ");
    scanf("%s", str1);
    printf("문자열 입력 2 : ");
    scanf("%s", str2);

    if(!strcmp(str1, str2)) puts("Same");
    else{
        puts("Not same");
        if(!strncmp(str1, str2, 3)) puts("But, first 3 alphabets are same");
    }

    return 0;
}