package org.pl.eshop.app;

import java.sql.SQLException;
import java.util.List;

import org.pl.eshop.dto.*;
import org.pl.eshop.general.*;
import org.pl.eshop.dto.*;

public class EshopApp {

	public static void main(String[] args) {

		new EshopApp().CrearNuevasCategorias();

		new EshopApp().ListaCategorias();

		new EshopApp().MoficarCategorias();
		
		new EshopApp().BorrarCategorias();

	}

	public void CrearNuevasCategorias() {
		CategoriaDAOMySQL categoriaDAO = new CategoriaDAOMySQL();
		
		for (int i = 0; i < 10; i++) {
			Categoria categoria = new Categoria();
			categoria.setId(i);
			categoria.setNombre("Categoria nombre: " + String.valueOf(i));
			categoria.setDescripcion("Categoria descripción: " + String.valueOf(i));
			try {
				categoriaDAO.agregar(categoria);
			} catch (SQLException ex) {

			}
		}

	}

	public void ListaCategorias() {
		CategoriaDAOMySQL categoriaDAO = new CategoriaDAOMySQL();

		try {
			List<Categoria> categorias = categoriaDAO.obtenerTodas();
			for (int i = 0; i < categorias.size(); i++) {

			}

		} catch (SQLException ex) {

		}

	}

	public void MoficarCategorias() {
		CategoriaDAOMySQL categoriaDAO = new CategoriaDAOMySQL();

		try {
			List<Categoria> categorias = categoriaDAO.obtenerTodas();
			for (int i = 0; i < categorias.size(); i++) {
				Categoria categoria = categorias.get(i);
				categoria.setNombre(categoria.getNombre() + "Mod");
				categoriaDAO.modificar(categoria);
			}

		} catch (SQLException ex) {

		}
	}

	public void BorrarCategorias() {
		CategoriaDAOMySQL categoriaDAO = new CategoriaDAOMySQL();
		try {
			List<Categoria> categorias = categoriaDAO.obtenerTodas();
			for (int i = 0; i < categorias.size(); i++) {
				Categoria categoria = categorias.get(i);
				categoriaDAO.eliminar(categoria);
			}

		} catch (SQLException ex) {

		}
	}
}
