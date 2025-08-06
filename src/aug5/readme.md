## Recap 

Encapsulation 
1. data hiding process

wrap data in single unit 
restrict the access to the data members by make variables
private

getters/setters to provide access. 


abstraction
2. Hiding the internal implementation and showing only essential feature of the 
object

How to achieve abstraction? 
  abstract class  [0-100%]
   interfaces  [100%]



Abstract class 
1. it's a class with abstract keyword
2. it cannot be instantiated,[object cannot be created for abstract class]
3. it may or may not contain abstract methods
4. if a class have at least one abstract method, class must be abstract.


advantage of abstraction. 

                JDBC - Java database connection
            methods, abstract methods, interfaces

connection   connec     


conenction, connectionFactory, restultset

MYSQL           Postgres        SQLite          MyPragraDatabase



## Abstract abstraction
class : Payment 
1.      validate() : abstract
2.      processPayment(double amount) : Concrete

## class 
CreditCardPayment  : sout("Payment validate for CC )
PaypalPayment
DebitCardPayment

validate the type of card. 
process payment 


## interfaces

similar to class 
to achieve 100 % abstraction

a [contract] that a class has to fulfill while implementing/inheriting the interface

   A [contract]
   |
  B  [has to fulfill ]


interface A{



}

1. Object cannot be created
2. support 100% abtraction, all the methods are abstract 
3. supports/helps to acheive multiple inheritance 


class   extends  
|
class


interface  implements
|
class 



## Multiple inheritance 

            A [run]    run() B           C run()
             |              |           |           
                        
                            D 



## Problem 

Notifier  [Interface]
1. notifyUser(String message);


EmailNotifier
notifyUser(String message){
   sout("Sending email notification" + message)
}

SMSNotifier

PushNotifier

Main 
1. create object of each class and print the respective methods..



























