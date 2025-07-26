## Recap 

Array 
- reverse the array
- 2d array


Strings 
- String constant pool 
- memory management for strings 
- == .equals method


String s1 = "Pragra";
String s2 = "Pragra";
String s3 = new String("Pragra");

Stack and Heap 


 ## Mutable 
which can be modified

StringBuilder

StringBuffer


## Thread 


                10  [9]
T1 --------> resource {database}
-1




#**# Object Oriented Programming [OOP]

classes 
Objects 

Pillars of OOP
1. Inheritance 
   Inheriting the properties from the parent class 

   Parent 
     |
  Child


2. Polymorphism
    

Student(){

}

Student(int a, int ){

}


Student(10,20);


constructor overloading

method overloading      ---- method overriding 
static polymorphism          Runtime poly.


3. Abstraction 

showing only what is necessary 
hide complex details from the users.

4. Encapsulation**

hiding your data into single unit 
and you access , who can access what. 




## Inheritance - code resuability 

1. Single 
2. Multi level 


Multiple inheritance - ## Java does not support this directly in classes.


# single 

  

Author, price, title, productionCompany
               Book 
                |
              Novel  [variable ]
              |   |  
        Fiction   Non Fiction

// method - bookDetails()
// create object of Fiction 
// create object of NonFiction 



## super 
super keyword is used to refer the parent 
variable 
method
constructor 

call to super in the constructor should be the first statement



## Polymorphism 

static  - Method overloading 

in a class, same method name but diff parameters



Dynamic  - Method overriding 
only during inheritance
two methods with same name and signature


            BankOfCanada [rate of interest - 5%] - rateOfInterset
    |           |           |           |               |
 BMO            TD       Scotia         RBC             Pragra
1.15            1.25     1.10           1.50

internal bank rate - 1.12

total rate of interest  +      base + internal Bank rate


public double rateOfInterest(){
return 5.0;
}

@Override
public double rateOfInterest(){
internal Bank rate = 1.12


return 5.0 + 1.12;
}

// Upcasting 

Bank bank = new Bmo();
bank.rateOfInterest();



Bank bank = new Pragra();
bank.rateOfInterest();   // 5 %


TD td = new TD();
td.rateOfInterest();


switch(bankType){

case BMO :
  sout(internest of the bank)

case TD: 

add while / do while loop 



















