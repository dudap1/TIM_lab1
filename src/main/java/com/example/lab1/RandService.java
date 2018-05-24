package com.example.lab1;

import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Random;

@Service
public class RandService {

    public ArrayList <Integer> arrayList;

    public RandService (ArrayList<Integer> arrayList){
        this.arrayList=arrayList;
    }

    public RandService() {

    }


    public ArrayList<Integer> randomList(int count){
        Random random = new Random();
        ArrayList<Integer> list= new ArrayList();
      //  int rand = random.nextInt(100-1)+1;
        for(int i = 0; i < count; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }



}
