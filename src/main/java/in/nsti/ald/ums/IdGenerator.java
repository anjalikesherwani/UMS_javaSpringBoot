package in.nsti.ald.ums;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
	private static final String PREFIX = "UMS00";
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    public static String generateId() {
        int count = COUNTER.getAndIncrement();
        return PREFIX + String.format("%03d", count);
    }

}
