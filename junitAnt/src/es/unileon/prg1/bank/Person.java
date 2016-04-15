package es.unileon.prg1.bank;

class Person{

	private String name;
	Person(String name){
			this.name = name;
	}
	
	//Necesario añadir para que el parámetro another recoja un nombre
	//como copia.
	//añadido:
	Person(Person another){
			this.name = another.getName(); 
			
	}

	String getName(){
		return this.name;
	}
	
	void setName(String nombre){
		this.name = nombre;
	}

	public String toString(){
		return this.name;
	}
	
}
