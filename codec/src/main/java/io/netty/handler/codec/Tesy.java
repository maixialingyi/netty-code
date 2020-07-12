package io.netty.handler.codec;

import java.util.LinkedList;

public class Tesy {

    public static void main(String[] args) {
        int n = 10;
        LinkedList linkedList = new LinkedList();
        for(int i=0;i<n;i++){
            linkedList.addLast(i);
        }

        int k = 2-1;
        int M = 3;
        int size = linkedList.size();
        for(;;){
            if((k+M-1)<=size){
                System.out.println(linkedList.get(k+M-1));
                linkedList.remove(k+M-1);
            }else {
                System.out.println(linkedList.get(k+M-1-size));
                linkedList.remove(k+M-1-size);
            }
            size=linkedList.size();
            if(size == 0){
                break;
            }
        }
    }
}
