package tests;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(dependsOnMethods = {"efg","abc"})
	public void fgc(){
		
		System.out.println("This test case should run after ijk");
}    @Test
	public void ijk(){
		System.out.println("this test case have to run before fgc method");
	}
@Test
public void efg(){
	System.out.println("dont know what to put :p");
}
@Test 
public void abc(){
	System.out.println("This test case will run before every test cases");
}



//With the help of dependsonmethod concept i can run any test that i want to run 1st based on the senarios.
//Also i can run one class method to another class method using dependsOnMethods concept.but i have to do  extends the class or object ref of class.

}
