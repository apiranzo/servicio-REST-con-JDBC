package com.formacion.ipartek.ipartekmg0966.entidades;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo; // nn
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre; // nn 50
	
	@Column(name = "email", nullable = false, length = 150)
	private String email; //150 nn
	
	@Column(name = "telefono", nullable = false)
	private Integer telefono; // nn
	
	@Column(name = "direccion", nullable = true, length = 250)
	private String direccion; //250
	
	@Column(name = "poblacion", nullable = true, length = 150)
	private String poblacion; //150
	
	@Column(name = "codigopostal", unique = true)
	private Integer codigopostal; // 5 UN zerofill
	
	@Column(name = "identificador", nullable = false, length = 15)
	private String identificador; // 15 NN
	
	@Column(name="activo", columnDefinition = "int default 1")
	private Boolean activo; //defoult 1
	
	public Cliente() {
		
	}

	
	public Cliente(Long codigo, String nombre, String email, Integer telefono, String direccion, String poblacion,
			Integer codigopostal, String identificador, Boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.codigopostal = codigopostal;
		this.identificador = identificador;
		this.activo = activo;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public Integer getCodigopostal() {
		return codigopostal;
	}


	public void setCodigopostal(Integer codigopostal) {
		this.codigopostal = codigopostal;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public Boolean getActivo() {
		return activo;
	}


	public void setActivo(Boolean activo) {
		this.activo = activo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(activo, codigo, codigopostal, direccion, email, identificador, nombre, poblacion, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(codigopostal, other.codigopostal) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(poblacion, other.poblacion)
				&& Objects.equals(telefono, other.telefono);
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", poblacion=" + poblacion + ", codigopostal=" + codigopostal
				+ ", identificador=" + identificador + ", activo=" + activo + "]";
	}
	
	
}
