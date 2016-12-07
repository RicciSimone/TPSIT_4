#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
main()
{
    pid_t pid;
    int n,i;
    do{
        printf("\n inserisci un numero tra 1 e 5");
        scanf("%d",&n);
    }while((n<1)||(n>5));

    for(i=0;i<n;i++){
      pid=fork();
      if(pid==0)
      printf(" Io sono =%d e mio padre e' =%d \n",getpid(),getppid());
    }
    exit(0);
}
