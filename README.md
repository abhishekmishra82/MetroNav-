# MetroNav+ — Delhi Metro Navigation System

A Java-based console application that helps commuters find the shortest route, fare, and stop-by-stop path between any two stations on the Delhi Metro network.

---

## Features

- **Shortest Route Finder** — uses Dijkstra's algorithm to compute the optimal path by distance
- **Fare Estimation** — calculates ticket fare based on Delhi Metro's official distance slabs
- **Partial Name Search** — type part of a station name; the app handles ambiguity interactively
- **Multi-line Support** — covers Yellow, Blue, Red, and Violet lines with interchange connections
- **Station Directory** — browse all stations grouped by line

---

## Project Structure

```
MetroNav/
├── src/
│   ├── Main.java            # Entry point, CLI menu, user interaction
│   ├── Graph.java           # Adjacency-list graph with weighted edges
│   ├── Station.java         # Station model (name + line)
│   ├── MetroMap.java        # Hard-coded Delhi Metro network (stations + edges)
│   ├── Dijkstra.java        # Dijkstra's shortest-path algorithm
│   └── FareCalculator.java  # Fare slab logic
├── out/                     # Compiled .class files (git-ignored)
├── .gitignore
└── README.md
```

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher

Verify your installation:
```bash
java -version
javac -version
```

### Build

From inside the `MetroNav/` directory:
```bash
javac -d out src/*.java
```

### Run

```bash
java -cp out Main
```

---

## Usage

On launch you'll see the main menu:

```
  ╔══════════════════════════════════════════════════╗
  ║          MetroNav+ Delhi Metro System            ║
  ║    Yellow · Blue · Red · Violet Lines            ║
  ╚══════════════════════════════════════════════════╝

  ┌─────────────────────────┐
  │  1. Find Route & Fare   │
  │  2. List All Stations   │
  │  3. Exit                │
  └─────────────────────────┘
```

### Option 1 — Find Route & Fare

Enter source and destination station names (partial names are accepted):

```
  Enter source station (partial name ok):
  > rajiv
  Enter destination station (partial name ok):
  > huda
```

Sample output:

```
  ┌─────────────────────────────────────────────────┐
  │  Route: Rajiv Chowk → HUDA City Centre          │
  ├─────────────────────────────────────────────────┤
  │  Distance : 22 km                               │
  │  Stops    : 11                                  │
  │  Fare     : ₹50                                 │
  └─────────────────────────────────────────────────┘

  Station-by-station path:
  🟢 Rajiv Chowk (Yellow Line)  [START]
  ◉  Patel Chowk (Yellow Line)
  ◉  Central Secretariat (Yellow Line)
  ...
  🏁 HUDA City Centre (Yellow Line)  [END]
```

If multiple stations match your input, you'll be prompted to pick one:

```
  Multiple stations match "sector":
    1. Noida Sector 15
    2. Noida Sector 16
    3. Noida Sector 18
    4. Sector 28 Faridabad
  Choose number:
```

### Option 2 — List All Stations

Displays every station grouped by line with a count per line.

### Option 3 — Exit

Exits the application.

---

## Metro Network Coverage

| Line   | Terminals                              | Stations |
|--------|----------------------------------------|----------|
| Yellow | Samaypur Badli ↔ HUDA City Centre      | 37       |
| Blue   | Dwarka Sector 21 ↔ Vaishali / Noida   | 44       |
| Red    | Rithala ↔ Shaheed Sthal                | 26       |
| Violet | Kashmere Gate ↔ Raja Nahar Singh       | 31       |

### Key Interchange Stations

| Station              | Lines Connected     |
|----------------------|---------------------|
| Rajiv Chowk          | Yellow ↔ Blue       |
| Kashmere Gate        | Yellow ↔ Red ↔ Violet |
| Mandi House          | Blue ↔ Violet       |
| Central Secretariat  | Yellow ↔ Violet     |
| Yamuna Bank          | Blue (branch split) |

---

## Fare Structure

Based on Delhi Metro fare slabs (2024):

| Distance        | Fare  |
|-----------------|-------|
| Up to 2 km      | ₹10   |
| 3 – 5 km        | ₹20   |
| 6 – 12 km       | ₹30   |
| 13 – 21 km      | ₹40   |
| 22 – 32 km      | ₹50   |
| Above 32 km     | ₹60   |

---

## How It Works

### Graph Representation (`Graph.java`)

The metro network is modelled as an **undirected weighted graph**:
- Each station is a node stored in an `ArrayList`
- Edges are stored in a `HashMap<String, List<int[]>>` adjacency list
- Edge weight represents distance in kilometres between adjacent stations

### Shortest Path (`Dijkstra.java`)

Implements **Dijkstra's algorithm** using a min-heap (`PriorityQueue`):
1. Initialises all distances to `Integer.MAX_VALUE`, source to `0`
2. Greedily relaxes edges via the priority queue
3. Tracks the `prev[]` array to reconstruct the full path

Time complexity: **O((V + E) log V)**

### Fare Calculation (`FareCalculator.java`)

A simple slab-based lookup on the total route distance in km.

### Station Search (`Main.java`)

- First attempts an **exact** case-insensitive match
- Falls back to **partial substring** match
- If multiple stations match, presents a numbered list for the user to choose

---

## Class Diagram

```
Main
 ├── uses → Graph (via MetroMap.build())
 ├── uses → Dijkstra (compute + getPath)
 └── uses → FareCalculator

MetroMap
 └── builds → Graph
       └── contains → Station[]

Dijkstra
 └── reads → Graph
       └── reads → Station
```

---

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
