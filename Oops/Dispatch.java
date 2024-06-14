package Oops;

// A Java program to illustrate Dynamic Method 
// Dispatch using hierarchical inheritance 
class A 
{ 
	void m1() 
	{ 
		System.out.println("Inside A's m1 method"); 
	} 
} 

class B extends A 
{ 
	// overriding m1() 
	void m1() 
	{ 
		System.out.println("Inside B's m1 method"); 
	} 
} 

class C extends A 
{ 
	// overriding m1() 
	void m1() 
	{ 
		System.out.println("Inside C's m1 method"); 
	} 
} 


class Dispatch 
{ 
	public static void main(String args[]) 
	{ 
		// object of type A 
		A a = new A(); 

		// object of type B 
		B b = new B(); 

		// object of type C 
		C c = new C(); 

            c.m1();
		// obtain a reference of type A 
			} 
} 

