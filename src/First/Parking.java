package First;
import java.util.ArrayList;

public class Parking {
    int type;
    String id;
    int time;

    public Parking(int type, String id, int time) {
        this.type = type;
        this.id = id;
        this.time = time;
    }
    static  void addvehicle(Parking p, ArrayList<Parking>parkings) {
        if (parkings.size() < 3) {
            parkings.add(p);
            System.out.println("added");
        } else {
            System.out.println("sort is filled");
        }
    }
        static void removevehicle (ArrayList < Parking > parkings, String num)
        {
            for (Parking p : parkings) {
                if (p.id.equals(num)) {
                    parkings.remove(p);
                    System.out.println("removed vehicle id" + num);
                    System.out.println("amount to be paid" + p.time * 50);
                }
            }
        }
        public static void main (String[]args)
        {
            Parking p = new Parking(2, "100", 3);
            Parking p1 = new Parking(2, "101", 3);
            Parking p2 = new Parking(2, "102", 3);
            Parking p3 = new Parking(2, "103", 3);
            Parking p4 = new Parking(4, "104", 3);
            Parking p5 = new Parking(4, "105", 3);
            Parking p6 = new Parking(4, "106", 3);
            Parking p7 = new Parking(4, "107", 3);
            ArrayList<Parking> park2 = new ArrayList<>();
            ArrayList<Parking> park4 = new ArrayList<>();
            addvehicle(p, park2);
            addvehicle(p1, park2);
            addvehicle(p2, park2);
            addvehicle(p3, park2);
            removevehicle(park2, "101");
            addvehicle(p4, park4);
            addvehicle(p5, park4);
            addvehicle(p6, park4);
            addvehicle(p7, park4);
            removevehicle(park4, "105");

        }
    }


