package mod;
import java.util.*;
public class first {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int S = seconds % 60;
        int hours = seconds/60;
        int minutes = hours%60;
        hours=hours/60;
        int i=(hours<24)?hours:hours/60;
        System.out.printf("%d:%02d:%02d", i, minutes, S);

    }
}