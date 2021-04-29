import processing.core.PApplet;

public class MovingBallsUsingProcessingObjectOrientedWay extends PApplet {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;

    public static void main(String[] args) {
        PApplet.main("MovingBallsUsingProcessingObjectOrientedWay", args);
    }

    BallPosition ballPosition = new BallPosition(648, 488, 30);

    @Override
    public void settings() {
        super.settings();
        size(ballPosition.getWIDTH(), ballPosition.getHEIGHT());
    }

    @Override
    public void draw() {
        drawCircle();
    }

    public void drawCircle() {
        ellipse(a, ballPosition.getHEIGHT() / 5, ballPosition.getDIAMETER(), ballPosition.getDIAMETER());
        a += 1;
        ellipse(b, 2 * ballPosition.getHEIGHT() / 5, ballPosition.getDIAMETER(), ballPosition.getDIAMETER());
        b += 2;
        ellipse(c, 3 * ballPosition.getHEIGHT() / 5, ballPosition.getDIAMETER(), ballPosition.getDIAMETER());
        c += 3;
        ellipse(d, 4 * ballPosition.getHEIGHT() / 5, ballPosition.getDIAMETER(), ballPosition.getDIAMETER());
        d += 4;
    }
}
