package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@Controller
public class RandController {
    @RequestMapping("/Random")
    @ResponseBody
   String newArray (){
        ArrayList arrayList = new ArrayList();
        generateRandom(arrayList);
       double avg = getAvg(arrayList);
        return "AVG: "+ avg + String.valueOf(arrayList) ;
    }

    void generateRandom(ArrayList arrayList) {
        RandService randService = new RandService();
        randService.randomList(arrayList);
    }

    double getAvg (ArrayList arrayList){
        AvgService avgService = new AvgService();
        return  avgService.AvgResult(arrayList);

    }


}