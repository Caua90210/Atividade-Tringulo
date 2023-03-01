package br.senai.sp.model;

public class Triangulo {
	
		//Propriedades/Atributos da classe
	 public double base;
	 public double ladoB;
	 public double ladoC;
	 public double altura;
	 public String nome;
	 
	 //Métodos da Classe
	 
	 public void CalcularArea() {

		 double area = (base * altura) / 2;
		System.out.println("Área = " + area);
   
	 }

	
	 
	public  void mostrarDimensoes() {
		
	System.out.println("----------------------------");
		System.out.println (nome);
		System.out.println("----------------------------");
		System.out.println ("base: " + base);
		System.out.println ("ladoB: " + ladoB);
		System.out.println ("ladoC: " + ladoC);
		System.out.println ("altura: " + altura);
		CalcularArea();
	}
		
		
	 }	


	
	


