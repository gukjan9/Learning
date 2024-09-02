package com.prac.navermapdistance.controller;

import com.prac.navermapdistance.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @GetMapping("/searchPlace")
    @ResponseBody
    public ResponseEntity<String> searchPlace(@RequestParam("place") String place) {

        return distanceService.searchPlace(place);
    }
}
