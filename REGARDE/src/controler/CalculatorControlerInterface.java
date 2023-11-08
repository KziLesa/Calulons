package controler;

import java.util.List;

import model.CalculatorModelInterface;

public interface CalculatorControlerInterface {
	//Interface Calculateur
	public abstract void change(String accu);
	
	public abstract void change(List<Double> stackData);
	
	public abstract CalculatorModelInterface getModel();
}