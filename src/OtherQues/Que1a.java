package OtherQues;

import java.util.*;

class Que1a {
    int id;
    int time; // time to travel from the parent node to this node
    int cost; // cost associated with reaching this node
    // Constructor to initialize the node
    public Que1a(int id, int time, int cost) {
        this.id = id;
        this.time = time;
        this.cost = cost;
    }
}

// Class to find the cheapest route with a time constraint
class CheapestRouteWithTimeConstraint {
    // Method to find the cheapest route from source to destination with time constraint
    public static int findCheapestRoute(int[][] edges, int[] charges, int source, int destination, int timeConstraint) {
    // Lets create a graph represented as an adjacency list
        Map<Integer, List<Que1a>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int time = edge[2];  //time to travel from starting node to ending node
            int cost = charges[to]; // Cost of traveling to the ending node
            List<Que1a> list = graph.getOrDefault(from, new ArrayList<>()); // To get the adjacency list of the starting node
            list.add(new Que1a(to, time, cost)); // To add the ending node to the adjacency list
            graph.put(from, list); // Updating the graph with the new adjacency list
        }

        // Initialize the distances and visited flags
        int[] distances = new int[charges.length];  // Array to store the shortest distances from source to other nodes
        boolean[] visited = new boolean[charges.length];  // Array to keep track of visited nodes
        Arrays.fill(distances, Integer.MAX_VALUE);  // Initialize all distances to infinity
        distances[source] = 0;  // Set the distance of source node as 0

        // Use a priority queue to select the node with the smallest distance
        PriorityQueue<Que1a> queue = new PriorityQueue<>((a, b) -> a.time - b.time);
        queue.offer(new Que1a(source, 0, charges[source]));  // Add the source node to the priority queue

        // Dijkstra's algorithm with a time constraint
        while (!queue.isEmpty()) {
            Que1a curr = queue.poll();  // Get the node with the smallest distance
            if (curr.id == destination) {  // If destination node is reached, return the cost
                return curr.cost;
            }
            if (visited[curr.id]) {  // If the node is already visited, skip it
                continue;
            }
            visited[curr.id] = true;  // Mark the node as visited
            // Iterate through all the neighbors of the current node
            for (Que1a neighbor : graph.getOrDefault(curr.id, new ArrayList<>())) {
                int newTime = curr.time + neighbor.time;  // Calculate the new time to reach the neighbor node
                int newCost = curr.cost + charges[neighbor.id];  // Calculate the new cost to reach the neighbor node
                // If the new time is within the time constraint and the new cost is less than the previous cost to
                // reach the neighbor node, update the distance and add the neighbor node to the priority queue
                if (newTime <= timeConstraint && newCost < distances[neighbor.id]) {
                    distances[neighbor.id] = newCost;
                    queue.offer(new Que1a(neighbor.id, newTime, newCost));
                }
            }
        }         return -1; // No path found
    }     public static void main(String[] args) {
        int a [][]={{0,1,5}, {0,3,2}, {1,2,5}, {3,4,5}, {4,5,6}, {2,5,5}};
        System.out.println("The output is: "+findCheapestRoute(a, new int[]{10, 2, 3, 25, 25, 4},0,5,14));
    }
}
