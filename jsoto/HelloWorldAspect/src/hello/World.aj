package hello;

public aspect World {
	
	//Definición de un pointcut
	pointcut greeting() : execution(* HelloWorld.sayHello(..));
	//Definición de un advice
	before() : greeting() { System.out.print("World");} 

}
