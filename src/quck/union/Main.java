package quck.union;

import quick.find.QuickFindUF;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("UF.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        // System.out.println("n = " +n);
        int connections = 0;
        QuickUnionUF quickUnionUF = new QuickUnionUF(n);
        while (sc.hasNextLine()){
            int p = sc.nextInt();
            // System.out.println("p = " +p);
            int q = sc.nextInt();
            // System.out.println("q = " +q);

            if(!quickUnionUF.connected(p,q)){
                quickUnionUF.union(p,q);
                connections ++;
            }
        }
        System.out.println(" number of connections  =  " +connections); //must be 8
    }
}
