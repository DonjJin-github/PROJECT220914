public class LogicalOperator {
    public static void main(String[] args) {
        // 비교 연산
        System.out.println('a' > 'b');      // false
        System.out.println(3 >= 2);         // true
        System.out.println(-1 < 0);         // true
        System.out.println(3.45 <= 2);      // false
        System.out.println(3 == 2);         // false
        System.out.println(3 != 2);         // true
        System.out.println(!(3 != 2));      // false

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4));     // true && false    = false
        System.out.println((3 != 2) || (-1 > 0));   // true ||          = true
        System.out.println((3 != 2) ^ (-1> 0));     // true ^ false     = true
    }
}