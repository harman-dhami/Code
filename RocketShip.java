// Program RocketShip
// Purpose:
//		The purpose of this application is to 
//		paint a rocketship scene as specified 
//		in the assignment, using Rectangle
//		and Polygons (for triangles).
// Programmer: Warren Edwards
// INFO 2313 A12
//
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;



public class RocketShip extends Application {
	
	// Default size of the scene
	private double DEFAULT_SCENE_WIDTH = 200;
	private double DEFAULT_SCENE_HEIGHT = 400;
	// Create a Rocketship Pane
			RocketShipPane rocket = new RocketShipPane();
			
			
	
	@Override // Override the start method in the Application class
	
	public void start(Stage primaryStage) { 
		RocketShipPane up = new RocketShipPane();
		Timeline animation = new Timeline(new 
				KeyFrame(Duration.millis(10), up.moveUp));
	    //animation.setCycleCount(Timeline.INDEFINITE);
		//animation.play();
		
		
		rocket.setOnMousePressed(new EventHandler <MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				
				animation.play();
				
			}
			
		});

		rocket.setOnMouseReleased(new EventHandler <MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				animation.pause();
				
			}
			
		});
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(rocket, 
				DEFAULT_SCENE_WIDTH, 
				DEFAULT_SCENE_HEIGHT);
		primaryStage.setTitle("Rocket Ship");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
		// Print out the author
		System.out.println("Written by Harman Dhami, INFO 2312 A12");
    
	}// start

	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
		launch(args);
	}

	// Inner Class RocketPane
	// Defined inside Rocketship class
	class RocketShipPane extends Pane{
		
		// Constants to define rocket dimensions
		private final double ROCKET_BODY_WIDTH = 20;
		private final double ROCKET_BODY_HEIGHT = 50;
		private final double ROCKET_TOP_HEIGHT = 30;
		private final double ROCKET_TOP_WIDTH = 20;
		private final double ROCKET_FIN_WIDTH = 20;
		private final double ROCKET_FIN_HEIGHT = 20;
		private final double GROUND_HEIGHT = 20;
		
		// Private data fields to keep track of where 
		// the base of the rocket should be
		// Rocket will be in center of the pane
		// on the "ground" at the bottom of the pane
		private double baseX = DEFAULT_SCENE_WIDTH / 2 - 
				(ROCKET_BODY_WIDTH/2 + ROCKET_FIN_WIDTH);
		private double baseY = DEFAULT_SCENE_HEIGHT - GROUND_HEIGHT;
		
		

		// Non-arg constructor for RocketShipPane
		// Draw rocketship
		public RocketShipPane() {
			paintRocket( );
		}
    
		// Method paintRocket
		//	Paint the rocket scene in the correct location
		// 	using Rectangles and Polygons (for Triangles)
		private void paintRocket () {

			// Create ground 
			// using a Rectangle
			Rectangle r1= new Rectangle(baseX-55,baseY,DEFAULT_SCENE_WIDTH,GROUND_HEIGHT);
			r1.setFill(Color.GREEN);
			
			
			// Print the author's name on the ground
			// using a Text 
			Text t1= new Text(baseX-40,baseY+20,"Harman Dhami's Space Center");
						
			// Create left fin of rocketship 
			// using a Polygon
			Polygon fin1= new Polygon();
			fin1.getPoints().addAll(new Double[] {
					baseX,baseY,
					baseX+ROCKET_FIN_WIDTH,baseY,
					baseX+ROCKET_FIN_WIDTH,baseY-ROCKET_FIN_HEIGHT,});
			fin1.setFill(Color.RED);
			
			
			// Create right fin of rocketship
			// using a Polygon
			Polygon fin2= new Polygon();
			fin2.getPoints().addAll(new Double[] {
					baseX+60,baseY,
					baseX+40,baseY-ROCKET_FIN_HEIGHT,
					baseX+40,baseY});
			fin2.setFill(Color.RED);
			
			// Create body of rocketship
			// using a Rectangle
			Rectangle body= new Rectangle(baseX+20,baseY-50,ROCKET_BODY_WIDTH,ROCKET_BODY_HEIGHT);
			body.setFill(Color.WHITE);

			// Create top of rocketship
			// using a Polygon
			Polygon top= new Polygon();
			top.getPoints().addAll(new Double[] {
					baseX+30,baseY-80,
					baseX+ROCKET_TOP_WIDTH,baseY-50,
					baseX+40,baseY-50,});
			top.setFill(Color.RED);
			
			// Clear the RocketShipPane and 
			// add all the rocket components 
			// + the ground.   Set the background
			// color of the RockShipPane to blue
		    getChildren().clear();
		    getChildren().addAll(r1,t1,fin1,fin2,body,top);
		    setStyle("-fx-background-color: blue;");

		}// paintRocket
		
		// setWidth 
		//	This method is called when window is resized.
		// 	If the width is changed, recalculate the 
		//	baseX of the rocket so the scene will be 
		//	redrawn correctly
		@Override
		public void setWidth(double width) {
			super.setWidth(width);
			baseX = super.getWidth() / 2 - 
					(ROCKET_BODY_WIDTH/2 + ROCKET_FIN_WIDTH);
			paintRocket();
		}
	  
		// setHeight 
		//	This method is called when window is resized.
		// 	If the height is changed, recalculate the 
		//	baseY of the rocket so the scene will be 
		//	redrawn correctly
		@Override
		public void setHeight(double height) {
			super.setHeight(height);
			baseY = super.getHeight()- GROUND_HEIGHT;
			paintRocket();
		}
		
		EventHandler moveUp = new EventHandler <MouseEvent>() {
		    public void handle(MouseEvent event) {
				if (baseY< DEFAULT_SCENE_HEIGHT)
					baseY--;
				paintRocket();
		    	
		    	
		}
		    		      };



		

			
		

	};// RocketShipPane
	
}

//RocketShip

