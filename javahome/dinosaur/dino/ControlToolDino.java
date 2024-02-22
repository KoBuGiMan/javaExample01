package dino;

import java.util.Arrays;
import java.util.Scanner;

import employee.ControlToolEmployee;

public class ControlToolDino {
	EarthDino earth = new EarthDino();
	SeaDino sea = new SeaDino();
	SkyDino sky = new SkyDino();
	Def def = new Def();
	Scanner sc = new Scanner(System.in);
	ControlToolEmployee cm = new ControlToolEmployee();

	private String[][] allDinoList;

	public ControlToolDino() {
		allDinoList = new String[0][];
	}

	public String[][] getAllDinoList() {
		return Arrays.copyOf(allDinoList, allDinoList.length);
	}

	public void setAllDinoList(String[][] allDinoList) {
		this.allDinoList = allDinoList;
	}

	void earthSet() {
		earth.setEarthDinoList(earth.setDinoList(earth.getEarthDinoList()));
		String[][] newArr = Arrays.copyOf(earth.getEarthDinoList(), earth.getEarthDinoList().length);
		newArr[getAllDinoList().length] = earth.getEarthDinoList()[earth.getEarthDinoList().length - 1];
		setAllDinoList(newArr);
	}

	void earthGet() {
		System.out.println(Arrays.deepToString(earth.getEarthDinoList()));
	}

	void seaSet() {
		sea.setSeaDinoList(earth.setDinoList(sea.getSeaDinoList()));
		String[][] newArr = Arrays.copyOf(sea.getSeaDinoList(), sea.getSeaDinoList().length);
		newArr[getAllDinoList().length] = sea.getSeaDinoList()[sea.getSeaDinoList().length - 1];
		setAllDinoList(newArr);
	}

	void seaGet() {
		System.out.println(Arrays.deepToString(sea.getSeaDinoList()));
	}

	void skySet() {
		sky.setSkyDinoList(sky.setDinoList(sky.getSkyDinoList()));
		String[][] newArr = Arrays.copyOf(sky.getSkyDinoList(), sky.getSkyDinoList().length);
		newArr[getAllDinoList().length] = sky.getSkyDinoList()[sky.getSkyDinoList().length - 1];
		setAllDinoList(newArr);
	}

	void skyGet() {
		System.out.println(Arrays.deepToString(sky.getSkyDinoList()));
	}

	void autoList(int i) {
		System.out.println("종: " + getAllDinoList()[i][0]);
		System.out.println("이름: " + getAllDinoList()[i][1]);
		System.out.println("식성: " + getAllDinoList()[i][2]);
		System.out.println("크기: " + getAllDinoList()[i][3]);
	}

	void speDinoList(String spe) {
		System.out.println(spe + " -----------------------------------");
		int j = 1;
		for (int i = 0; i < getAllDinoList().length; i++) {
			if (getAllDinoList()[i][0].equals(spe)) {
				System.out.println();
				System.out.println("(" + j + "번)");
				autoList(i);
				j++;
			}
		}
		System.out.println("-----------------------------------------");
	}

	void eatDinoList(String eat) {
		System.out.println(eat + " -----------------------------------");
		int j = 1;
		for (int i = 0; i < getAllDinoList().length; i++) {
			if (getAllDinoList()[i][2].equals(eat)) {
				System.out.println();
				System.out.println("(" + j + "번)");
				autoList(i);
				j++;
			}
		}
		System.out.println("-----------------------------------------");
	}

	void sizeDinoList(String size) {
		System.out.println(size + " -----------------------------------");
		int j = 1;
		for (int i = 0; i < getAllDinoList().length; i++) {
			if (getAllDinoList()[i][3].equals(size)) {
				System.out.println();
				System.out.println("(" + j + "번)");
				autoList(i);
				j++;
			}
		}
		System.out.println("-----------------------------------------");
	}

	void findDino() {
		System.out.println("어떤 방식으로 공룡 리스트를 출력하시겠습니까? (0~3)");
		System.out.println("1. 공룡별 리스트");
		System.out.println("2. 식성별 리스트");
		System.out.println("3. 크기별 리스트");
		System.out.println("0. 나가기");
		if (sc.nextInt() == 1) {
			System.out.println("<<<<<< 공룡별 리스트 >>>>>>");

			try {
				speDinoList("티라노");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 티라노가 존재하지않습니다.");
			}

			try {
				speDinoList("랩터");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 랩터가 존재하지않습니다.");
			}

			try {
				speDinoList("트리케라톱스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 트리케라톱스가 존재하지않습니다.");
			}

		} else if (sc.nextInt() == 2) {
			System.out.println("<<<<<< 식성별 리스트 >>>>>>");

			try {
				eatDinoList("초식");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 초식공룡이 존재하지 않습니다.");
			}
			try {
				eatDinoList("육식");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 육식공룡이 존재하지 않습니다.");

			}
			try {
				eatDinoList("잡식");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 잡식공룡이 존재하지 않습니다.");

			}

		} else if (sc.nextInt() == 3) {
			System.out.println("<<<<<< 크기별 리스트 >>>>>>");

			try {
				sizeDinoList("소형");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 소형공룡이 존재하지 않습니다.");
			}
			try {
				sizeDinoList("중형");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 중형공룡이 존재하지 않습니다.");
			}
			try {
				sizeDinoList("대형");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 대형공룡이 존재하지 않습니다.");
			}
		} else if (sc.nextInt() == 0) {
			System.out.println("종료합니다.");
			return;
		} else {
			System.out.println("error");
			return;
		}

	}

	void dinpApp() {
		String ans = null;

		do {
			System.out.println("<<<<<< 메인메뉴 >>>>>>");
			System.out.println("1. 공룡추가");
			System.out.println("2. 공룡삭제");
			System.out.println("3. 직원추가");
			System.out.println("4. 직원삭제");
			System.out.println("5. 공룡리스트");
			System.out.println("6. 직원리스트");
			System.out.println("0. 종료");
			System.out.println("사용할 메뉴의 번호를 입력하세요:");
			System.out.println("-----------------------");
			if (sc.nextInt() == 1) {
				System.out.println("공룡의 주 활동지를 입력해주세요 ex)육지,바다,하늘");
				String dLive = sc.next();
				if (dLive.equals("육지")) {
					earthSet();
					earthGet();
				} else if (dLive.equals("바다")) {
					seaSet();
					seaGet();
				} else if (dLive.equals("하늘")) {
					skySet();
					skyGet();
				} else {

				}
			} else if (sc.nextInt() == 2) {
				System.out.println("미구현");
				return;
			} else if (sc.nextInt() == 3) {
				System.out.println("아래 부서 중 직원을 배정시킬 부서를 입력해주세요:");
				System.out.println("1. 공룡관리부");
				System.out.println("2. 경비부");
				System.out.println("3. 안전관리부");
				System.out.println("4. 쳥결유지부");
				System.out.println("5. 사무부");
				if (sc.nextInt() == 1) {
					cm.zooKeeperSet();
					cm.zooKeeperGet();
				} else if (sc.nextInt() == 2) {
					cm.gardSet();
					cm.gerdGet();
				} else if (sc.nextInt() == 3) {

				} else {

				}
			} else if (sc.nextInt() == 4) {

			} else if (sc.nextInt() == 5) {

			} else if (sc.nextInt() == 6) {

			} else if (sc.nextInt() == 7) {

			} else {

			}

		} while (ans.equals("네"));
	}
}