## Recap 
exception ? 
breaks the normal of execution 

exception handling ? 
to handle it gracefully 


try 
catch 
finally 
throw 
throws


## finally 

try{
}
finally {


}


final vs finally vs finalize

## throw vs throws

throw 
explicity throw an exception 
create your own exception 



throws 
declaring exception for the caller of the method


methodB() {
// handle exception here
}


methodA() throws RuntimeException{

// logic, this may create exception 
}



## Custom exception 


Bank - 3 methods
1. withdraw
2. balance 
3. deposit

whenver user tried to withdraw more than the amount. 
throw InsufficientBalanceException.

Main 
1. create objects and handle all the scenarios.


HashMap


Data structure
Map<K,V>

interface User{
id:number


String name;

