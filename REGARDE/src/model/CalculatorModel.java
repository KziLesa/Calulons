package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	public String accu = "0";
	public List<Double> tab = new ArrayList<>();
	
	public String getAccu() {
		return accu;
	}
	
	public List<Double> getTab() {
		return tab;
	}
	public void setTab(List<Double> tab) {
		this.tab = tab;
	}
	
	//opération d'addition
	public void add() { 
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1+n2);
		accu=Double.toString(n1+n2);
	}
	
	//opération de soustraction
	public void substract() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n2-n1);
		accu=Double.toString(n2-n1);
	}
	
	//opération de multiplication
	public void multiply() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1*n2);
		accu=Double.toString(n1*n2);
	}
	
	//opération de division
	public void divide() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n2/n1);
		accu=Double.toString(n2/n1);
	}
	
	//changement de signe du dernier élément placé dans la pile
	public void opposite() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(-n1);
		accu=Double.toString(-n1);
	}
	
	//action de placer un élément dans la pile
	public void push() {
		// TODO Auto-generated method stub
		tab.add(Double.parseDouble(accu));
	}
	
	//getter du dernier élément placé dans la pile
	public void pop() {
		// TODO Auto-generated method stub
		tab.get(tab.size()-1);
	}
	
	//action de supprimer le dernier élément placé dans la pile
	public void drop() {
		// TODO Auto-generated method stub
		tab.remove(tab.size()-1);
	}
	
	//action d'échanger les deux derniers éléments placés dans la pile
	public void swap() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1);
		tab.add(n2);
	}
	
	//action de d'effacer l'entrée
	public void clear() {
		// TODO Auto-generated method stub
		tab.clear();
	}
	
	//modification de l'accumulateur 
	public void setAccu(String accu) {
		this.accu = accu;
	}



}
