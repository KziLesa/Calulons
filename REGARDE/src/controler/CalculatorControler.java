package controler;

import java.util.List;

public class CalculatorControler implements CalculatorControlerInterface {
	public model.CalculatorModel model;
	view.CalculatorGUI cGUI;
	
	
	public CalculatorControler(model.CalculatorModel model, view.CalculatorGUI cGUI) {
		this.model = model;
		this.cGUI = cGUI;
	}
	public void change(String accu) {
		// TODO Auto-generated method stub
		model.setAccu(accu);
	}

	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		model.setTab(stackData);
	}

}
