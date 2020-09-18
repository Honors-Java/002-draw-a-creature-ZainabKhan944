void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  background(250);
  stroke(0);
 rectMode(CORNER);
 // Colors the legs and tail white
 fill(250)
 // This coding makes up the legs and tail
 rect(235,210, 10, 40);
 rect(215,215, 10, 40);
 rect(150,210, 10, 40);
 rect(180,210, 10, 40);
 rect(115 ,200, 40, 5);
 ellipseMode(CENTER); 


// This makes the body, and head color white.
fill(250)
//This coding makes up the body and head shapes
ellipse(200, 200, 125, 50);
ellipse(249, 157, 50, 50);
fill(0)
// This makes the nose
ellipse(249, 165, 5, 5);

// Colors the whiskers black
fill(0) 
// This coding makes up the whiskers
rect(240,160, 2, 2);
rect(235,157, 2, 2);
rect(240,165, 2, 2);
rect(235,165, 2, 2);
rect(240,170, 2, 2);
rect(235,175, 2, 2);
rect(255,160, 2, 2);
rect(255,165, 2, 2);
rect(255,170, 2, 2);  
rect(260,165, 2, 2);
rect(260,157, 2, 2);
rect(260,175, 2, 2);

 // This colors the eyes, and ears black
 fill(0)
 // These make the eyes
 ellipse(242, 147, 5, 8);
 ellipse(260, 147, 5, 8);

// This coding makes up the ears		 
rect(232,132, 2, 2);
rect(237,120, 2, 2);
rect(241,132, 2, 2);

rect(252,132, 2, 2);
rect(257,120, 2, 2);
rect(261,132, 2, 2);

rect(235,126, 2, 2);
rect(240,126, 2, 2);

rect(255,126, 2, 2);
rect(260,126, 2, 2);
}