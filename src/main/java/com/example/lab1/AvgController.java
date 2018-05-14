package com.example.lab1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@Controller
public class AvgController {
    @RequestMapping(value="/Avg", method=RequestMethod.GET)
    @ResponseBody

   public Double newAvg (@RequestParam(value="array", defaultValue = "0") ArrayList <Integer> array){
        AvgService avgService = new AvgService();
        return avgService.AvgResult(array);
    }


}
