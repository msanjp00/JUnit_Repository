package es.unileon.prg1.bank;

class Person{

	private String name;
	Person(String name){
			this.name = name;
	}
	
	Person(Person another){
			this.name = another.getName(); //añadido "otro" para getname		
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
