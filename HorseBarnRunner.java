import java.util.ArrayList;

public class HorseBarnRunner {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();
        ArrayList<Horse> barnSpaces = barn.getSpaces();

        int i = 0;

        while (i < barnSpaces.size()) {
            Horse h = barnSpaces.get(i);

            if (h.getName().equals("Patches")) {
                System.out.println("Bye bye " + barnSpaces.remove(i));
            }
            else if (h.getName().equals("Lady")) {
                System.out.println("Bye bye " + barnSpaces.remove(i));
            }
            else {
                i++;
            }
        }

        System.out.println("\nHorses remaining in the barn:");

        for (Horse h : barnSpaces) {
            System.out.println(h);
        }
    }
}
