package data_structure.graph;

import java.util.HashSet;
import java.util.LinkedList;

class Node{
	
	int id;
	
	LinkedList<Node> adjacent = new LinkedList<>();
	
	
  Node(){}	
	
 public Node (int id) {
	 
	 this.id=id;
	 
 }
 
 private Node getNode(int id) {
	 
	 if(this.id==id) {
		 return this;
	 }else {
		 
		 for (Node node : adjacent) {
			
		return node.getNode(id);
			 
		}
		 
		return null; 
	 }
	 
	 
	 
	 
 }
 
 
 // creates or/and adds a child to the node 
 
 public boolean addEdge(int source ,int destination)  {
	 
	if(getNode(source)==null) {
		
		return false;
	}
	
	 
	
		 if(this.id==source) {
			 
			 if(getNode(destination)!=null) {
				 
				 adjacent.add(getNode(destination));
			 }else {
	 
		 Node adjacentNode=new Node(destination);
		 
		 adjacent.add(adjacentNode);
		 }
			 return true;
		 
		 }else {
			 
			 for (Node node : adjacent) {
				
				 node.addEdge(source, destination);
			}
			 
			 return true;
			 
		 }
		 
	 
	 
	 
 }
	
// invokes private hasPathDFS
 
public boolean hasPathDFS(int source,int destination) {
	
	Node s=getNode(source);
	Node d=getNode(destination);
	
	HashSet<Integer> visited = new HashSet<>();
	
	return hasPathDFS(s,d,visited);
	
	
	
}

// invokes private hasPathBFS

public boolean hasPathBFS(int source,int destination) {
	
	Node s=getNode(source);
	Node d =getNode(destination);
	
	if(s==null || d==null) {
		System.out.println("no destination or source");
		return false;
	}
	
	return hasPathBFS(s, d);
	
	
	
	
}




// performs Depth First Search

private boolean hasPathDFS(Node source,Node destination,HashSet<Integer> visited) {
	
	if(visited.contains(source.id)) {
		return false;
	}
	
	visited.add(source.id);
	
	if(source==destination) {
		return true;
	}
	
	for(Node node : source.adjacent) {
		
		if(hasPathDFS(node,destination,visited)) {
			return true;
		}
		
	}
	
	return false;
		
		
		
	
	
	
}
	


// performs Breadth First Search 

private boolean hasPathBFS(Node source,Node destination) {
	
	LinkedList<Node> nextToVisit=new LinkedList<>();
	HashSet<Integer>visited=new HashSet<>();
	nextToVisit.add(source);
	while(!nextToVisit.isEmpty()) {
		
		Node node=nextToVisit.remove();
		
		if(node==destination) {
			return true;
		}
		
		if(visited.contains(node.id)) {
			continue;
		}
		
		visited.add(node.id);
		
		for (Node child :node.adjacent) {
			
			nextToVisit.add(child);
			
		}
		
	}
	
	return false;
	
	
	
	
	
	
}
	
	
	
}








public class Graph {
	
	public static void main(String[] args) throws Exception {
		
		
		Node s =new Node(4);
		
		// creating graph data structure
		
		s.addEdge(4,45);
		s.addEdge(4,32);
		s.addEdge(45,5);
		s.addEdge(5,55);
		s.addEdge(55,56);
		s.addEdge(4,56);
		
		
		boolean DFS =s.hasPathDFS(4,5);
		System.out.println(DFS);
		
		boolean BFS =s.hasPathBFS(4,56);
		System.out.println(BFS);
		
		// trying to link a child to the null node    : output(false)
		
		System.out.println("was the addition successfull? - "+s.addEdge(17,56));
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

