package prob4;

public class MyStack implements Stack {
	private int size;
	private int top;
	private String result;
	private String[] stack;

	public MyStack() {

	}

	public MyStack(int size) {
		this.size = size;
		stack = new String[size];
		top = 0;
	}

	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		if (top == size) {
			resize();
		}
		stack[top++] = item;

	}

	@Override
	public String pop() throws MyStackException {
		// TODO Auto-generated method stub
		if (top == 0) {
			throw new MyStackException("오류발생");
		} else {
			result = stack[top - 1];
			top--;
		}

		return result;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public void resize() {
		String[] stackTemp = stack;
		stack = new String[size * 2];
		int index = 0;
		for (String s : stackTemp) {
			stack[index] = s;
			index++;
		}

	}

}
