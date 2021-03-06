package com.wangzhen.utils.io;

import java.io.Closeable;
import java.io.IOException;

/**
 * IOUtils
 * Created by wangzhen on 2020/8/19.
 */
public class IOUtils {

    /**
     * close all streams
     *
     * @param closeables closeables
     */
    public static void close(Closeable... closeables) {
        if (closeables != null && closeables.length > 0) {
            for (Closeable closeable : closeables) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
