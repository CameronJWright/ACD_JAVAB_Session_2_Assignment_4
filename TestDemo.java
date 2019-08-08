package Assignments;

public class TestDemo {

	public static void main(String[] args) {

		char ch;

		for (int i = 0; i < args.length; i++) {
			ch = (char) (Integer.parseInt(args[i]));
			if (Integer.parseInt(args[i]) == 0)
				System.out.println("You Have Entered Zero : " + ch);
			if (Integer.parseInt(args[i]) < 0)
				System.out.println("You Have Negative Zero : " + ch);
			if (Integer.parseInt(args[i]) > 0)
				System.out.println("You Have Positive Zero : " + ch);

		}

	}

}
