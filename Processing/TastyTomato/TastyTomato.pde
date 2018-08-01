void setup() {
    size(500, 500);
    background(255, 255, 255);
    fill(#D30909);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#198314);
    rect(176, 103, 12, 32);
}
void draw() {
    if (mousePressed == true){
      fill(255, 255, 255);
      ellipse(mouseX, mouseY, 50, 50);
    }  
}