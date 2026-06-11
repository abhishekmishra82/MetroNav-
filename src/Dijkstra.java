import java.util.*;

public class Dijkstra {

    public static int[] dist;
    public static int[] prev;

    /**
     * Runs Dijkstra from the given source index.
     * Populates dist[] and prev[] for path queries.
     */
    public static void compute(Graph graph, int srcIdx) {
        int n = graph.size();
        dist = new int[n];
        prev = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        dist[srcIdx] = 0;

        // Min-heap: [cost, stationIndex]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{ 0, srcIdx });

        while (!pq.isEmpty()) {
            int[] curr   = pq.poll();
            int   cost   = curr[0];
            int   u      = curr[1];

            if (cost > dist[u]) continue; // stale entry, skip

            for (int[] edge : graph.getNeighbors(u)) {
                int v      = edge[0];
                int weight = edge[1];
                int newDist = dist[u] + weight;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    prev[v] = u;
                    pq.offer(new int[]{ newDist, v });
                }
            }
        }
    }

    /**
     * Reconstructs the station path from source to destIdx using prev[].
     */
    public static List<String> getPath(Graph graph, int destIdx) {
        List<String> path = new ArrayList<>();
        int idx = destIdx;
        while (idx != -1) {
            path.add(0, graph.getStation(idx).name);
            idx = prev[idx];
        }
        return path;
    }
}
