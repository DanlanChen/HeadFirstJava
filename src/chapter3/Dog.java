package chapter3;

class Dog {
	String name;
	public void bark(){
		System.out.println(name +" says Ruff");
	}
	public void eat(){
		
	}
	public void chaseCat(){
		
	}
	public static void main(String[] args){
		//make a dog object and access it
		Dog dog1 = new Dog();
		dog1.name = "Bart";
		dog1.bark();
		
		//now make a god array
		Dog[] myDogs = new Dog[3];
		//and put some dogs in it
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//now access the Dogs using the array references
		
		myDogs[0].name = "Fred" ;
		myDogs[1].name = "Marge";
		
		//Hmm,what is myDogs[2] name?
		System.out.println("Last dog's name is ");
		System.out.println(myDogs[2].name);
		
		//now loop through the array
		//and tell all dogs to bark
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;
		}
		
	}

}
