import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in );
		
		System.out.println("프로그램이 시작되었습니다.");
		System.out.println("계산기 프로그램입니다");
		System.out.println("원하는 연산을 입력해 주세요.");
		
		
	//2023.04.17 문제점 : 에러 안내고 돌아는 감. exit도 작동은 함. 문제는 사칙을 찾아가지 않음.	
		while(true){

			System.out.printf("연산내용 입력 )");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;     
			}

			int a = 0; //여기도 손봐야겠네. 
			int b = 0;
			 
			//split을 쓸때 "||S"를 써서 숫자공백연산자공백숫자로 입력할때 공백을 기준으로 나누게 해야할듯 -> 오늘의 목표.

			
			if(cmd.contains("+")) {
				System.out.println(a+b); 
			//	Sting plus = sc.nextInt(); // 저장을 굳이 안해도 되지 않나가 질문이셨어!
				
			} else if(cmd.contains("-")) {
				System.out.println(a-b);
			//	int miner = sc.nextInt();
				
			} else if(cmd.contains("*")) {
				System.out.println(a*b);
			//	int mul = sc.nextInt();
				
			} else if(cmd.contains("%")) {
				System.out.println(a%b);
			//	int divide = sc.nextInt();	
				
		}
		
			
		
		}
		sc.close(); // 이게 없으면 exit를 입력해도 프로그램이 종료되지 않음. 중요함.
	}
}
	//split 이용에 도움 받을 함수
//public class space {
//	 
//    // 공백 있는 문자열
//    private static String Space = "게임 하고싶다.";
//     
//    public static void main(String[] args) {
//         
//        System.out.println("\\\\s 로 분리");
//        ParsedSpace = Space.split("\\s");
//        printarr(ParsedSpace);
//    }
//}
 
/*  출력
" " 로 분리
1. 게임
2. 하고싶다.
 
"\\s" 로 분리
1. 게임
2. 하고싶다.
*/
	

	
	
	//내가 원하는 내 계산기의 기능
//	1. 사칙 연산 계산
//	2. 계산하려는 값만 나오면 좋겠음
//	=> 더하기를 했으면 더하기 값만 빼기를 하면 빼기 값만
//	3.입력 받는 방식이 단순하면 좋겠음
//	예 : 1 *3을 따로 안치고 통채로 치면 계산값이 출력되면 좋겠음
// 종료 누르기 전까지는 계산기 안죽었으면 함=> 무한반복 돌리면 되고.
	
		
