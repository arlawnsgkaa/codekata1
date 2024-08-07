public class sum_of_divisors {
    public static int solution(int n) {
        int answer = 0;
        int i = 1;
        while (n >= i) {

            if (n % i == 0) {
                answer = answer + i;
            }
            i++;
        }
        return answer;
    }
}
