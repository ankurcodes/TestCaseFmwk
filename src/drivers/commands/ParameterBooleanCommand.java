package drivers.commands;

import java.util.ArrayList;
import java.util.Scanner;

public class ParameterBooleanCommand implements ParameterCommand{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static char whatMattersBoolean;

	@Override
	public void menu() {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter choice ");
		System.out.println("1: true");
		System.out.println("2: false");
		
		
		whatMattersBoolean = s.next().charAt(0);
		s.close();
	}

	public boolean logic(char number) {
		switch (number) {

		case 1:
			return true;

		case 2:

			return false;

		default:
			return false;

		}

	}
	@Override
	public boolean execute(ArrayList<String> result) {
		boolean ans = logic(whatMattersBoolean);
		result.add(ans+"");
		return true;
	}
	@Override
	public void setStatus(boolean b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object read(String line) {
		// TODO Auto-generated method stub
		return null;
	}

}
