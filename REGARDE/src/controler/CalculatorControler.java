package controler;

import java.util.List;

import model.CalculatorModelInterface;

public class CalculatorControler implements CalculatorControlerInterface {
	public model.CalculatorModelInterface model;
	
	//Constructeur
	public CalculatorControler(model.CalculatorModelInterface model) {
		this.model = model;
		
	}
	//Modifier l'accumulateur
	public void change(String accu) {
		// TODO Auto-generated method stub
		model.setAccu(accu);
	}
	//Modifier la pile
	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		model.setTab(stackData);
	}
	@Override
	//Getter model
	public CalculatorModelInterface getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
