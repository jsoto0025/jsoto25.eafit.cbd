package org.pl.eshop.app;

public aspect EshopAspect {

	// Definición de un pointcut
	pointcut crear() : execution(* EshopApp.CrearNuevasCategorias(..));
	pointcut listar() : execution(* EshopApp.ListaCategorias(..));
	pointcut modificar() : execution(* EshopApp.MoficarCategorias(..));
	pointcut borrar() : execution(* EshopApp.BorrarCategorias(..));
	
	
	// Definición de un advice
	before() : crear() {
		System.out.println("Creando nuevas categorias");
	}
	
	before() : listar() {
		System.out.println("Listando las categorias");
	}
	
	before() : modificar() {
		System.out.println("Modificando las categorias");
	}
	
	before() : borrar() {
		System.out.println("Borrando las categorias");
	}

}
