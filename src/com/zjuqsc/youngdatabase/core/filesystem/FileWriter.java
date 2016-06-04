package com.zjuqsc.youngdatabase.core.filesystem;

import com.zjuqsc.youngdatabase.core.exceptions.YDFileNotFoundException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by lluvi on 2016/6/3.
 */

/**
 * Thread-safe
 */
public class FileWriter {

    ByteBuffer byteBuffer;

    public FileWriter() {
        this.byteBuffer = ByteBuffer.allocate(1024);
    }

    public void write(String fileName) throws YDFileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            FileChannel fileChannel = fileInputStream.getChannel();
            fileChannel.read(this.byteBuffer);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new YDFileNotFoundException(fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }

    }
}
