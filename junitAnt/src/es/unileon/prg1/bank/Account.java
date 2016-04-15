package es.unileon.prg1.bank;

class Account{
		
	private Person owner;
	private int balance;

	/*
	El porque es como pone en el pdf y explicó Camino en clase hace bastante,
	que se debia hacer copia de los tipos no básicos para evitar "situaciones peligrosas".
	Usando el parametro "another" se puede crear una copia, creando un objeto,
	en este caso de "Person owner"; , ya que los métodos son punteros, donde hay un espacio de memoria,
	si se modifica el original, se pierde todo poniendo lo nuevo (se sustituye).
	
	
	
	*/
	
	Account (Account another){
		this.owner = new Person(another.getOwner()); //modificado
		this.balance = another.getBalance();
	}
	
	
    Account(Person owner){
    	this.owner = new Person(owner); //modificado
   		this.balance = 0;
    }

		
    Account(Person owner, int balance){
    	this.owner = new Person(owner); //modificado
   		this.balance = balance;
    }
    
    int getBalance(){
    	return balance;
    }
    
	
	
    Person getOwner(){
    	return new Person(this.owner); //modificado
    }
    
    void deposit (int amount){
    		this.balance += amount;
    }
    
    void withdraw (int amount){
    		this.balance -= amount;
    }

    public String toString(){
    	    return "Account: " + 
    	    owner.toString() +
    	    " - Balance: " + balance;
    }

}
