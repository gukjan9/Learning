package com.prac.navermapdistance.controller;

import com.prac.navermapdistance.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping("/calcDistance")
    @ResponseBody
    public ResponseEntity<String> calcDistance(@RequestParam("departureMapx") String departureMapx,
                                               @RequestParam("departureMapy") String departureMapy,
                                               @RequestParam("arrivalMapx") String arrivalMapx,
                                               @RequestParam("arrivalMapy") String arrivalMapy) {

        System.out.println("Received departure coordinates: " + departureMapx + "," + departureMapy);
        System.out.println("Received arrival coordinates: " + arrivalMapx + "," + arrivalMapy);

        String departureCoordinates = String.valueOf(Float.parseFloat(departureMapx) - 8) + "," + String.valueOf(Float.parseFloat(departureMapy) + 1);
        String arrivalCoordinates = String.valueOf(Float.parseFloat(arrivalMapx) - 8) + "," + String.valueOf(Float.parseFloat(arrivalMapy) + 1);

        System.out.println("Fixed departure coordinates: " + departureCoordinates);
        System.out.println("Fixed arrival coordinates: " + arrivalCoordinates);

        return distanceService.calcDistance(departureCoordinates, arrivalCoordinates);
    }

    @GetMapping("/calcDistance1")
    public ResponseEntity<String> getFixedLocation() {
        // 좌표를 문자열 형식으로 반환
        String coordinates1 = "126.9783881,37.5666103"; // 서울 시청 근처 좌표
        String coordinates2 = "126.9770162,37.5662952";
        return distanceService.calcDistance(coordinates1, coordinates2);
    }
}
