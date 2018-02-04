#!/bin/bash

# ensambla y enlaza programas en ensamblador NAMS

nams -f elf $1.s && ld -m -s -o $1 $1.o