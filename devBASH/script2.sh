#!/bin/bash

# Escript para optener opcode
# fuente : https://www.commandlinefu.com/commands/view/6051/get-all-shellcode-on-binary-file-from-objdump

objdump -d ./PROGRAM|grep '[0-9a-f]:'|grep -v 'file'|cut -f2 -d:|cut -f1-6 -d' '|tr -s ' '|tr '\t' ' '|sed 's/ $//g'|sed 's/ /\\x/g'|paste -d '' -s |sed 's/^/"/'|sed 's/$/"/g' > opcode.txt