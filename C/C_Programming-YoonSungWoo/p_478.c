#include <stdio.h>

typedef struct point{
    int posX;
    int posY;
} Point;

void ShowPosition(Point pos){
    printf("[%d %d] \n", pos.posX, pos.posY);
}

Point GetCurrentPosition(void){
    Point cen;
    printf("Input current pos : ");
    scanf("%d %d", &cen.posX, &cen.posY);

    return cen;
}

int main(void){
    Point curPos = GetCurrentPosition();
    ShowPosition(curPos);

    return 0;
}