package com.example.itrips.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itrips.api.models.OperatorModel;
import com.example.itrips.api.repositories.OperatorRepository;

@Service
public class OperatorService {
    @Autowired
    OperatorRepository operatorRepository;

    /**
     * @return
     */
    public ArrayList<OperatorModel> getOperators() {
        return (ArrayList<OperatorModel>) operatorRepository.findAll();
    }

    /**
     * @param operator
     * @return
     */
    public OperatorModel saveOperator(OperatorModel operator) {
        return operatorRepository.save(operator);
    }

}
