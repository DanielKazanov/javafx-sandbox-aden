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

	private Pane pane = new Pane();
	private int count = 0;
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
    
	// TODO #3- You are going to create a variety of shapes with different attributes...
    Circle circle = new Circle(200, 200, 10);
    Rectangle rectangle = new Rectangle(300, 300, 20, 20);
    Line line = new Line(50, 50, 29, 179);
    Text text = new Text(100, 100, "Daniel is smart.");
    text.setFill(Color.RED);
    text.setUnderline(true);
    text.setStrikethrough(true);
    
	// TODO #5 - How about a couple of buttons??? remember to add them to the pane!
    Button pressButton = new Button("Press me!");
    Button deleteButton = new Button("Delete!");
    
	// TODO #6 - Let's make these buttons useful by defining event handlers using
	//           the setOnAction method().
    pressButton.setOnAction(e -> incButtonCount());
    deleteButton.setOnAction(e -> deleteButtonPressed());
	// TODO #1 - now need a place to put them - how about the pane?
	Scene scene = new Scene(pane, 1000, 800);
	
	// TODO #4 - add the children to the pane....
	pane.getChildren().addAll(circle, rectangle, line, text, pressButton, deleteButton);
	
	// TODO #2 - create the scene with a size of 1000x800
    primaryStage.setTitle("JavaFX Sandbox"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
	
	private void incButtonCount() {
		System.out.println("Press Me button has been pressed " + (++count) + " times");

	}
	
	private void deleteButtonPressed() {
		pane.getChildren().remove(0);
	}
	
  
  public static void main(String[] args) { 
    launch(args);
  
  }
}

