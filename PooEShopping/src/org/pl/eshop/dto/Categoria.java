package org.pl.eshop.dto;
import java.lang.*;

public class Categoria {
	private Integer id;
	private String nombre;
	private String descripcion;

	public Categoria() {
		this.nombre = "";
	}

	public Categoria(Integer id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) throws IllegalArgumentException {
		if(id<0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			this.id = id;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre)  throws IllegalArgumentException {
		if(nombre == null)
		{
			throw  new IllegalArgumentException();
		}else {
			if(nombre.length()==0 || nombre.length()<3)
			{
				throw  new IllegalArgumentException();
			}else {
				this.nombre = nombre;
			}
			
		}
			
		
	}

	public String getDescripcion()  {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
