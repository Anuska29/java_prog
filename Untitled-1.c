#include<stdio.h>
void main(){
    int n,i,j;
    printf("Enter number of lines: ");
    scanf("%d",&n);
    for(int i=1 ; i<=n ; i++){
        for(j=n;j>=i;j--){
            printf("%d",j);
        }
        printf("\n");
    }
}