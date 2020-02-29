package ru.mustaevtt.fix.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mustaevtt.fix.demo.service.HorseService;

@RestController
public class HorseController {
  @Autowired
    private HorseService horseService;

    @GetMapping("/horse/rest/count")
    public int count(@RequestParam("width") int width,
                     @RequestParam("height") int height,
                     @RequestParam("start") String start,
                     @RequestParam("end") String end) {
        return horseService.count(width,height,start,end);
    }


}
