#include <stdio.h>

int main(void){
    int arr[] = {1, 2, 3, 4, 5};
    int *ptr = arr;

    for(int i = 0; i < 5; i++) *(ptr+1) += 2;

    for(int i = 0; i < 5; i++) printf("%d ", arr[i]);

    return 0;
}