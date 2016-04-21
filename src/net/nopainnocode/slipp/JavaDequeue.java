package net.nopainnocode.slipp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner in = null;
        try {
            in = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Deque deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            list.add(num);
        }

        int maxCount = 0;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> listTmp = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                if(i+j < list.size()) {
                    int value = list.get(i + j);
                    if (!listTmp.contains(value))
                        listTmp.add(value);
                }
            }
            if (listTmp.size() > maxCount)
                maxCount = listTmp.size();
        }

        System.out.println(maxCount);
    }
}
