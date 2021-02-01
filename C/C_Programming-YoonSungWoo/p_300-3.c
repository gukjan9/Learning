#include <stdio.h>

int main(void){
    int arr[] = {1, 2, 3, 4, 5};
    int *ptr = &arr[4];
    int total = 0;

    for(int i = 0; i < 5; i++){
        total += *(ptr--);
    }

    printf("%d", total);

    return 0;
}