int x = 400;
int y = 600;
void setup() {
  size(800, 800);
  background(0, 0, 40); 
}

void draw() {
  background(0, 0, 40); 
  noStroke();
   fill(#F7C819);
    ellipse(115, 150, 100, 100);
   fill(0, 0, 40);
    ellipse(130, 150, 100, 100);
  fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    y = y-2;
}