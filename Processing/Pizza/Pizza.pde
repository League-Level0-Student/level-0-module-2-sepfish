void setup() {
  size(800, 800);
  noStroke();
  fill(#F7D7AF);
  ellipse(400, 400, 200, 200);
  fill(#F05913);
  ellipse(400, 400, 180, 180);
  fill(#FCE27F);
  ellipse(400, 400, 170, 170);
}

void draw() {
  PImage pizza = loadImage("pizza.ppm.gif");
  pizza.resize(10, 10);
  if (mousePressed == true && mouseX < 500 && mouseX > 300 && mouseY < 500 && mouseY > 300){
  image(pizza, mouseX, mouseY);
  }
}