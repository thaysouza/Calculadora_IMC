package model;

import java.text.DecimalFormat;

public class ImcBeam {
    private float peso;
    private float altura;
    
    
    public ImcBeam() {
    	
    }
    
   public ImcBeam(String peso, String altura) {
    	setPeso(peso);
    	setAltura(altura);
    }
    
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+") == false ? 0f : Float.parseFloat(peso));
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+") == false ? 0f : Float.parseFloat(altura));
	}
    
	public String getResult() {
		Float imc = (peso / (altura * altura) );
		if(imc.isNaN()) 
			return "Valor errado";
			
			StringBuilder result = new StringBuilder("IMC = " + new DecimalFormat("#.##\n").format(imc));
			
			if(imc < 18.5) {
			   result.append(" Abaixo do Peso ");
			}else if((imc >= 18.5) && (imc <= 24.9)) {
				result.append(" Peso Normal ");
			}else if((imc >= 25) && (imc <= 29.9)) {
				result.append(" Sobrepeso ");
			}else if((imc >= 30) && (imc <= 34.9)) {
				result.append(" Obesidade Grau 1 ");
			}else if((imc >= 35) && (imc <= 39.9)) {
				result.append(" Obesidade Grau 2 ");
			}else if(imc >= 40) {
				result.append(" Obesidade Mórbida ");
			}
		
		return result.toString();
	}
	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}
	
	
    
}
