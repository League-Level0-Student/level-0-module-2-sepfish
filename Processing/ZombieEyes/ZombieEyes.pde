void setup() {
  size(400, 400);
  PImage face = loadImage("face.jpg");
  face.resize(400, 400);
  image(face, 0, 0);
}

void draw() {
  noStroke();
  fill(mouseX, mouseY, mouseX+mouseY);
  ellipse(150, 135, 30, 75);
  ellipse(235, 135, 30, 75);
  fill(0, 0, 0);
  ellipse(150, 135, 25, 25);
  ellipse(235, 135, 25, 25);
}