/*  How to Create class - Done 
2) How to add Main method - Done # if name == "main":
3) How to add local variables
4) How to create Object - Done 
5) How to call methods - Done 
6) How to pass arguments - Done
7) How to return values - Done 
8) global variables 
9) static variables
10) non-static variables */

class Firstprogram
{ 
static int Bill,service;
public static void main(String args[])
{ 



Firstprogram  boy1 = new Firstprogram();
Firstprogram  boy2 = new Firstprogram();

System.out.println("hello prasanth consistency must");

int Total=boy1.method(10000);
System.out.println("After 1 year Resaled the product  boy1 to boy2 " + (Total-5000));
boy2.method1(1500);

}
public static int  method(int bicycle_price)
{
int bicycle_tax=1500;
 int Total =bicycle_tax+bicycle_price;
System.out.println("Totall bicycle  price " +Total);
return  Total ;
}
public void method1(int Add_bell_etc_price)

{
   service =500;
   Bill= service+Add_bell_etc_price;
System.out.println("reservice payide the Bill shop " +Bill);
System.out.println("boy2 Awesome to ride the bicycle");
}
}

