import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //1. 데이터 자유 입력
        Scanner in = new Scanner(System.in);
        System.out.println("start number input: ");
            int start = in.nextInt();
        System.out.println("end number input: ");
            int end = in.nextInt();
            int sum = 0;
        //2. 데이터 처리  //3. 데이터 결과 저장

        for(int i = start; i <= end; i++) {
           if(i % 2 == 0) {
               System.out.println("i= "+i);
               sum += i; //sum=sum+i;
           }
        }

        //4. 결과 출력
        System.out.println("결과값 =>"+ sum);

    }
}
