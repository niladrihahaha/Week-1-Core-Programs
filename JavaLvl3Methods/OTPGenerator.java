import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    public static void main(String[] args) {
        String[] otps = new String[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (String otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean areUnique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + areUnique);
    }

    public static String generateOTP() {
        // Generate a 6-digit OTP using Math.random()
        return String.format("%06d", (int)(Math.random() * 1000000));
    }

    public static boolean areOTPsUnique(String[] otps) {
        Set<String> uniqueOTPs = new HashSet<>();
        for (String otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false;
            }
        }
        return true;
    }
}
