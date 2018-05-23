package com.mypractice.annotations.util;

import com.mypractice.annotations.annotation.UseCase;

public class PassUtils {

    @UseCase(id = 47, description = "case num 47")
    public boolean validatePass(String pass) {


        return true;
    }


    @UseCase(id = 49)
    public String encryptPass1(String pass){
        return pass;
    }
    @UseCase(id = 50)
    public String encryptPass2(String pass){
        return pass;
    }

}
