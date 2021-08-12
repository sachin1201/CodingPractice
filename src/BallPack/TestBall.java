package BallPack;

public class TestBall {

    public static void main(String[] args) {

        Ball ball = new Ball(5,5,5,5,5);
        ball.setX(85);
        System.out.println(ball.getRadius());
        System.out.println(ball);

        float xMin = 0;
        float xMax = 100;
        float yMin = 0;
        float yMax = 50;

        for(int i = 0; i < 30; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            if(xNew + ball.getRadius() >= xMax || xNew - ball.getRadius() <= xMin) {
                ball.reflectHorizontal();
            }
            if(yNew + ball.getRadius() >= yMax || yNew - ball.getRadius() <= yMin) {
                ball.reflectVertical();
            }
        }



    }

}
