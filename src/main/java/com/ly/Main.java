package com.ly;

import com.ly.utils.FileHandler;
import lombok.extern.slf4j.Slf4j;
import java.io.File;

/**
 *
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        String classPath = System.getProperty("user.dir");
        log.info("当前目录:{}", classPath);
        ////classPath = "F:\\java_test\\git\\collateFile\\src\\main\\resources\\lyTest\\a";

        File directory = new File(classPath);
        FileHandler.addIgnoreDir(".git","src");
        FileHandler.handle(directory);
    }

}
