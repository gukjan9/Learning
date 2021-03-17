#include <stdio.h>

struct point{
    int posX;
    int posY;
};

struct circle{
    double radius;
    struct point *center;
};

int main(void){
    struct point cen = {2, 7};
    double rad = 5.5;

    struct circle ring = {rad, &cen};
    printf("Circle's Radius : %g \n", ring.radius);
    printf("Center of Circle [%d, %d] \n", (ring.center)->posX, (ring.center)->posY);

    return 0; 
}