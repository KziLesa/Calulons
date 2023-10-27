package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CalculatorGUI extends Application implements CalcultorGUIInterface {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		model.CalculatorModel mod1 = new model.CalculatorModel();
		controler.CalculatorControler cc1 = new controler.CalculatorControler(mod1);
		
		TextArea label2 = new TextArea("Pile: ");
	    label2.setPrefSize(380, 150);
	    label2.setMinWidth(14);
	    label2.setLayoutX(10);  // position X fixe
	    label2.setLayoutY(10);  //position y fixe
	    label2.setFont(new javafx.scene.text.Font(20));
	    label2.setStyle("-fx-text-fill: black;"); 
	        
		Label label = new Label("0"); //affiche le nombre qu'on est en train de rentrer
		label.setMinWidth(300 - label.getLayoutBounds().getWidth()*3.5);
        label.setLayoutX(275);  // position X fixe
        label.setLayoutY(80);

        label.setFont(new javafx.scene.text.Font(50));
        
        Text erreur = new Text("Action impossible");
        erreur.setFill(Color.RED);
        erreur.setLayoutX(190);
        erreur.setLayoutY(55);
        erreur.setFont(new javafx.scene.text.Font(20));
        erreur.setVisible(false);
        //affiche la liste des nombres en mémoire
		
        label2.setOnMouseClicked(event -> {
            label2.setEditable(false); // Désactive l'édition
            event.consume(); // Empêche l'édition du texte
        });
		
		view.Bouton b1 = new view.Bouton("1", label, label2, cc1, erreur); //creation des boutons
		view.Bouton b2 = new view.Bouton("2", label, label2, cc1, erreur);
		view.Bouton b3 = new view.Bouton("3", label, label2, cc1, erreur);
		view.Bouton b4 = new view.Bouton("4", label, label2, cc1, erreur);
		view.Bouton b5 = new view.Bouton("5", label, label2, cc1, erreur);
		view.Bouton b6 = new view.Bouton("6", label, label2, cc1, erreur);
		view.Bouton b7 = new view.Bouton("7", label, label2, cc1, erreur);
		view.Bouton b8 = new view.Bouton("8", label, label2, cc1, erreur);
		view.Bouton b9 = new view.Bouton("9", label, label2, cc1, erreur);
		view.Bouton b0 = new view.Bouton("0", label, label2, cc1, erreur);
		
		view.Bouton bP = new view.Bouton("+", label, label2, cc1, erreur);
		view.Bouton bM = new view.Bouton("-", label, label2, cc1, erreur);
		view.Bouton bF = new view.Bouton("X", label, label2, cc1, erreur);
		view.Bouton bD = new view.Bouton("/", label, label2, cc1, erreur);
		view.Bouton bCS = new view.Bouton("+/-", label, label2, cc1, erreur);
		view.Bouton bV = new view.Bouton(",", label,label2, cc1, erreur);
		view.Bouton bClr = new view.Bouton("clr", label, label2, cc1, erreur);
		view.Bouton bRst = new view.Bouton("rs", label, label2, cc1, erreur);
		view.Bouton bPush = new view.Bouton("<>", label, label2, cc1, erreur);
		view.Bouton bSuppr = new view.Bouton("<-", label, label2, cc1, erreur);
		view.Bouton bSwap = new view.Bouton("<->", label, label2, cc1, erreur);
		view.Bouton bDrop = new view.Bouton("○", label, label2, cc1, erreur);
		// TODO Auto-generated method stub

		Pane grid = new Pane();
 
	    //Rectangle ecran = new Rectangle(10, 10, 380, 150);
	    //ecran.setFill(Color.BLACK);
	    
        // Créer la scène
	    grid.getChildren().addAll(bDrop,
	    		b1, b2, b3, bP,bSwap, //mettre les boutons dans le Pane ainsi que des labels de l'écran
 					b4, b5, b6, bM, bCS, bSuppr,
 					b7, b8, b9, bF, bRst,
 					b0,bV,bPush, bD, bClr,
 					label2, label, erreur);
        Scene scene = new Scene(grid, 400, 500);
        
        //System.out.println("bjr");
        // Définir la scène pour la fenêtre
        arg0.setTitle("Calculatrice");
        arg0.setScene(scene);
        arg0.setResizable(false);
        arg0.show();
		
	}
	public static void launchApp(String[] args) {
        launch(args);
    }
}
