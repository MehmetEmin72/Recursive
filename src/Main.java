public class Main {

    // Faktöriyel metodu: bir sayının faktöriyelini özyinelemeli olarak döndürür
    public static int OzyinemeliFactoriyel(int a) {
        if (a == 0 || a == 1) { // temel durum: eğer a 0 veya 1 ise
            return 1;
        } else {
            return a * OzyinemeliFactoriyel(a - 1); // özyinelemeli durum
        }
    }

    // Fibonacci metodu: n. Fibonacci sayısını özyinelemeli olarak döndürür
    public static int OzyinemeliFibonacci(int n) {
        if (n == 0) { // temel durum: eğer n 0 ise
            return 0;
        } else if (n == 1) { // temel durum: eğer n 1 ise
            return 1;
        } else {
            return OzyinemeliFibonacci(n - 1) + OzyinemeliFibonacci(n - 2); // özyinelemeli durum
        }
    }

    public static void main(String[] args) {
        // 5'in faktöriyelini yazdır
        System.out.println(OzyinemeliFactoriyel(5)); // Çıktı: 120

        // 8. Fibonacci sayısını yazdır
        System.out.println(OzyinemeliFibonacci(8)); // Çıktı: 21
    }
}

