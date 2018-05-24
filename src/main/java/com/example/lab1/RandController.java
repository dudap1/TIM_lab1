package com.example.lab1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class RandController {

    @RequestMapping(value = "/Random", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public RandService newArray(@RequestParam(value = "count", defaultValue = "0") int count) {
        ArrayList arrayList = new ArrayList();

        RandService randService = new RandService();
        System.out.print(count);
        return new RandService(randService.randomList(count));
    }


}