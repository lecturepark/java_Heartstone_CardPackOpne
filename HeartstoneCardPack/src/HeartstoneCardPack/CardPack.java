package HeartstoneCardPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CardPack {
	public static void main(String[] args) {
		ArrayList<Cardvalue> cv = new ArrayList<>();
		Display d = new Display();
		Cardvalue cardvalue1 = new Cardvalue("👑전설👑", 0);
		Cardvalue cardvalue2 = new Cardvalue("✨특급1✨", 1);
		Cardvalue cardvalue3 = new Cardvalue("✨특급2✨", 2);
		Cardvalue cardvalue4 = new Cardvalue("희귀1", 3);
		Cardvalue cardvalue5 = new Cardvalue("희귀2", 4);
		Cardvalue cardvalue6 = new Cardvalue("희귀3", 5);
		Cardvalue cardvalue7 = new Cardvalue("희귀4", 6);
		Cardvalue cardvalue8 = new Cardvalue("희귀5", 7);
		Cardvalue cardvalue9 = new Cardvalue("희귀6", 8);
		Cardvalue cardvalue10 = new Cardvalue("일반1", 9);
		Cardvalue cardvalue11 = new Cardvalue("일반2", 10);
		Cardvalue cardvalue12 = new Cardvalue("일반3", 11);
		Cardvalue cardvalue13 = new Cardvalue("일반4", 12);
		Cardvalue cardvalue14 = new Cardvalue("일반5", 13);
		Cardvalue cardvalue15 = new Cardvalue("일반6", 14);
		Cardvalue cardvalue16 = new Cardvalue("일반7", 15);
		Cardvalue cardvalue17 = new Cardvalue("일반8", 16);
		Cardvalue cardvalue18 = new Cardvalue("일반9", 17);
		Cardvalue cardvalue19 = new Cardvalue("일반10", 18);
		Cardvalue cardvalue20 = new Cardvalue("일반11", 19);
		Cardvalue cardvalue21 = new Cardvalue("일반12", 20);
		Cardvalue cardvalue22 = new Cardvalue("일반13", 21);

		cv.add(cardvalue1);
		cv.add(cardvalue2);
		cv.add(cardvalue3);
		cv.add(cardvalue4);
		cv.add(cardvalue5);
		cv.add(cardvalue6);
		cv.add(cardvalue7);
		cv.add(cardvalue8);
		cv.add(cardvalue9);
		cv.add(cardvalue10);
		cv.add(cardvalue11);
		cv.add(cardvalue12);
		cv.add(cardvalue13);
		cv.add(cardvalue14);
		cv.add(cardvalue15);
		cv.add(cardvalue16);
		cv.add(cardvalue17);
		cv.add(cardvalue18);
		cv.add(cardvalue19);
		cv.add(cardvalue20);
		cv.add(cardvalue21);
		cv.add(cardvalue22);

		Scanner sc = new Scanner(System.in);

		System.out.println("카드 개봉을 시작합니다");
		System.out.println("1번을 입력해 카드를 개봉합니다, e.카드 개봉 종료");
		xxx: while (true) {
			String packopne = sc.next();
			switch (packopne) {
			case "1":
				Collections.shuffle(cv);
				for (int i = 0; i < 5; i++) {
					System.out.println(cv.get(i).cardvalue);
					if (cv.get(i).cardvalue.equals(cardvalue1.cardvalue)) {
						System.out.print("와우 전설카드");
						System.out.println("");
					}
					if (cv.get(i).cardvalue.equals(cardvalue2.cardvalue)) {
						System.out.print("오우 특급카드");
						System.out.println("");

					}
					if (cv.get(i).cardvalue.equals(cardvalue3.cardvalue)) {
						System.out.print("오우 특급카드");
						System.out.println("");

					}
				}
				break;
			case "e":
				System.out.println("*****하스스톤을 종료합니다******");

				break xxx;
			}
		}
	}
}
