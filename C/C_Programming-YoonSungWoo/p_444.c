#include <stdio.h>
#include <stdlib.h>

int main(void){
    char str[10];
    printf("Enter Integer : ");
    scanf("%s", str);
    printf("%d\n", atoi(str));

    printf("Enter Real Number : ");
    scanf("%s", str);
    printf("%g\n", atof(str));

    return 0;
}