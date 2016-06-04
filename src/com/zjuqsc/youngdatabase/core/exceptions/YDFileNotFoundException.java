package com.zjuqsc.youngdatabase.core.exceptions;

import java.io.FileNotFoundException;

/**
 * Created by lluvi on 2016/6/3.
 */
public class YDFileNotFoundException extends FileNotFoundException {
    private String fileName;
    public YDFileNotFoundException(String fileName) {
        super();
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
