#include <stdio.h>

struct employee{
    char name[20];
    char num[20];
    int pay;
};

int main(void){
    struct employee p1;

    printf("Enter name : \n");
    scanf("%s", p1.name);
    printf("Enter ID : \n");
    scanf("%s", p1.num);
    printf("Enter payment : \n");
    scanf("%d", &p1.pay);

    printf("Name : %s, ID : %s, Payment : %d\n", p1.name, p1.num, p1.pay);

    return 0;
}