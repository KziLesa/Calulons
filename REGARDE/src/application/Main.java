package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	public void start(Stage arg0) throws Exception {
		
	    view.CalculatorGUI gui1 = new view.CalculatorGUI();
		model.CalculatorModel mod1 = new model.CalculatorModel();
		controler.CalculatorControler cc1 = new controler.CalculatorControler(mod1, gui1);
		
		Label label = new Label("0"); //affiche le nombre qu'on est en train de rentrer
		label.setMinWidth(14);
        label.setLayoutX(300-label.getBoundsInLocal().getWidth());  // position X fixe
        label.setLayoutY(80);
        label.setTextFill(Color.WHITE);
        label.setFont(new javafx.scene.text.Font(50));
        
        Label label2 = new Label("Accu: "); //affiche la liste des nombres en mémoire
		label2.setMinWidth(14);
        label2.setLayoutX(20);  // position X fixe
        label2.setLayoutY(20);  //position y fixe
        label2.setTextFill(Color.WHITE);
        label2.setFont(new javafx.scene.text.Font(10));
        
        Label label3 = new Label(""); //historique des actions
		label3.setMinWidth(14);
        label3.setLayoutX(300-label3.getBoundsInLocal().getWidth()*2);  // position X fixe
        label3.setLayoutY(50);  //position y fixe
        label3.setTextFill(Color.WHITE);
        label3.setFont(new javafx.scene.text.Font(20));
		
		view.Bouton b1 = new view.Bouton("1", label, label2, label3, cc1); //creation des boutons
		view.Bouton b2 = new view.Bouton("2", label, label2,label3, cc1);
		view.Bouton b3 = new view.Bouton("3", label, label2,label3, cc1);
		view.Bouton b4 = new view.Bouton("4", label, label2,label3, cc1);
		view.Bouton b5 = new view.Bouton("5", label, label2,label3, cc1);
		view.Bouton b6 = new view.Bouton("6", label, label2,label3, cc1);
		view.Bouton b7 = new view.Bouton("7", label, label2,label3, cc1);
		view.Bouton b8 = new view.Bouton("8", label, label2,label3, cc1);
		view.Bouton b9 = new view.Bouton("9", label, label2,label3, cc1);
		view.Bouton b0 = new view.Bouton("0", label, label2,label3, cc1);
		
		view.Bouton bP = new view.Bouton("+", label, label2,label3, cc1);
		view.Bouton bM = new view.Bouton("-", label, label2,label3, cc1);
		view.Bouton bF = new view.Bouton("X", label, label2,label3, cc1);
		view.Bouton bD = new view.Bouton("/", label, label2,label3, cc1);
		view.Bouton bCS = new view.Bouton("+/-", label, label2,label3, cc1);
		view.Bouton bV = new view.Bouton(",", label,label2,label3, cc1);
		view.Bouton bClr = new view.Bouton("clr", label, label2,label3, cc1);
		view.Bouton bRst = new view.Bouton("rs", label, label2,label3, cc1);
		view.Bouton bPush = new view.Bouton("<>", label, label2,label3, cc1);
		view.Bouton bSuppr = new view.Bouton("<-", label, label2,label3, cc1);
		view.Bouton bSwap = new view.Bouton("<->", label, label2,label3, cc1);
		// TODO Auto-generated method stub

		Pane grid = new Pane();
 
	    Rectangle ecran = new Rectangle(10, 10, 380, 150);
	    ecran.setFill(Color.BLACK);

        // Créer la scène
	    grid.getChildren().addAll(b1, b2, b3, bP,bSwap, //mettre les boutons dans le Pane ainsi que des labels de l'écran
 					b4, b5, b6, bM, bCS, bSuppr,
 					b7, b8, b9, bF, bRst,
 					b0,bV,bPush, bD, bClr,
 					ecran,
 					label, label2, label3);
        Scene scene = new Scene(grid, 400, 500);
        
        //System.out.println("bjr");
        // Définir la scène pour la fenêtre
        arg0.setTitle("Calulatrice");
        arg0.setScene(scene);
        arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
