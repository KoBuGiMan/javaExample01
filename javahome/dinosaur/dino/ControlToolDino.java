package dino;

import java.util.Arrays;
import java.util.Scanner;

import employee.ControlToolEmployee;
import ticket.TicketController;

public class ControlToolDino {
	EarthDino earth = new EarthDino();
	SeaDino sea = new SeaDino();
	SkyDino sky = new SkyDino();
	Def def = new Def();
	Scanner sc = new Scanner(System.in);
	ControlToolEmployee cm = new ControlToolEmployee();
	TicketController tc = new TicketController();

	private String[][] allDinoList;

	public ControlToolDino() {
		allDinoList = new String[][] { { "프테라노돈", "펄럭이", "잡식", "중형" }, { "케찰코아틀루스", "짱짱이", "육식", "대형" },
				{ "스카포그나투스", "총총이", "초식", "소형" }, { "티라노사우루스", "쩝쩝이", "육식", "대형" }, { "랩터", "얍샵이", "잡식", "소형" },
				{ "트리케라톱스", "쿵쿵이", "초식", "중형" }, { "모사사우루스", "룡룡이", "육식", "대형" }, { "플레시오사우루스", "첨벙이", "초식", "중형" },
				{ "크로노사우루스", "축축이", "잡식", "소형" } };
	}

	public String[][] getAllDinoList() {
		return Arrays.copyOf(allDinoList, allDinoList.length);
	}

	public void setAllDinoList(String[][] allDinoList) {
		this.allDinoList = allDinoList;
	}

	public void earthSet() {
		String[] oneArr = def.setAll();
		String[][] eList = def.setDinoList(earth.getEarthDinoList(), oneArr);
		String[] oneArr2 = new String[] { def.getSpecies(), def.getName(), def.getEat(), def.getLength() };
		String[][] aList = def.setDinoList(getAllDinoList(), oneArr2);
		earth.setEarthDinoList(eList);
		setAllDinoList(aList);

	}

	public void earthGet() {
		System.out.println(Arrays.deepToString(earth.getEarthDinoList()));
	}

