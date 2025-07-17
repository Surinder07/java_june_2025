## Recap 

AWS 
 - UNIX
 - UNIX commands 
 - Kernel and Shell 
 - Unix family tree 


What is a Shell? 
  interface between user and kernel

bash shell 
Zsh (z shell) 
sh (Bourne Shell)
powershell 
cshell 




all the hidden files
ls -a

delete a file 
rm 

remove a directory 
rmdir








what is kernel? 
bridge between hardware and the software 
 allocate resources, 
memory management, process management ,
File system handling 


## File permissions 


-rw-r--r--
rw-   --->  Owner permission 
r--   --->  Group permission 
r--   ---> other permission 

r - read    w- write  x- execute 

chmod 



chmod 777 index.css
chmod 444 index.css
chmod 700 index.css


0 - no permission 
1 - execute  
2 - write 
3 - write and execute 
4 - read  
5 - read and execute 
6 - read and write 
7 - all permissions

1. create a directory named,    [chmod 700 index.css]
  Java --
        Test.java    ---- give all permissions to the owner
        Hello.java   --- give all permission to owner, read and execute remaining
  Aws -- 
        ec2.txt     --- give readonly permissions to other than owner, 
                        owner should have read and write     
        iam.txt     -- read perm to all, read and execute to owner, read and write to group    



## Grep 

to find the pattern in the file 
grep lorum fileName.txt

to print where pattern does not match 
grep -v ipsum filename 


grep -i -- ignore the case also 



## sort 
sort filename 


create a java file, 

add a java program 
and find how many times a public / static  keyword came in the file.


## Path ?
# absolute 
 full path to a file or directory from the root directory 

relative path 




/ 
|-- bin/
|-- dev
|-- home/
        /ec2-user
            ---/test


## Environment 
Key -value pair, 
configure the environment where program runs 

installed java 

javac Test.java


Secrets, username, password 
PASSWORD = "password123"




## Shell scripting

command line / programming for unix 

## create a file with .sh 
myfile.sh

## add some content
#!/bin/bash

company_name="Pragra"
echo "$company_name"

## change the permission of the file
chmod 700 myfile.sh

## run the file 
./myfile.sh
[create a file with data, My name is $myName. I am learning $program]
My name is Jatin. I am learning Java



## even or odd number 

#!/bin/bash

echo "Enter the number:"
read num

if [ $((num % 2)) -eq 0 ]; then
echo "$num is Even"
else
echo "$num is ODD"
fi


## write small programm for postive and negative number 

-gt
-lt

$num -gt 0 


elif



































