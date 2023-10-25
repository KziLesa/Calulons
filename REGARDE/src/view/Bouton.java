package view;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Bouton extends Button {
	
	Label lab;
	
	public Bouton(String txt, Label l, Label l2, Label l3, controler.CalculatorControler cc1 ) {
		/*txt est l'etiquette du bouton, lab est l'affichage de l'écran de la calculatrice, cc1 est le CalulatorControler
		  que l'on utilise */
		
		super(txt);
		this.lab = l;
		if (txt=="1"||txt=="2"||txt=="3"||txt=="4"||txt=="5"||txt=="6"||txt=="7"||txt=="8"||txt=="9"||txt=="0"){ //si ce sont les boutons "nombres"
			
			setPrefSize(70, 70); //taille du bouton	
			
			this.setOnAction(e -> {//change l'affichage quand on appuie dessus
		        if (lab.getText().equals("0")) lab.setText("");
				lab.setText(lab.getText()+ this.getText());
				
				Text text =new Text(lab.getText()); //deplacement texte
				lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5); //*3,5 parce que sinon ça marche mal sans vraie raison
				//System.out.println(text.getLayoutBounds().getWidth());
	            cc1.change(lab.getText());} //modif accu
			);
			if (txt=="1"||txt=="4"||txt=="7") this.setLayoutX(40);	//placement des boutons
			if (txt=="2"||txt=="5"||txt=="8") this.setLayoutX(120);
			if (txt=="3"||txt=="6"||txt=="9") this.setLayoutX(200);
			
				
			if (txt=="1"||txt=="2"||txt=="3") this.setLayoutY(180);
			if (txt=="4"||txt=="5"||txt=="6") this.setLayoutY(260);
			if (txt=="7"||txt=="8"||txt=="9") this.setLayoutY(340);
			
			if (txt=="0") {this.setLayoutX(40);this.setLayoutY(420);} // si c'est 0
		}
		
		else if (txt == "+") { //si c'est le bouton +
			
			this.setPrefSize(70, 70);
			this.setLayoutX(280);
		    this.setLayoutY(180);
			
			this.setOnAction(e -> { //action d'addition, actualisation de l'affichage
				if(cc1.model.getTab().size()>=2) {
	             cc1.model.add();
	             lab.setText(cc1.model.getAccu());
	             Text text =new Text(lab.getText());
	             lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
	             l2.setText("Mem: " + cc1.model.getTab().toString());
	             l3.setText(lab.getText());
	             Text text1 =new Text(l3.getText());
				 l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
				} 
			});
				
		}
		else if (txt == "-") { //si c'est le bouton -
			
			this.setPrefSize(70, 70);
			this.setLayoutX(280);
		    this.setLayoutY(260);
			
			this.setOnAction(e -> { //action de soustraction, actualisation de l'affichage
				if(cc1.model.getTab().size()>=2) {
	             cc1.model.substract();
	             lab.setText(cc1.model.getAccu());
	             Text text =new Text(lab.getText());
	             lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
	             l2.setText("Mem: " + cc1.model.getTab().toString());
	             l3.setText(lab.getText());
	             Text text1 =new Text(l3.getText());
				 l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
				}
	        });
		}
		else if (txt == "X") { //si c'est le bouton X
			
			this.setPrefSize(70, 70);
			this.setLayoutX(280);
		    this.setLayoutY(340);
			
			this.setOnAction(e -> { //action de multiplication, actualisation de l'affichage
				if(cc1.model.getTab().size()>=2) {
		             cc1.model.multiply();
		             lab.setText(cc1.model.getAccu());
		             Text text =new Text(lab.getText());
					 lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
					 l2.setText("Mem: " + cc1.model.getTab().toString());
					 l3.setText(lab.getText());
					 Text text1 =new Text(l3.getText());
					 l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
					}
		        });
		}
		
		else if (txt == "/") { //si c'est le bouton /
			
			this.setPrefSize(70, 70);
			this.setLayoutX(280);
		    this.setLayoutY(420);
		     
			this.setOnAction(e -> { //action de division, actualisation de l'affichage
				if(cc1.model.getTab().size()>=2) {
		             cc1.model.divide();
		             lab.setText(cc1.model.getAccu());
		             Text text =new Text(lab.getText());
					 lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
					 l2.setText("Mem: " + cc1.model.getTab().toString());
					 l3.setText(lab.getText());
					 Text text1 =new Text(l3.getText());
					 l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
					}
		        });
		}
		
		else if (txt == "clr") { //si c'est le bouton Clear
			
			this.setPrefSize(40, 20); 
			this.setLayoutX(355);
		    this.setLayoutY(465);
		     
			this.setOnAction(e -> { //clear l'affichage
		        lab.setText("0");
		        Text text =new Text("0");
		        lab.setLayoutX(300- text.getLayoutBounds().getWidth());
		   });
		}
		
		else if (txt == "rs") { //si c'est le bouton Reset
			
			this.setPrefSize(40, 20); 
			this.setLayoutX(355);
		    this.setLayoutY(415);
			
			this.setOnAction(e -> { //vide Accu et vide la liste du CalculatorControler
		        cc1.model.setAccu("");
		        cc1.model.setTab(new ArrayList<>());
				lab.setText("0");
				l2.setText("Mem: ");
			});
		}
		
		else if (txt == ",") { //si c'est le bouton virgule
			
			this.setPrefSize(70, 70); 
			this.setLayoutX(120);
		    this.setLayoutY(420);
			
			this.setOnAction(e -> { //clear l'affichage
		        lab.setText(lab.getText() + ".");
		        cc1.model.setAccu(cc1.model.getAccu() + ".");});
				Text text =new Text(lab.getText());
				lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
		}
		
		else if (txt == "+/-") { //si c'est le bouton changement de signe
			
			this.setPrefSize(40, 20); 
			this.setLayoutX(355);
		    this.setLayoutY(365);
			
			this.setOnAction(e -> { //change le signe du nombre
		        cc1.model.opposite();
		        l2.setText("Mem: " + cc1.model.getTab().toString());
		        lab.setText(cc1.model.getAccu());
		        Text text =new Text(lab.getText());
				lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);});
		}
		
		else if (txt == "<>") { //si c'est le bouton push
			
			this.setPrefSize(70, 70); 
			this.setLayoutX(200);
		    this.setLayoutY(420);
			
			this.setOnAction(e -> { //change le signe du nombre
				l3.setText(lab.getText());
				Text text1 =new Text(l3.getText());
				l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
				cc1.model.push();
	    	 	l2.setText("Mem: " + cc1.model.getTab().toString());
	    	 	lab.setText("0");
	    	 	Text text =new Text(lab.getText());
				lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
				cc1.change("0");
				});
		}
		else if (txt == "<-") { //si c'est le bouton delete
			
			this.setPrefSize(40, 20); 
			this.setLayoutX(355);
		    this.setLayoutY(315);
			
			this.setOnAction(e -> { //efface un caractère d'une chaîne, actualise l'affichage
				if(lab.getText().length()>0) {
					String texteActuel = lab.getText().substring(0, lab.getText().length() - 1);
				    lab.setText(texteActuel);
				    cc1.change(lab.getText());
				    
				    if(lab.getText().length()==0){lab.setText("0");cc1.change(lab.getText());}
				    
				    Text text =new Text(lab.getText());
				    lab.setLayoutX(300 - text.getLayoutBounds().getWidth()*3.5);
		    	 		
				}
			});
				
		}
		else if (txt == "<->") { //si c'est le bouton pswap
			
			this.setPrefSize(40, 20); 
			this.setLayoutX(355);
		    this.setLayoutY(265);
			
			this.setOnAction(e -> { //swap et actualise la visualisation de l'accu
				if(cc1.model.getTab().size()>=2) {
					cc1.model.swap();
					l2.setText("Mem: " + cc1.model.getTab().toString());
					l3.setText(cc1.model.getTab().get(0).toString());
					Text text1 =new Text(l3.getText());
					l3.setLayoutX(300 - text1.getLayoutBounds().getWidth()*1.5);
		    	 		
				}
			});
		}
	}

}