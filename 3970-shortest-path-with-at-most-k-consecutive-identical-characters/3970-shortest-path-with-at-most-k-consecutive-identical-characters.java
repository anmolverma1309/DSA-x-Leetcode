class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] adj = new ArrayList[n];

        for(int i = 0; i<n; i++) adj[i] = new ArrayList<>();

        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj[u].add(new int[]{v,wt});
        }

        int [][] res = new int[n][k+1];

        for(int i = 0; i<n; i++) Arrays.fill(res[i], Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0], b[0])
        );

        res[0][1] = 0;
        pq.offer(new int[]{0,0,1});

        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int d = curr[0];
            int node = curr[1];
            int count = curr[2];

            if(d>res[node][count]) continue;

            if(node == n-1) return d;

            for(int[] vec: adj[node]){
                int adjnode = vec[0];
                int wt = vec[1];

                int newcount = (labels.charAt(adjnode) == labels.charAt(node)) ? count+1:1;

                if(newcount > k) continue;

                int newdist = d+wt;

                if(newdist<res[adjnode][newcount]){
                    res[adjnode][newcount] = newdist;
                    pq.offer(new int[]{newdist,adjnode,newcount});
                }
            }
        }return -1;
    }
}