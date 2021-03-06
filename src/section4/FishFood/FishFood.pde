int foodX = 100;
int foodY = 20;
int score = 0;

void setup(){
  size(500,500);
}

void draw(){
  background(141,233,237);
  
  fill(200,23,50);
  noStroke();
  ellipse(foodX, foodY, 10, 10);
  
  foodY=foodY + 3;
  
  if (foodY>500){
    foodY=-5;
    foodX= (int) random(width-20);
  }
  
  
  drawFish();
  checkCatch(foodX, foodY);
}

void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(mouseX-45,mouseY,25,25); //mouth
}

void checkCatch(int x, int y){
  if(x > mouseX && x < mouseX+70){
      if(y>mouseY-17 && Y <mouseY+70){
        score++;
        foodY=-5;
        foodX = (int) random(width-20);
      }
  }
  if (foodY>height && score>0){
    score--;
  }
  
  println(mouseX + " " + mouseY + " " + x + " " + y);
  
  if (mousePressed) {
    exit();
  }
}