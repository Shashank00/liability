package com.axis.liability.controllers;

import com.axis.liability.models.LiabilityRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class LiabilityController {

    @RequestMapping(value="/liabilityPost", method = RequestMethod.POST)
    public Map<String,String> getLiabilityDbResponse(@RequestBody LiabilityRequest request) throws Exception {
        Map<String, String> response = new HashMap<>();

        if(checkFailure() || request == null) {
            throw new Exception();
        }
        else {
            response.put("result", "No Liabilities");
        }

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e) {

        }
        return response;
    }

    private Boolean checkFailure() {
        Random random = new Random();
        int value = random.nextInt(100);
        if(value%11 == 0) {
            return true;
        }
        return false;
    }
}
