##  Recap 

API 
API testing with postman 

API ? 

REST API : Represenatational State Transfer
architecture design for API using HTTP communication 
build on top of HTTP 

Req   1 ---------------> Server
Req 2 -----------------> 


GET             -   fetch the resource
POST            - create the resource
PUT             - Update the resource
DELETE          - delete the resource. 
PATCH          

## PUT vs PATCH


{
"name" : "Divine",
"email" : "email@gmail.com",
"city" : "Toronto"
}


PUT
{
"name" : "Divine",
"email" : "email@gmail.com",
"city" : "Brampton"
}

PATCH 
{
"city" : "Brampton"
}



Request Com
URL - baseURL 


Status codes 
1XX series  - informational 
2XX series  - Success
3XX series  - redirectional
4XX series   - Client side
5xx Series   -  Server side 


A           ---- B   ----> req  504   <---res             --- C 

https://github.com/vdespa/introduction-to-postman-course/blob/main/simple-books-api.md

1. send a request to get the token
   /api-clients/
response : token 
Body {
   "clientName": "Divine",
   "clientEmail": "abc@gmail.com"
   }

2. for every request where auth is required
send that token as a part of request in the bearer token under auth tab in postman





## Swagger 
https://editor.swagger.io/








