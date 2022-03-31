package dasom_202203;

import e_oop.ScanUtil;

public class baekjoon2884 {

	public static void main(String[] args) {
//		첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
//		그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//		입력 시간은 24시간 표현을 사용한다. 
//		24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 
//		시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//    상근이가 설정한 알람보다 45분 먼저 알람이 울리면 되는 프로그램.
//		예제 : 상근이가 10, 10을 입력하면 창근이방법인 9, 25로 바뀌도록 설정	

	
		System.out.println("일어나고 싶은 시간을 입력하세요 >> ");
		int hour = ScanUtil.nextInt();
		int minute = ScanUtil.nextInt();
		int time = 0;
		int alarm = 0;
		
		if(hour >= 0 && hour < 24) {
			hour = hour*60;
			if(minute >= 0 && minute <60) {
				minute = minute;
				time = hour+minute;
				alarm = time - 45;
				//alarm이음수가 되면 24시간을 다시 추가해준다는 조건
				if(alarm<0) {
        			alarm+=   24*60;
       						 }
				int Hour = alarm / 60;
				int Minute = alarm % 60;
				System.out.println("기상 시간 >> "+Hour+" : "+Minute);
			}
		}

	}
}
