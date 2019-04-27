#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h>
#include <string.h>
#include <unistd.h>

#define KEY_INPUT "/dev/input/event3"

int main() {
    int fd = 0;
    int bsize = 20;
    int buffer[bsize];
    int rcode;

    printf("Read...");
    
    while(1) {
        fd = open(KEY_INPUT, O_RDWR, 0);
        memset(&buffer, 0, bsize);
        rcode = read(fd, &buffer, bsize*sizeof(int));
        
        if(rcode != -1) {
            printf("Captura: ");
            close(fd);
            for(int i = 0; i < bsize; i++){
                printf("%d\n",buffer[i]);
            }
        }
    }
    
    return 0;
}
