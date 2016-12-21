#include<pthread.h>
#include<stdio.h>
int h,b;
void *area(void *arg)
{
 int a;
 a=b*h;
 printf(" \n L area e':%d",a);
}

void *perimetro(void *arg);
{
 int p;
 p=(b+h)*2;
 printf(" \n Il perimetro e':&d",p);
}

int main(void){

 pthread_t TID1;
 pthread_t TID2:
 printf("\n inserisci altezza");
 scanf("%d",&h);
 printf("\n inserisci base");
 scanf("%d",&b);
 pthread_create(&tID1,NULL,&area,NULL);
 pthread_create(&tID2,NULL,&perimetro,NULL);
 sleep(5);
return 0;
}
