package com.example.lab1;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service

public class AvgService {
private  Double avg_result,avg ;

    public AvgService(Double avg_result) {
        this.avg_result = avg_result;
    }

    public AvgService() {
    }

    public Double getAvg (){
        return  avg_result;
    }

    public Double AvgResult(ArrayList<Integer> arrayList) {
        Double sum = 0.0;
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            sum+=arrayList.get(i);
        }
        avg = sum / (arrayList.size());
        return avg;
    }
}
