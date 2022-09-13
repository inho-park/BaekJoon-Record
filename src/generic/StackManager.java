package generic;

public class StackManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0;i<10;i++) stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}
	}

}


class MyStack<T> implements IStack<T> {
	int tos;
	Object [] stack;
	MyStack() {
		tos = 0;
		stack = new Object [10];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (tos==0) return null;
		tos--;
		return (T) stack[tos];
	}

	@Override
	public boolean push(T ob) {
		// TODO Auto-generated method stub
		if (tos == 10) {
			System.out.println("stack is full");
			return false;
		}
		stack[tos] = ob;
		tos++;
		return true;
	}
	
}