	public void dinoRemove() {
		String[][] newArr = new String[getAllDinoList().length - 1][];
		String[][] newArrEarth = new String[earth.getEarthDinoList().length - 1][];
		String[][] newArrSea = new String[sea.getSeaDinoList().length - 1][];
		String[][] newArrSky = new String[sky.getSkyDinoList().length - 1][];
		System.out.println("--------------------------------------------------------------------");
		System.out.println(Arrays.deepToString(getAllDinoList()));
		System.out.println();
		System.out.println("삭제할 공룡의 종을 입력하세요:");
		String ansSpe = sc.next();
		System.out.println("삭제할 공룡의 이름을 입력하세요:");
		String ansName = sc.next();
		if (ansSpe.equals("티라노사우루스") || ansSpe.equals("랩터") || ansSpe.equals("트리케라톱스")) {
			for (int i = 0; i < getAllDinoList().length; i++) {
				if (ansSpe.equals(getAllDinoList()[i][0])) {
					if (ansName.equals(getAllDinoList()[i][1])) {
						System.arraycopy(getAllDinoList(), 0, newArr, 0, i);
						System.arraycopy(getAllDinoList(), i + 1, newArr, i, getAllDinoList().length - i - 1);
						setAllDinoList(newArr);
					}

				}
			}
			for(int i=0;i<earth.getEarthDinoList().length;i++) {
				if(ansSpe.equals(earth.getEarthDinoList()[i][0])) {
					if(ansName.equals(earth.getEarthDinoList()[i][0])) {
						System.arraycopy(earth.getEarthDinoList(), 0, newArrEarth, 0, i);
						System.arraycopy(earth.getEarthDinoList(), i + 1, newArrEarth, i,
								earth.getEarthDinoList().length - i - 1);
						earth.setEarthDinoList(newArrEarth);
					}
				}
			}
		} else if (ansSpe.equals("모사사우루스") || ansSpe.equals("플레시오사우루스") || ansSpe.equals("크로노사우루스")) {
			for (int i = 0; i < getAllDinoList().length; i++) {
				if (ansSpe.equals(getAllDinoList()[i][0])) {
					if (ansName.equals(getAllDinoList()[i][1])) {
						System.arraycopy(getAllDinoList(), 0, newArr, 0, i);
						System.arraycopy(getAllDinoList(), i + 1, newArr, i, getAllDinoList().length - i - 1);
						setAllDinoList(newArr);
						
					}

				}
			}
			for(int i=0;i<sea.getSeaDinoList().length;i++) {
				if(ansSpe.equals(sea.getSeaDinoList()[i][0])) {
					if(ansName.equals(sea.getSeaDinoList()[i][0])) {
						System.arraycopy(sea.getSeaDinoList(), 0, newArrSea, 0, i);
						System.arraycopy(sea.getSeaDinoList(), i + 1, newArrSea, i,
								sea.getSeaDinoList().length - i - 1);
						sea.setSeaDinoList(newArrSea);
					}
				}
			}
		} else if (ansSpe.equals("케찰코아틀루스") || ansSpe.equals("프테라노돈") || ansSpe.equals("스카포그나투스")) {
			for (int i = 0; i < getAllDinoList().length; i++) {
				if (ansSpe.equals(getAllDinoList()[i][0])) {
					if (ansName.equals(getAllDinoList()[i][1])) {
						System.arraycopy(getAllDinoList(), 0, newArr, 0, i);
						System.arraycopy(getAllDinoList(), i + 1, newArr, i, getAllDinoList().length - i - 1);
						setAllDinoList(newArr);
					}else {
						System.out.println("해당 이름의 공룡은 저희 공원에 존재하지 않습니다.");
					}
				}

			}
			for(int i=0;i<sky.getSkyDinoList().length;i++) {
				if(ansSpe.equals(sky.getSkyDinoList()[i][0])) {
					if(ansName.equals(sky.getSkyDinoList()[i][0])) {
						System.arraycopy(sky.getSkyDinoList(), 0, newArrSky, 0, i);
						System.arraycopy(sky.getSkyDinoList(), i + 1, newArrSky, i,
								sky.getSkyDinoList().length - i - 1);
						sky.setSkyDinoList(newArrSky);
					}
				}
			}
		}else {
			System.out.println("해당 종의 공룡은 저희 공원에 존재하지 않습니다.");
			
		}
		System.out.println(Arrays.deepToString(getAllDinoList()));
		System.out.println("--------------------------------------------------------------------");
		return;
	}

	public void seaSet() {
		String[] oneArr = def.setAll();
		String[][] sList = def.setDinoList(sea.getSeaDinoList(), oneArr);
		String[] oneArr2 = new String[] { def.getSpecies(), def.getName(), def.getEat(), def.getLength() };
		String[][] aList = def.setDinoList(getAllDinoList(), oneArr2);
		sea.setSeaDinoList(sList);
		setAllDinoList(aList);

	}

	public void seaGet() {
		System.out.println(Arrays.deepToString(sea.getSeaDinoList()));
	}

	public void skySet() {
		String[] oneArr = def.setAll();
		String[][] skList = def.setDinoList(sky.getSkyDinoList(), oneArr);
		String[] oneArr2 = new String[] { def.getSpecies(), def.getName(), def.getEat(), def.getLength() };
		String[][] aList = def.setDinoList(getAllDinoList(), oneArr2);
		sky.setSkyDinoList(skList);
		setAllDinoList(aList);

	}

	public void skyGet() {
		System.out.println(Arrays.deepToString(sky.getSkyDinoList()));
	}

	public void autoList(int i) {
		System.out.println("종: " + getAllDinoList()[i][0]);
		System.out.println("이름: " + getAllDinoList()[i][1]);
		System.out.println("식성: " + getAllDinoList()[i][2]);
		System.out.println("크기: " + getAllDinoList()[i][3]);
	}

