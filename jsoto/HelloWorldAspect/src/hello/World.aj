package hello;

public aspect World {
	
	//Definici�n de un pointcut
	pointcut greeting() : execution(* HelloWorld.sayHello(..));
	//Definici�n de un advice
	before() : greeting() { System.out.print("World");} 

}
