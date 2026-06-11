import java.util.*;

public class Graph {
    private List<Station> stations = new ArrayList<>();
    private Map<String, List<int[]>> adjList = new HashMap<>();
    // int[] = { neighborIndex, weightInKm }

    public int addStation(String name, String line) {
        Station s = new Station(name, line);
        stations.add(s);
        adjList.put(name, new ArrayList<>());
        return stations.size() - 1;
    }

    public void addEdge(String src, String dest, int weightKm) {
        int srcIdx  = indexOf(src);
        int destIdx = indexOf(dest);
        if (srcIdx == -1 || destIdx == -1) {
            System.out.println("Warning: station not found for edge " + src + " <-> " + dest);
            return;
        }
        adjList.get(src) .add(new int[]{ destIdx, weightKm });
        adjList.get(dest).add(new int[]{ srcIdx,  weightKm });
    }

    public List<int[]> getNeighbors(int index) {
        String name = stations.get(index).name;
        return adjList.getOrDefault(name, new ArrayList<>());
    }

    public int indexOf(String name) {
        for (int i = 0; i < stations.size(); i++)
            if (stations.get(i).name.equalsIgnoreCase(name)) return i;
        return -1;
    }

    public Station getStation(int index) { return stations.get(index); }
    public int size()                    { return stations.size(); }
    public List<Station> getStations()   { return stations; }
}
