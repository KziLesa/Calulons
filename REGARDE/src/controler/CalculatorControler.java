package controler;

import java.util.List;

import model.CalculatorModelInterface;

public class CalculatorControler implements CalculatorControlerInterface {
	public model.CalculatorModelInterface model;
	
	
	public CalculatorControler(model.CalculatorModelInterface model) {
		this.model = model;
		
	}
	public void change(String accu) {
		// TODO Auto-generated method stub
		model.setAccu(accu);
	}

	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		model.setTab(stackData);
	}
	@Override
	public CalculatorModelInterface getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
