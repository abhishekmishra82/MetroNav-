import java.util.*;

public class Main {

    static Graph graph = MetroMap.build();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printBanner();

        while (true) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1" -> findRoute(sc);
                case "2" -> listStations();
                case "3" -> { System.out.println("\n  Goodbye! Happy commuting!\n"); return; }
                default  -> System.out.println("\n  Invalid choice. Enter 1, 2, or 3.\n");
            }
        }
    }

    // ── Route Finder ──────────────────────────────────────────────────────────

    static void findRoute(Scanner sc) {
        System.out.println("\n  Enter source station (partial name ok):");
        System.out.print("  > ");
        String srcInput = sc.nextLine().trim();

        System.out.println("  Enter destination station (partial name ok):");
        System.out.print("  > ");
        String destInput = sc.nextLine().trim();

        String source = findStation(srcInput);
        String dest   = findStation(destInput);

        if (source == null) { System.out.println("\n  Station not found: \"" + srcInput + "\"\n"); return; }
        if (dest   == null) { System.out.println("\n  Station not found: \"" + destInput + "\"\n"); return; }
        if (source.equals(dest)) { System.out.println("\n  Source and destination are the same!\n"); return; }

        int srcIdx  = graph.indexOf(source);
        int destIdx = graph.indexOf(dest);

        Dijkstra.compute(graph, srcIdx);

        int totalKm = Dijkstra.dist[destIdx];
        if (totalKm == Integer.MAX_VALUE) {
            System.out.println("\n  No route found between these stations.\n");
            return;
        }

        List<String> path = Dijkstra.getPath(graph, destIdx);
        int fare  = FareCalculator.calculateFare(totalKm);
        int stops = path.size() - 1;

        System.out.println();
        System.out.println("  ┌─────────────────────────────────────────────────┐");
        System.out.printf ("  │  %-49s│%n", "Route: " + source + " → " + dest);
        System.out.println("  ├─────────────────────────────────────────────────┤");
        System.out.printf ("  │  Distance : %-36s│%n", totalKm + " km");
        System.out.printf ("  │  Stops    : %-36s│%n", stops);
        System.out.printf ("  │  Fare     : ₹%-35d│%n", fare);
        System.out.println("  └─────────────────────────────────────────────────┘");
        System.out.println();
        System.out.println("  Station-by-station path:");
        for (int i = 0; i < path.size(); i++) {
            String name = path.get(i);
            String line = graph.getStation(graph.indexOf(name)).line;
            String tag  = " (" + line + " Line)";
            if (i == 0)                System.out.println("  🟢 " + name + tag + "  [START]");
            else if (i == path.size()-1) System.out.println("  🏁 " + name + tag + "  [END]");
            else                        System.out.println("  ◉  " + name + tag);
        }
        System.out.println();
    }

    // ── Station Search (partial match, case-insensitive) ─────────────────────

    static String findStation(String input) {
        String lower = input.toLowerCase();
        // exact match first
        for (Station s : graph.getStations())
            if (s.name.equalsIgnoreCase(input)) return s.name;
        // partial match
        List<String> matches = new ArrayList<>();
        for (Station s : graph.getStations())
            if (s.name.toLowerCase().contains(lower)) matches.add(s.name);
        if (matches.size() == 1) return matches.get(0);
        if (matches.size() > 1) {
            System.out.println("\n  Multiple stations match \"" + input + "\":");
            for (int i = 0; i < matches.size(); i++)
                System.out.println("    " + (i+1) + ". " + matches.get(i));
            System.out.print("  Choose number: ");
            Scanner sc2 = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(sc2.nextLine().trim());
                if (choice >= 1 && choice <= matches.size()) return matches.get(choice - 1);
            } catch (NumberFormatException ignored) {}
        }
        return null;
    }

    // ── List All Stations ────────────────────────────────────────────────────

    static void listStations() {
        String[] lines = {"Yellow", "Blue", "Red", "Violet"};
        System.out.println();
        for (String line : lines) {
            System.out.println("  ── " + line + " Line ──");
            int count = 0;
            for (Station s : graph.getStations()) {
                if (s.line.equals(line)) {
                    System.out.printf("    %-35s%n", s.name);
                    count++;
                }
            }
            System.out.println("    Total: " + count + " stations\n");
        }
    }

    // ── UI Helpers ───────────────────────────────────────────────────────────

    static void printBanner() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════╗");
        System.out.println("  ║          MetroNav+ Delhi Metro System            ║");
        System.out.println("  ║    Yellow · Blue · Red · Violet Lines            ║");
        System.out.println("  ╚══════════════════════════════════════════════════╝");
        System.out.println();
    }

    static void printMenu() {
        System.out.println("  ┌─────────────────────────┐");
        System.out.println("  │  1. Find Route & Fare   │");
        System.out.println("  │  2. List All Stations   │");
        System.out.println("  │  3. Exit                │");
        System.out.println("  └─────────────────────────┘");
        System.out.print("  Choice: ");
    }
}
