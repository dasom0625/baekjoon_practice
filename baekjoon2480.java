package dasom_202203;

import java.util.Random;

public class baekjoon2480 {

	public static void main(String[] args) {
		/*
		 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		 * 
		 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은
		 * 눈)×100원의 상금을 받게 된다. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 예를 들어,
		 * 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로
		 * 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이
		 * 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		 * 
		 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 */
		
		Random random = new Random();
		random.nextInt(7); //6까지의 변수
		int money=0;
		
		int Dice[] = new int[3]; //주사위 3개 배열에 담기
		for(int i = 0 ; i < Dice.length ; i++) {
			Dice[i] = random.nextInt(7);
		}

		int dice1 = Dice[0]; //각 주사위 값 배열에 저장
		int dice2 = Dice[1];
		int dice3 = Dice[2];
		
		System.out.println(dice1+"/"+dice2+"/"+dice3);

		//작은수가 앞에 올 수 있도록 정렬
		for (int i = 0; i < Dice.length - 1; i++) {
			int min = i;
			for (int j = 1; j < Dice.length; j++) {
				if (Dice[j] < Dice[min]) {
					min = j;
				}
			}
			int temp = Dice[i];
			Dice[i] = Dice[min];
			Dice[min] = temp;
		}

		
		// 모두다르면 가장 큰 주사위 *100원
		if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			money = dice3 * 100;
			System.out.println(dice1 + " / " + dice2 + " / " + dice3 + " / money : " + money);
		}
		// 모두 같으면, 10000 + 주사위 * 1000
		if (dice1 == dice2 && dice2 == dice3 && dice1 == dice3) {
			money = 10000 + (dice1 * 1000);
			System.out.println(dice1 + " / " + dice2 + " / " + dice3 + " / money : " + money);
		}
		// 같은 눈 두개 이면, 1000+같은눈 *100
		if (dice1 == dice2 || dice1 == dice3) {
			money = 1000 + dice1 * 100;
			System.out.println(dice1 + " / " + dice2 + " / " + dice3 + " / money : " + money);
		} else if (dice2 == dice3 || dice2 == dice1) {
			money = 1000 + dice2 * 100;
			System.out.println(dice1 + " / " + dice2 + " / " + dice3 + " / money : " + money);
		} else if (dice3 == dice1 || dice3 == dice1) {
			money = 1000 + dice3 * 100;
			System.out.println(dice1 + " / " + dice2 + " / " + dice3 + " / money : " + money);
		}
	}

}
