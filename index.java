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
 fill(250);
 // This coding makes up the legs and tail
 fill(200);
 rect(235,210, 10, 40);
 rect(215,215, 10, 40);
 rect(150,210, 10, 40);
 rect(180,210, 10, 40);
 rect(115 ,200, 40, 5);
 ellipseMode(CENTER); 

fill(0);
triangle(240,122, 235, 134, 246, 135);
triangle(260,122, 253, 134, 264, 135);
// This makes the body, and head color white.
fill(250);
//This coding makes up the body and head shapes
fill(200);
ellipse(200, 200, 125, 50);
ellipse(249, 157, 50, 50);
fill(0);
// This makes the nose
ellipse(249, 165, 5, 5);

// Colors the whiskers black
fill(0) ;
// This coding makes up the whiskers
line(245, 162, 235, 157);
line(242, 168, 234, 167);
line(242, 172, 235, 176);
line(256, 162, 262, 157);
line(256, 168, 263, 167);
line(256, 173, 262, 177);

 // This colors the eyes, and ears black
 fill(0);
 // These make the eyes
 ellipse(242, 147, 5, 8);
 ellipse(260, 147, 5, 8);




}