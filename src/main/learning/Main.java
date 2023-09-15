package learning;


import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        int balls = 5;
        game(balls);

    }

    static void game(int balls)
    {
        Random random = new Random();

        int mazeLenght = 7;
        int[] slots = new int[mazeLenght + 1];

        for (int i = 0; i < balls; i++)
        {
            int baal = 0;
            for (int j = 0; j < mazeLenght; j++)
            {
                int fall = random.nextInt(2);
                if (fall == 1)
                {
                    System.out.print("R");
                    baal++;
                }else System.out.print("L");
            }
            slots[baal] += 1;
            System.out.println();
        }
        System.out.print(Arrays.toString(slots));
    }
}