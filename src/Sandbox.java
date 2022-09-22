import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Sandbox extends Application {

	private Pane pane;
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
    
	// TODO #3- You are going to create a variety of shapes with different attributes...
    
	// TODO #5 - How about a couple of buttons??? remember to add them to the pane!
	
	// TODO #6 - Let's make these buttons useful by defining event handlers using
	//           the setOnAction method().
	  
	// TODO #1 - now need a place to put them - how about the pane?
    
	
	// TODO #4 - add the children to the pane....
	
	
	// TODO #2 - create the scene with a size of 1000x800

    primaryStage.setTitle("JavaFX Sandbox"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) { 
    launch(args);
  }
}

