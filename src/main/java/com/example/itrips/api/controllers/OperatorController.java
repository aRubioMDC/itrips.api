package com.example.itrips.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itrips.api.models.OperatorModel;
import com.example.itrips.api.services.OperatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/operator")
@CrossOrigin("*")
public class OperatorController {
    @Autowired
    OperatorService operatorService;

    @GetMapping(path = "/getOperators")
    public ArrayList<OperatorModel> getOperators() {
        return operatorService.getOperators();
    }

    @PostMapping(value = "/saveOperator")
    public OperatorModel saveOperator(@RequestBody OperatorModel operator) {
        return this.operatorService.saveOperator(operator);
    }

}
