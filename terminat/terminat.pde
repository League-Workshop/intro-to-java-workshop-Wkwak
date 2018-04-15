PImage catPic;
int eye1x = 365;
int eye2x = 410;
int eye1y = 105;
int eye2y = 124;
int acc = 5;

void setup(){
  size(500,500);
  catPic = loadImage("cat.jpg");
  catPic.resize(500,500);
  background(catPic);
}

void draw(){
  if(mousePressed){
    println("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " + mouseY + "\n");}
    fill (255,0,0);
    noStroke();
    ellipse(eye1x,eye1y,60,120);
    ellipse(eye2x,eye2y,60,120);
}

void keyPressed(){
  eye1x+=2*acc;
  eye2x+=2*acc;
  eye1y+=2*acc;
  eye2y+=2*acc;
  
}