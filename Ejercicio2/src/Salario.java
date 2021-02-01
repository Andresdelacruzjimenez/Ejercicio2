
public class Salario {

	String tipo;
	float ventasMes;
	float horasExtra;

	Salario() {

		tipo = null;
		ventasMes = 0;
		horasExtra = 0;

	}

	Salario(String tipo, float ventasMes, float horasExtra) {
		this.tipo = tipo;
		this.ventasMes = ventasMes;
		this.horasExtra = horasExtra;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getVentasMes() {
		return ventasMes;
	}

	public void setVentasMes(float ventasMes) {
		this.ventasMes = ventasMes;
	}

	public float getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(float horasExtra) {
		this.horasExtra = horasExtra;
	}

	public static float calculaSalarioBruto( String tipo, float ventasMes,float horasExtra) {
		int salario = 0;
		if (tipo.equals("vendedor")) {
			salario = 1000;
		} else {
			if (tipo.equals("vendedor") && ventasMes >= 1000) {
				salario = salario+100;
			} else {

				if (tipo.equals("vendedor") && ventasMes >= 1500) {
					salario = salario+200;
				} else {
					if (tipo.equals("encargado")) {
						salario=1500;
					} else {
						if (tipo.equals("encargado") && ventasMes >=1000) {
							salario=salario+100;
						}else {
							if (tipo.equals("encargado") && ventasMes >=1500) {
								salario=salario+200;
							}
						}
						
					}
				}
				

			}
		}
		return salario+(horasExtra*20);
	}
	
	
	public static float calculaSalarioNeto( float salario) {
		
		float salarioN=0;
		if (salario<1000) {
			salarioN=salario;
		}else {
			if (salario>=1000 && salario<1500) {
				salarioN=salario-(16*salario/100);
			} else {
				if (salario>=1500) {
					salarioN=salario-(16*salario/100);
				} else {

				}
			}
		}
		
		
		return salarioN;
		
	}
 
	
	
	
	
	
}
