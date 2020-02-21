package quick.find;

import java.lang.reflect.Array;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        if(id[p] == id[q])
            return true;
        return false;
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for (int i = 0 ; i <id.length ; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }




}
