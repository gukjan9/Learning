#include <stdio.h>

typedef struct point{
    int xpos;
    int ypos;
} Point;

typedef struct rectangle{
    Point left;
    Point right;
} Rectangle;

void ShowRecArea(Rectangle rec){
    printf("넓이 : %d \n", (rec.left.xpos - rec.right.xpos) * (rec.left.ypos - rec.right.ypos));
}

void printCoord(Rectangle rec){
    printf("좌 상단 : [%d, %d] \n", rec.left.xpos, rec.left.ypos);
    printf("좌 하단 : [%d, %d] \n", rec.left.xpos, rec.right.ypos);
    printf("우 상단 : [%d, %d] \n", rec.right.xpos, rec.left.ypos);
    printf("우 상단 : [%d, %d] \n", rec.right.xpos, rec.right.ypos);
}

int main(void){
    Rectangle rec1 = {{1, 1}, {4, 4}};
    Rectangle rec2 = {{0, 0}, {7, 5}};

    ShowRecArea(rec1);
    printCoord(rec1);
    ShowRecArea(rec2);
    printCoord(rec2);

    return 0;
}