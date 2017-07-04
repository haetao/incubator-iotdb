package cn.edu.thu.tsfiledb.sys.writelog.impl;

import java.io.*;

import cn.edu.thu.tsfiledb.sys.writelog.WriteLogPersistable;

/**
 * @author CGF
 */
public class LocalFileLogWriter implements WriteLogPersistable {

    private String logFile;
    private FileOutputStream os = null;

    public LocalFileLogWriter(String path) throws FileNotFoundException {
        logFile = path;
        File f = new File(path);
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        os = new FileOutputStream(path, true);
    }

    @Override
    public void write(byte[] operator) throws IOException {
        if (os == null) {
            os = new FileOutputStream(logFile);
        }
        os.write(operator);
        flush();
    }

    @Override
    public void close() {
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() throws IOException {
        os.flush();
    }

}