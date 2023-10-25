package controler;

import java.util.List;

public interface CalculatorControlerInterface {
	
	public abstract void change(String accu);
	
	public abstract void change(List<Double> stackData);
}