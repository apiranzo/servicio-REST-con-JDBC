package com.formacion.ipartek.ipartekmg0966.entidades;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre; //nn 100
	
	@Column(name = "identificador", nullable = false, length = 12)
	private String identificador; //nn 12
	
	@Column(name = "fInicio", nullable = true)
	private Date fInicio;
	
	@Column(name = "fFin", nullable = true)
	private Date fFin;
	
	@Column(name = "nHoras", nullable = false)
	private Integer nHoras; //nn
	
	@Column(name = "temario", nullable = true)
	private String temario;
	
	@Column(name="activo", columnDefinition = "int default 1")
	private Boolean activo; //Defou-1
	
	@ManyToOne
	@JoinColumn(name = "cliente_codigo", nullable = true, foreignKey = @ForeignKey(name = "fk_curso_cliente_codigo"))
	private Cliente cliente;
	
	@Column(name="precio", columnDefinition = "double default 0.00")
	private Double precio; //Defou - 0.00
	
	@ManyToOne
	@JoinColumn(name = "profesor_codigo", nullable = true, foreignKey = @ForeignKey(name = "fk_curso_profesor_codigo"))
	private Profesor profesor;
	
	public Curso() {
		
	}

	
	
	public Curso(Long codigo, String nombre, String identificador, Date fInicio, Date fFin, Integer nHoras,
			String temario, Boolean activo, Cliente cliente, Double precio, Profesor profesor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.identificador = identificador;
		this.fInicio = fInicio;
		this.fFin = fFin;
		this.nHoras = nHoras;
		this.temario = temario;
		this.activo = activo;
		this.cliente = cliente;
		this.precio = precio;
		this.profesor = profesor;
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



	public String getIdentificador() {
		return identificador;
	}



	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}



	public Date getfInicio() {
		return fInicio;
	}



	public void setfInicio(Date fInicio) {
		this.fInicio = fInicio;
	}



	public Date getfFin() {
		return fFin;
	}



	public void setfFin(Date fFin) {
		this.fFin = fFin;
	}



	public Integer getnHoras() {
		return nHoras;
	}



	public void setnHoras(Integer nHoras) {
		this.nHoras = nHoras;
	}



	public String getTemario() {
		return temario;
	}



	public void setTemario(String temario) {
		this.temario = temario;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public Profesor getProfesor() {
		return profesor;
	}



	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}



	@Override
	public int hashCode() {
		return Objects.hash(activo, cliente, codigo, fFin, fInicio, identificador, nHoras, nombre, precio, profesor,
				temario);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(cliente, other.cliente)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(fFin, other.fFin)
				&& Objects.equals(fInicio, other.fInicio) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nHoras, other.nHoras) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(precio, other.precio) && Objects.equals(profesor, other.profesor)
				&& Objects.equals(temario, other.temario);
	}



	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", identificador=" + identificador + ", fInicio="
				+ fInicio + ", fFin=" + fFin + ", nHoras=" + nHoras + ", temario=" + temario + ", activo=" + activo
				+ ", cliente_codigo=" + cliente+ ", precio=" + precio + ", profesor_codigo=" + profesor
				+ "]";
	}
	
	

}
