import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pl.eshop.dto.Categoria;

import junit.framework.Assert;

class CategoriaTest {

	@Test(expected = IllegalArgumentException.class)
	void debeGeneraErrorIllegalArgumentExceptionSiIdEsMenorACertoTest()
	{
		//Arrange
		Categoria categoria = new Categoria();
		int idCategoria = -500;
		//Act
		categoria.setId(idCategoria);
		//Assert
	}
	
	@Test(expected = IllegalArgumentException.class)
	void debeGeneraErrorIllegalArgumentExceptionSiNombreEsNull()
	{
		//Arrange
		Categoria categoria = new Categoria();
		String nombre = null;
		//Act
		categoria.setNombre(nombre);
		//Assert
	}
	
	@Test(expected = IllegalArgumentException.class)
	void debeGeneraErrorIllegalArgumentExceptionSiNombreEsVacio()
	{
		//Arrange
		Categoria categoria = new Categoria();
		String nombre = "";
		//Act
		categoria.setNombre(nombre);
		//Assert
	}
	
	@Test(expected = IllegalArgumentException.class)
	void debeGeneraErrorIllegalArgumentExceptionSiLongitudNombreEsMenorQue3()
	{
		//Arrange
		Categoria categoria = new Categoria();
		String nombre = "Pe";
		//Act
		categoria.setNombre(nombre);
		//Assert
	}
	
	@Test
	void debeEstarElNombreVacioCuandoSeCreaUnaCategoriaSinPasarParametros()
	{
		//Arrange
		Categoria categoria;
		String nombreEsperado = "";
		String nombreDevuelto = "";
		//Act
		categoria = new Categoria()
		nombreDevuelto = categoria.getNombre();
		//Assert
		Assert.assertSame(nombreEsperado, nombreDevuelto);
	}

}
