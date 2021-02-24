#include <stdio.h>

int main(void){
    int a[3][2] = {{1, 2}, {3, 4}, {5, 6}};

    // a[2][1]
    printf("%d %d \n", a[2][1], (*(a+2))[1]);
    printf("%d %d \n", a[2][1], *(a[2]+1));
    printf("%d %d \n", a[2][1], *(*(a+2)+1));
}