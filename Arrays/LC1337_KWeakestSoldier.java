package Arrays;

import java.util.PriorityQueue;

public class LC1337_KWeakestSoldier {
    static class Soldiers implements Comparable<Soldiers>{
        int idx;
        int soldierCount;

        public Soldiers(int idx,int soldierCount){
            this.idx = idx;
            this.soldierCount =soldierCount;
        }

        @Override
        public int compareTo(Soldiers s2){
            if(this.soldierCount == s2.soldierCount){
                return this.idx - s2.idx;
            }else{
                return this.soldierCount - s2.soldierCount; //ascending
            }
        }
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Soldiers> pq =new PriorityQueue<>();
        int soldierCount = 0;

        //counting soldiers
        for(int i=0;i<mat.length;i++){
            soldierCount = 0;
            for(int j=0;j<mat[0].length && mat[i][j]==1;j++){
                soldierCount++;
            }
            pq.add(new Soldiers(i, soldierCount));
        }

        int[] ans=new int[k];

        //adding in array
        for(int i=0;i<k;i++){
            ans[i] = pq.remove().idx;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = 
            {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k =3;
        System.out.println(kWeakestRows(mat, k));
    }
}
