import java.awt.*;

public class Arrays {
    public static void main(String[] args){
        StdDraw.setScale(0,100);
        StdDraw.enableDoubleBuffering();


        double time = 0.017;

        Snowflake[] snowflakes = new Snowflake[5];
        for(int i = 0; i < 5; i++){
            snowflakes[i] = new Snowflake();
        }

        while (true){

            for (Snowflake snowflake : snowflakes) {
                snowflake.drawSnow();
                snowflake.calculate(time);
            }
            Snowflake.drawSnowBuild();

            StdDraw.show();
            StdDraw.pause((int)(time*1000));
            StdDraw.clear(Color.blue);
        }
    }
}