package quck.union;

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int n){
       id = new int[n];
        for (int i = 0 ; i < n ; i++){
            id[i] = i;
        }
    }

    public int root(int x){
        while (x != id[x]){
            x = id[x];
        }
        return x;
    }

    public boolean connected(int p, int q){
        if (root(p) == root(q))
            return true;
        return false;
    }

    public void union(int p, int q){
       int rootp = root(p);
       int rootq = root(q);
       id[rootp] = rootq;
    }
}
