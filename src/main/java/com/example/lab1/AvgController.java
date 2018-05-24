package com.example.lab1;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@RestController
public class AvgController {
    @RequestMapping(value = "/Avg", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody



    public AvgService newAvg(@RequestParam(value="array", defaultValue = "0") ArrayList <Integer> array){
        AvgService avgService = new AvgService();
        return new AvgService (avgService.AvgResult(array));
    }


}
