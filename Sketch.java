import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 700);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {
  	  //quadrant 1 (10x10 grid)
    
      //(vertical lines)
    	for(int intLine = 0; intLine <= 10; intLine ++){
        int intLineX = intLine * width / 20;
        stroke(0);
        line(intLineX, 0, intLineX, height/2);
      }

      //(horizontal lines)
      for(int intLine = 0; intLine <= 10; intLine ++){
        int intLineY = intLine * height / 20;
        stroke(0);
        line(0, intLineY, width/2, intLineY);
      }
    
      //quadrant 2 (5 rows of 5 circles)
      //Row 1
      for(int intCircle = 0; intCircle < 5; intCircle ++){
        int intCircleX = intCircle * (width/2) / 5 + (width/2) + (width/20);
        fill(255, 0, 200);
        ellipse(intCircleX, (float)(height/25), (float)(width/20), (float)(height/20));
      }

      //Row 2 
      for(int intCircle = 0; intCircle < 5; intCircle ++){
        int intCircleX = intCircle * (width/2) / 5 + (width/2) + (width/20);
        fill(255, 0, 200);
          ellipse(intCircleX, (float)(height/7.8), (float)(width/20), (float)(height/20));
        }
  
      //Row 3
      for(int intCircle = 0; intCircle < 5; intCircle ++){
        int intCircleX = intCircle * (width/2) / 5 + (width/2) + (width/20);
        fill(255, 0, 200);
            ellipse(intCircleX, (float)(height/4.5), (float)(width/20), (float)(height/20));
        }
      
  
      //Row 4
      for(int intCircle = 0; intCircle < 5; intCircle ++){
        int intCircleX = intCircle * (width/2) / 5 + (width/2) + (width/20);
        fill(255, 0, 200);
            ellipse(intCircleX, (float)(height/3.2), (float)(width/20), (float)(height/20));
        }
  
      //Row 5
      for(int intCircle = 0; intCircle < 5; intCircle ++){
        int intCircleX = intCircle * (width/2) / 5 + (width/2) + (width/20);
        fill(255, 0, 200);
            ellipse(intCircleX, (float)(height/2.48), (float)(width/20), (float)(height/20));
        }
  

      //Quadrant 3 (gradient)

      //loop that creates gradient effect
      for(int x = 0; x < width/2; x ++){
        int intColour = x * 255 / (width/2); 
        stroke(intColour);
        line(x, height/2, x, height);
        }
      
      //Quadrant 4(flower)
      //Petals
      fill(158, 69, 5);
      stroke(0);
      translate((float)(width * 0.75), (float)(height * 0.75));
      for(int intpetal = 0; intpetal < 8; intpetal ++){
        rotate(PI/4);
        ellipse((float)(width/10), 0, (float)(width/5), (float)(height/13.3));
      }
  
      //Centre
      fill(15, 87, 22);
      ellipse(0, 0, (float)(width/7), (float)(height/7));
  // define other methods down here.
  }
}