package Pract4;

public class TestStackIntegers {

	public static void main(String[] args) {
		StackIntegers stack = new StackIntegers();
		
		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}