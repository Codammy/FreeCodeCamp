#include <stdio.h>
#include <stdlib.h>

/**
 * main - getting used to malloc
 * 
 * Return (0).
*/
int main()
{
    int n, *ptr;
    char c;

    ptr = (int *)malloc(n * sizeof(int));
    printf("input probational number of inputs:");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("value at address %p before initialization is %d\n",ptr + i,*(ptr + i));
    }
    for (size_t i = 0; i < n; i++)
    {
        printf("input: ");
        scanf("%d", ptr + i);
        // if (ptr + i != NULL)
        // {
        //     printf("Do you still need a number ...y / n:");
        //     scanf("%c", &c);
        //     if (c == "y")
        //     {
        //         continue;
        //     }else{
        //         break;
        //     }
        // }
    }
    for (size_t i = 0; i < n; i++)
    {
        printf("value at address %p after initialization is %d\n",ptr + i,*(ptr + i));
    }
    free(ptr);
}