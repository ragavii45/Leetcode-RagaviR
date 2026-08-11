// Last updated: 11/08/2026, 14:14:24
class Solution {
        class pair{
            int node , cnt;
            long dist;
            pair(int node,int cnt,long dist){
                this.node=node;
                this.cnt=cnt;
                this.dist=dist;
            }
        }
        public int shortestPath(int n, int[][] edges, String labels, int k) {
            List<int[]>[] graph = new ArrayList[n];
            for(int i=0;i<n;i++)
                graph[i]=new ArrayList<>();
            for(int[] e:edges){
                graph[e[0]].add(new int[]{e[1],e[2]});
            }
            long inf = Long.MAX_VALUE;
            long[][] dist = new long[n][k+1];
            for(int i=0;i<n;i++){
                Arrays.fill(dist[i],inf);
            }
            PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->Long.compare(a.dist,b.dist));
            dist[0][1]=0;
            pq.offer(new pair(0,1,0));
            while(!pq.isEmpty()){
                pair cur = pq.poll();
                if(cur.dist>dist[cur.node][cur.cnt])
                    continue;
                if(cur.node==n-1)
                    return (int)cur.dist;
                for(int[] next:graph[cur.node]){
                    int v=next[0];
                    int w=next[1];
                    int nextCnt;
                    if(labels.charAt(v)==labels.charAt(cur.node)){
                        nextCnt = cur.cnt+1;
                    }else{
                        nextCnt=1;
                    }
                    if(nextCnt > k)
                        continue;
                    long newDist = cur.dist+w;
                    if(newDist<dist[v][nextCnt]){
                        dist[v][nextCnt]=newDist;
                    pq.offer(new pair(v,nextCnt,newDist));
                }
            }
            }
            return -1;
    }
}