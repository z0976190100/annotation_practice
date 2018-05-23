package com.mypractice.annotations.proccessor;

import com.mypractice.annotations.annotation.UseCase;

import java.lang.reflect.Method;
import java.util.List;

public class UseCaseTracker {

    public static void trackUseCases(List<Integer> useCases, Class<?> clazz){
        for(Method method : clazz.getDeclaredMethods()){
            UseCase useCase = method.getAnnotation(UseCase.class);
            if(useCase != null){
                System.out.println("Found UseCase: " + useCase.id() + " " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }
        if(!useCases.isEmpty()) {
            System.err.println("WARN: missing cases:");
            for (int i : useCases) {
                System.err.println("#" + i);
            }
        }
    }

}
