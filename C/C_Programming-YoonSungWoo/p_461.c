#include <stdio.h>

struct point{
    int posX;
    int posY;
};

int main(void){
    struct point arr[3];
    
    for(int i = 0; i < 3; i++){
        printf("Enter Coordinate : ");
        scanf("%d %d", &arr[i].posX, &arr[i].posY);
    }

    for(int i = 0; i < 3; i++){
        printf("[%d, %d] ", arr[i].posX, arr[i].posY);
    }

    return 0;
}