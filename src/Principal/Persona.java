package Principal;
/**
 * 
 * @author Pablo D
 * @author Cris T
 * @author Jurgen A
 * @author Cesar M
 * @author Erick V
 *
 */
public class Persona {
	
	//atributos de la clase
	private String nombre, apellido;
	private String cedula;
	private int cant_meses_trabajados;
	private double salario_total, aguinaldo;
	//maximo doce meses de salario
	private String fechaIngreso, fechaSalida;
	private int diasVacaciones;
	
	
	//contructor
	public Persona() {
		

		
		
	}
	

	public void calcularAguinaldo() {
	aguinaldo = (salario_total * cant_meses_trabajados) / cant_meses_trabajados;
		
		
		
	}
	
	public void mostrar () { 
		
	
	
		
	}
	
	/**
	 * 
	 * @return
	 */
	public double calcularPreaviso() {
		
		 double preaviso = 0;
		
		return preaviso; 
	}
	
	public double calcularSinPreaviso() {
		
		double sinPreaviso = 0;
	
		
		return sinPreaviso; 
	}
	
	/**
	 * 
	 * @return
	 */
	public double calcularCensatia() {
		
		 double censatia = 0;
		
		return censatia; 
	}
	
	/**
	 * 
	 * @return
	 */
	public double totalLiquidacion() {
		
		 double aguinaldo = 0;
		
		return aguinaldo; 
	}
	
	
	/**
	 * 
	 * Metodos Setter and Getter
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}


}
