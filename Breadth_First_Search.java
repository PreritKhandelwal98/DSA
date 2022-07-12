package InJava.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {
    public ArrayList<Integer>bfsOfGraph(int V ,ArrayList<ArrayList<Integer>>odj){
        ArrayList<Integer>bfs  = new ArrayList<>();
        boolean vis[] = new boolean[V=1];

        for(int i=0;i<=V;i++){
            if(vis[i]==false){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i]=true;

                while(!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);

                    for(Integer it : odj.get(node)){
                        if(vis[it]==false)
                        vis[it]=true;
                        q.add(it);
                    }

                }
            }
        }
        return bfs;
    }

    public static void main(String args[]){
        
    }
}
