package com.example.lab1;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Random;

@Service
public class RandService {

    public ArrayList randomList(ArrayList list){
        Random random = new Random();
        int rand = random.nextInt(100-1)+1;
        for(int i = 0; i < rand; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }



}
