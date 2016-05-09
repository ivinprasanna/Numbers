import java.util.*;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class Dijkstra_Algorithm {
		public static void main(String[] args) {
			SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> g = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
			g.addVertex("47");
			g.addVertex("28");
			g.addVertex("29");
			g.addVertex("26");
			g.addVertex("79");
			
			DefaultWeightedEdge e1 = new DefaultWeightedEdge();
			e1 = g.addEdge("26", "28");
			g.setEdgeWeight(e1, 1);
			DefaultWeightedEdge e2 = new DefaultWeightedEdge();
			e2 = g.addEdge("28", "29");
			g.setEdgeWeight(e2, 6);
			DefaultWeightedEdge e3 = new DefaultWeightedEdge();
			e3 = g.addEdge("29", "47");
			g.setEdgeWeight(e3, 5);
			DefaultWeightedEdge e4 = new DefaultWeightedEdge();
			e4 = g.addEdge("47", "79");
			g.setEdgeWeight(e4, 1);
			DefaultWeightedEdge e5 = new DefaultWeightedEdge();
			e5 = g.addEdge("79", "26");
			g.setEdgeWeight(e5, 2);
			DefaultWeightedEdge e6 = new DefaultWeightedEdge();
			e6 = g.addEdge("26", "29");
			g.setEdgeWeight(e6, 8);
			
			Scanner in = new Scanner(System.in);
			System.out.print("Find the Shortest path from: ");
			int from = in.nextInt();
			System.out.print("Find the Shortest path To: ");
			int to = in.nextInt();
			
			DefaultWeightedEdge[] arr = {e1,e2,e3,e4,e5,e6};
			if(!g.containsVertex(Integer.toString(from)) || !g.containsVertex(Integer.toString(to))) {
				System.out.println("Vertex not Found");
				return;
			}
			int[] nodes = {26, 28, 29, 47, 79};
			int fpos = 0, tpos = 0;
			for(int i=0; i<nodes.length; i++) {
				if(nodes[i] == from)
					fpos = i;
			}
			for(int i=0; i<nodes.length; i++) {
				if(nodes[i] == to)
					tpos = i;
			}
			
			int i=fpos, bound = fpos+1;
			double weight = 0;
			Set<DefaultWeightedEdge> set = null;
			while(i < tpos && bound <= tpos) {
				set = g.getAllEdges(Integer.toString(nodes[i]), Integer.toString(nodes[bound]));
				System.out.println(set);
				weight = weight + g.getEdgeWeight(arr[i]);
				i++; bound++;
			}
			System.out.println(weight);	
			in.close();
		}
		}
		 
