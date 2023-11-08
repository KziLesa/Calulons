package model;

import java.util.List;

public interface CalculatorModelInterface {
	
	//Interface modèle calulateur 
	public abstract void add();
	public abstract void substract();	
	public abstract void multiply();	
	public abstract void divide(); 	
	public abstract void opposite();
	public abstract void push();
	public abstract void pop();
	public abstract void drop();
	public abstract void swap();
	public abstract void clear();
	public abstract void setAccu(String accu);
	public abstract void setTab(List<Double> tab);
	public abstract List<Double> getTab();
	public abstract String getAccu();
}