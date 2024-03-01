package com.formacion.ipartek.ipartekmg0966.entidades;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 250)
	private String apellidos;
	
	@Column(name = "fNacimiento", nullable = true)
	private Date fNacimiento; 
	
	@Column(name = "direccion", nullable = true, length = 250)
	private String direccion; 
	
	@Column(name = "poblacion", nullable = true, length = 150)
	private String poblacion; 
	
	@Column(name = "codigopostal", nullable = true, unique = true)
	private Integer codigopostal; 
	
	@Column(name = "telefono", nullable = false)
	private Integer telefono;
	
	@Column(name = "email", nullable = false, length = 150)
	private String email;
	
	@Column(name = "dni", nullable = false, length = 9, unique = true)
	private String dni;
	
	@Column(name="nHermanos", columnDefinition = "int default 0")
	private Integer nHermanos; 
	
	@Column(name="activo", columnDefinition = "int default 1")
	private Boolean activo;
	
	
	public Alumno() {
		
	}
	
	public Alumno(Long codigo, String nombre, String apellidos, Date fNacimiento, String direccion, String poblacion,
			Integer codigopostal, Integer telefono, String email, String dni, Integer nHermanos, Boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fNacimiento;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.codigopostal = codigopostal;
		this.telefono = telefono;
		this.email = email;
		this.dni = dni;
		this.nHermanos = nHermanos;
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



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Date getfNacimiento() {
		return fNacimiento;
	}



	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
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



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public Integer getnHermanos() {
		return nHermanos;
	}



	public void setnHermanos(Integer nHermanos) {
		this.nHermanos = nHermanos;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}



	@Override
	public int hashCode() {
		return Objects.hash(activo, apellidos, codigo, codigopostal, direccion, dni, email, fNacimiento, nHermanos,
				nombre, poblacion, telefono);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(codigopostal, other.codigopostal)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(dni, other.dni)
				&& Objects.equals(email, other.email) && Objects.equals(fNacimiento, other.fNacimiento)
				&& Objects.equals(nHermanos, other.nHermanos) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(poblacion, other.poblacion) && Objects.equals(telefono, other.telefono);
	}



	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fNacimiento="
				+ fNacimiento + ", direccion=" + direccion + ", poblacion=" + poblacion + ", codigopostal="
				+ codigopostal + ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + ", nHermanos="
				+ nHermanos + ", activo=" + activo + "]";
	}
	
	
	
	

}
