package org.pl.eshop.app;
import java.sql.SQLException;
import java.util.List;

import org.pl.eshop.dto.*;
import org.pl.eshop.general.*;
import org.pl.eshop.dto.*;

public class EshopApp {

	public static void main(String[] args) {

		
		CategoriaDAOMySQL categoriaDAO = new CategoriaDAOMySQL();
		
		for(int i=0;i<10;i++)
		{
			Categoria categoria = new Categoria(); 
			categoria.setId(i);
			categoria.setNombre("Categoria nombre: " + String.valueOf(i) );
			categoria.setDescripcion("Categoria descripción: " + String.valueOf(i));
			try
			{
				categoriaDAO.agregar(categoria);
				System.out.println("Info: Se agregó la categoria" + categoria.getNombre() );
			}catch(SQLException ex)
			{
				System.out.println("Error: " + ex.getMessage());
			}
			
		}
		

		try
		{
			
			List<Categoria> categorias = categoriaDAO.obtenerTodas();
			
			for(int i = 0;i< categorias.size();i++)
			{
				
				System.out.println("Categoria: " + ((Categoria)categorias.get(i)).getNombre());
				
			}
			
			
		}catch(SQLException ex)
		{
			System.out.println("Error: " + ex.getMessage());
		}
			

	}

}
