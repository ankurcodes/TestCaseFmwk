package drivers.commands;

import java.io.Serializable;
import java.util.ArrayList;

public interface ParameterCommand extends  Serializable{
	
	public void menu();
	public boolean execute(ArrayList<String> result);
	public void setStatus(boolean b);
	public Object read(String line);
	public String toString();
}
