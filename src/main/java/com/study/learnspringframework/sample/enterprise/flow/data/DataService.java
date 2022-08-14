package com.study.learnspringframework.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Getting data
@Component
public
class DataService {

    public List<Integer> retrieveData() {
        return Arrays.asList(1, 2, 3, 4, 5, 6);
    }
}