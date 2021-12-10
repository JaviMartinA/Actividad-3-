package Actividad_2;

public class Subclase1 extends Base {
	private int unidades;
	private float precio;
	private boolean aprobado;
	public Subclase1(int unidades, float precio, boolean aprobado) {
		super();
		this.unidades = unidades;
		this.precio = precio;
		this.aprobado = aprobado;
	}
	
	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isAprobado() {
		return aprobado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	public float operacion() {
		return unidades*precio;
	}

	public String informar() {
		return " El total suma*precio es=" + operacion() + "";
	}
