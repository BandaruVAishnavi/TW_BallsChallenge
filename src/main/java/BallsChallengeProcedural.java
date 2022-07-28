import processing.core.PApplet;
public class BallsChallengeProcedural extends PApplet{
    int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("BallsChallengeProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawSpheres();
    }
    private void drawSpheres() {
        ellipse(x1, HEIGHT/5, DIAMETER, DIAMETER);
        x1+=1;
        ellipse(x2, HEIGHT*2/5, DIAMETER, DIAMETER);
        x2+=2;
        ellipse(x3, HEIGHT*3/5, DIAMETER, DIAMETER);
        x3+=3;
        ellipse(x4, HEIGHT*4/5, DIAMETER, DIAMETER);
        x4+=4;
    }
}
