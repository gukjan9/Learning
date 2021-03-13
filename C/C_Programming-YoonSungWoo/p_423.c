#include <stdio.h>

int main(void){
    int val;

    val = getchar();

    if(val >= 'A' && val <= 'Z') putchar(val + 32);
    else if(val >= 'a' && val <= 'z') putchar(val - 32);
    else printf("Please Enter Alphabet\n");

    return 0;
}