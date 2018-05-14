package com.example.lab1;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service

public class AvgService {

    public double AvgResult(ArrayList<Integer> arrayList) {

        Double sum = 0.0, avg;

        for (int i = 0; i < arrayList.size(); i++) {
            sum+=arrayList.get(i);
        }

        avg = sum / (arrayList.size());
        return avg;
    }
}
