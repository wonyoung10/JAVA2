package D0401;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("구구단을 가로로 출력하는 프로그램");
        for (int i = 0; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if(i==0) {
                    System.out.print("[  " + (i+j) +"단  ]\t");
                }
                else {
                    System.out.printf(j+" * "+i+" = " + i*j);
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

}
