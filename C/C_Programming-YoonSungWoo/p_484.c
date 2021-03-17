#include <stdio.h>

typedef struct point{
    int posX;
    int posY;
} Point;

Point swapPos(Point *pos1, Point *pos2){
    Point temp = *pos1;
    *pos1 = *pos2;
    *pos2 = temp;
}

int main(void){
    Point pos1 = {2, 4};
    Point pos2 = {5, 7};

    printf("[Before] pos1 : [%d, %d], pos2 : [%d, %d]\n", pos1.posX, pos1.posY, pos2.posX, pos2.posY);

    swapPos(&pos1, &pos2);

    printf("[After] pos1 : [%d, %d], pos2 : [%d, %d]\n", pos1.posX, pos1.posY, pos2.posX, pos2.posY);

    return 0;
}