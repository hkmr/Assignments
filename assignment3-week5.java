class SemiPrimes {
    public static void main(String[] args) {

        System.out.println(isExpressedAsSemiPrime(27));

    }

    public static boolean isPrime(int n) {
        if (n == 4)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isSemiPrime(int n) {

        for (int i = 2; i < n / 2; i++) {
            int tmp = n / i;
            if (i * tmp == n && tmp != i && isPrime(i) && isPrime(tmp)) {
                System.out.println(tmp + " * " + i);
                return true;
            }
        }
        return false;
    }

    public static boolean isExpressedAsSemiPrime(int n) {

        for (int i = 2; i < n; i++) {
            int tmp = n - i;
            System.out.println(tmp + " + " + i);
            if (tmp + i == n && isSemiPrime(i) && isSemiPrime(tmp))
                return true;
        }

        return false;
    }
}
