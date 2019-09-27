package org.phone;

public class Phone {
	public void phoneName(String name ) {
		System.out.println("Phone name name is " + name);
	}

	public void phoneModel(String name, long model) {
		System.out.println("Phone model is " + name);
		System.out.println("phone model is is " + model);
	}
	public void phoneDetails(String Ram, String Memory) {
		System.out.println("Phone rem is " + Ram);
		System.out.println("phone memory is " + Memory);
	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneName("Microsoft");
		p.phoneModel("Lumia 640", 64000l);
		p.phoneDetails("three", "TWO");
	}
}
