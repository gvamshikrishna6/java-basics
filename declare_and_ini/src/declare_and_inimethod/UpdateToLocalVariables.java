package declare_and_inimethod;

public class UpdateToLocalVariables {

	public void localVariable() {
		int i = 100;
		System.out.println("before update local variable value ="+i);

	}

	int i;

	public static void main(String[] args) {

		UpdateToLocalVariables up = new UpdateToLocalVariables();
		up.localVariable();
		System.out.println(up.i = 200);
	}

}
