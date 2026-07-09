# Last updated: 7/9/2026, 10:14:47 AM
import heapq
from typing import List
class Solution:
    def minTimeMaxPower(self, n: int, edges: List[List[int]], power: int, cost: List[int], source: int, target: int) -> List[int]:
        adj =[[] for _ in range(n)]
        for u,v,t in edges: adj[u].append((v,t))
        pq,max_p=[(0,-power,source)],[-1]*n
        while pq:
            t,neg_p,u=heapq.heappop(pq)
            p=-neg_p
            if p <=max_p[u]:continue
            max_p[u]=p
            if u==target: return[t,p]
            if p>=cost[u]:
                for v, dt in adj[u]: 
                    heapq.heappush(pq, (t+dt,-(p-cost[u]),v))
        return [-1,-1]