	public void speDinoList(String spe) {
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

	public void eatDinoList(String eat) {
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

	public void sizeDinoList(String size) {
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

	public void allDinoListPrint() {
		System.out.println("<<<<<< 전체 리스트 >>>>>>");
		System.out.println("-----------------------------------------");
		int j = 1;
		for (int i = 0; i < getAllDinoList().length; i++) {
			System.out.println();
			System.out.println("(" + j + "번)");
			autoList(i);
			j++;
		}
		System.out.println("-----------------------------------------");

	}

	public void findDino() {
		System.out.println("어떤 방식으로 공룡 리스트를 출력하시겠습니까? (0~3)");
		System.out.println("1. 공룡별 리스트");
		System.out.println("2. 식성별 리스트");
		System.out.println("3. 크기별 리스트");
		System.out.println("4. 전체 리스트");
		System.out.println("0. 나가기");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("<<<<<< 공룡별 리스트 >>>>>>");

			try {
				speDinoList("티라노사우루스");
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

			try {
				speDinoList("모사사우루스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 모사사우루스가 존재하지않습니다.");
			}

			try {
				speDinoList("플레시오사우루스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 플레시오사우루스가 존재하지않습니다.");
			}

			try {
				speDinoList("크로노사우루스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 크로노사우루스가 존재하지않습니다.");
			}

			try {
				speDinoList("프테라노돈");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 프테라노돈가 존재하지않습니다.");
			}

			try {
				speDinoList("케찰코아틀루스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 케찰코아틀루스가 존재하지않습니다.");
			}

			try {
				speDinoList("스카포그나투스");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 스카포그나투스가 존재하지않습니다.");
			}

		} else if (a == 2) {
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

		} else if (a == 3) {
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
		} else if (a == 0) {
			System.out.println("종료합니다.");
			return;
		} else if (a == 4) {
			try {
				allDinoListPrint();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 공룡이 존재하지 않습니다.");
			}
		} else {
			System.out.println("error");
			return;
		}

	}

	public void dinpApp() {
		String ans = null;

		do {
			System.out.println("<<<<<< 메인메뉴 >>>>>>");
			System.out.println("1. 공룡추가");
			System.out.println("2. 공룡삭제");
			System.out.println("3. 직원추가");
			System.out.println("4. 직원삭제");
			System.out.println("5. 공룡리스트");
			System.out.println("6. 직원리스트");
			System.out.println("7. 티켓구매");
			System.out.println("8. 티켓취소");
			System.out.println("0. 종료");
			System.out.println("사용할 메뉴의 번호를 입력하세요:");
			System.out.println("-----------------------");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("공룡의 주 활동지를 입력해주세요 ex)육지,바다,하늘");
				String dLive = sc.next();
				if (dLive.equals("육지")) {
					System.out.println("육지공룡 리스트: 티라노사우루스,랩터,트리케라톱스");
					earthSet();
					earthGet();
				} else if (dLive.equals("바다")) {
					System.out.println("바다공룡 리스트: 모사사우루스,플레시오사우루스,크로노사우루스");
					seaSet();
					seaGet();
				} else if (dLive.equals("하늘")) {
					System.out.println("익룡 리스트: 프테라노돈,케찰코아틀루스,스카포그나투스");
					skySet();
					skyGet();
				} else {

				}

			} else if (a == 2) {
				dinoRemove();
				return;
			} else if (a == 3) {
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
					cm.safetySet();
					cm.safetyGet();
				} else if (sc.nextInt() == 4) {
					cm.cleannerSet();
					cm.cleannerGet();
				} else if (sc.nextInt() == 5) {
					cm.officeSet();
					cm.officeGet();
				}

			} else if (a == 4) {
				cm.employeeRemove();
			} else if (a == 5) {
				findDino();
			} else if (a == 6) {
				cm.findEmployee();
			} else if(a == 7){
				tc.addTicket();
			} else if(a == 8){
				tc.removeTicket();
			} else {
				System.out.println("시스템을 종료합니다.");
				ans = "아니요";
				return;
			}
			System.out.println("재시작하시겠습니까? (네/아니요)");
			ans = sc.next();
		} while (ans.equals("네"));
	}
}