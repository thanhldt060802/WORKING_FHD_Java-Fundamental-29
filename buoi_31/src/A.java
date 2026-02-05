public class A {

	// // public class B {  // Lớp lồng thành phần
	
	// // 	public int value;
		
	// // 	public B(int value) {
	// // 		this.value = value;
	// // 	}
		
	// // 	public void greeting() {
	// // 		System.out.println("From class B");
	// // 	}

	// // 	public void testAccessToComponentsOfClassA() {
	// // 		System.out.println(this.value);
	// // 		this.greeting();
	// // 		System.out.println(A.this.value);
	// // 		A.this.greeting();
	// // 	}
	
	// // }
	
	// public static class B {  // Lớp lồng thành phần tĩnh
	
	// 	public int value;
		
	// 	public B(int value) {
	// 		this.value = value;
	// 	}
		
	// 	public void greeting() {
	// 		System.out.println("From class B");
	// 	}

	// 	// public void testAccessToComponentsOfClassA() {
	// 	// 	System.out.println(this.value);
	// 	// 	this.greeting();
	// 	// 	System.out.println(A.this.value);
	// 	// 	A.this.greeting();
	// 	// }
	
	// }

	// public int value;
	
	// public A(int value) {
	// 	this.value = value;
	// }
	
	// public void greeting() {
	// 	System.out.println("From class A");
	// }

	public void solveProblem() {
		class B {  // Lớp lồng cục bộ
		
			public int value;
			
			public B(int value) {
				this.value = value;
			}
			
			public void greeting() {
				System.out.println("From class B!");
			}
		
		}
		
		B objectB = new B(-100);
		System.out.println(objectB.value);
		objectB.greeting();
	}

}