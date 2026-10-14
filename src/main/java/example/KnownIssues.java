package example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/** Intentional defects used to exercise Sonar rules in this test project. */
public final class KnownIssues {
    public int missingCustomerNameLength() {
        String customerName = null;
        return customerName.length();
    }

    public String normalizeCustomerName(String customerName) {
        customerName.trim();
        return customerName;
    }

    public String formatOrderIds(int[] orderIds) {
        return orderIds.toString();
    }

    public long totalUnits(int boxes, int unitsPerBox) {
        return boxes * unitsPerBox;
    }

    public byte[] weakFingerprint(String text) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5").digest(text.getBytes(StandardCharsets.UTF_8));
    }
}
