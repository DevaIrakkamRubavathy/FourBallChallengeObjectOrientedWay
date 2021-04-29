class BallPosition {
    private int WIDTH;
    private int HEIGHT;
    private int DIAMETER;

    BallPosition(int width, int height, int diameter) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.DIAMETER = diameter;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getDIAMETER() {
        return DIAMETER;
    }

    public void setDIAMETER(int DIAMETER) {
        this.DIAMETER = DIAMETER;
    }
}
