class OTPGen
{
    //lvl 3
    static int generateOTP()
    {
        return (int) (Math.random() * 900000) + 100000;
    }
    public boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Not unique if any two are the same
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        OTPGen generator = new OTPGen();
        int[] otps = new int[10]; // Array to save OTP numbers generated 10 times [cite: 1]

        System.out.println("Generated 10 OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        if (generator.areOTPsUnique(otps)) {
            System.out.println("\nAll generated OTPs are unique.");
        } else {
            System.out.println("\nDuplicate OTPs found.");
        }
    }
}