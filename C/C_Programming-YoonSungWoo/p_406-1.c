#include <stdio.h>

int arr[][4] = {{1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15, 16}};

void turn(int (*ptr)[4]);

int main(void){
    int num;

    printf("몇 번 우회전? : ");
    scanf("%d", &num);
    for( ; num > 0; num--){
        turn(arr);
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            printf("%3d", arr[i][j]); // 회전결과를 출력.
        }
        printf("\n");
    }
    return 0;
}

void turn(int (*ptr)[4]){
    int i, j;
    int arr2[4][4];

    for(i = 0; i < 4; i++){
        for(j = 0; j < 4; j++){
            arr2[i][j] = ptr[i][j];
        } 
    }

    for(i = 0; i < 4; i++){
        for(j = 0; j < 4; j++){
            ptr[j][3-j] = arr2[i][j];
        }
    }
}