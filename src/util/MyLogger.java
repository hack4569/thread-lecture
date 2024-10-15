package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Hong GilDong
 */
public abstract class MyLogger {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}