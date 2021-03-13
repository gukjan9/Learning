#include <stdio.h>

void ClearLineFromReadBuffer(void){
    while(getchar()!='\n');
}

int main(void){
    char perID[7];
    char name[10];

    fputs("주민번호 앞 6자리 입력 : ", stdout);
    fgets(perID, sizeof(perID), stdin);
    ClearLineFromReadBuffer();                  // 입력 버퍼 비우기 - \n 까지 입력되어 입력 버퍼에 남아있어 16행에서 \n 만 입력된다

    fputs("이름 입력 : ", stdout);
    fgets(name, sizeof(name), stdin);

    printf("주민번호 : %s\n", perID);
    printf("이름 : %s", name);

    return 0;
}