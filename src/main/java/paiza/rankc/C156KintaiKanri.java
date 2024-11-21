package paiza.rankc;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class C156KintaiKanri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        long hour = 0;
        long minute = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] times = line.split(" ");
            LocalTime startTime = LocalTime.parse(times[0]);
            LocalTime endTime = LocalTime.parse(times[1]);

            long minutesDifference = Duration.between(startTime, endTime).toMinutes();
            minute += minutesDifference;
        }
        hour = minute / 60;
        minute = minute % 60;
        System.out.println(hour + " " + minute);
    }
}
