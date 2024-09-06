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

    @GetMapping("/calcDistanceTest")
    public ResponseEntity<String> getFixedLocation() {
        // 좌표를 문자열 형식으로 반환
        String coordinates1 = "126.9783881,37.5666103"; // 서울 시청 근처 좌표
        String coordinates2 = "126.9770162,37.5662952";
        return distanceService.calcDistance(coordinates1, coordinates2);
    }
}

// NCP Direction 15 docs
// https://api.ncloud-docs.com/docs/ai-naver-mapsdirections15-driving#RequestPositionFormat
// https://api.ncloud-docs.com/docs/ai-naver-mapsdirections15

// 장소 검색 참고
// https://velog.io/@cyseok123/Spring-%EB%84%A4%EC%9D%B4%EB%B2%84-%EC%A7%80%EC%97%AD-%EA%B2%80%EC%83%89-API-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0
