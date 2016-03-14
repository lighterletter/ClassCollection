package c4q.lighterletter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-john on 11/24/15.
 * <p/>
 * Given a list of times (military)
 * find the two times with the shortest
 * distance to each other.
 * ex [’03:03’, ’00:01’, ’14:23’]
 * outputs ’00:01’ ’03:03’ 92 (distance in minutes)
 * <p/>
 * ​[6:55]
 * Things to consider:  [’23:45’, ’00:01’] <- what is the distance between these two
 * <p/>
 * ​[6:55]
 * The answer should run in nlogn time
 */
public class MilitaryTime {

    public static void main(String[] args) {


        List<String> times = new ArrayList<String>();

        times.add("00:02");
        times.add("01:03");
        times.add("04:20");
        times.add("07:40");
        times.add("12:37");
        times.add("18:53");
        times.add("23:58");

        int hour;
        int minutes;

        int totalMinutes;
        int previousTotal = 0;

        int currDistace;

        int shortestDistance = Integer.parseInt(times.get(0).substring(3));


        for (int i = 0; i < times.size(); i++) {
            hour = Integer.parseInt(times.get(i).substring(0, 2));
            minutes = Integer.parseInt(times.get(i).substring(3));
            hour = hour * 60;
            totalMinutes = hour + minutes;

            currDistace = totalMinutes - previousTotal;
            previousTotal = totalMinutes;

            System.out.println("Total num of minutes for this cycle: " + totalMinutes);
//            if (){
                System.out.println("shortest: " + (1440 - currDistace + shortestDistance) );
            // }

            if (currDistace <= shortestDistance ) {
                System.out.println("shortest distance found: " + currDistace);
            }
        }
    }
}
