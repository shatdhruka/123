#include<stdio.h>
#include<string.h>
int main()
{
    char S[50];
    int a;
    scanf("%s",&S);
    a=strlen(S);
    if(a%2==0)
    {
        S[a/2]='*';
        S[(a/2)-1]='*';
    }
    else
    {
        S[a/2]='*';
    }
    printf("%s",S);
return 0;
}
