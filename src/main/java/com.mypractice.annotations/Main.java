package com.mypractice.annotations;

import com.mypractice.annotations.proccessor.UseCaseTracker;
import com.mypractice.annotations.util.PassUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.mypractice.annotations.proccessor.UseCaseTracker.trackUseCases;

public class Main {
    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47,48,49,50);
        UseCaseTracker.trackUseCases(useCases, PassUtils.class);
    }
}
