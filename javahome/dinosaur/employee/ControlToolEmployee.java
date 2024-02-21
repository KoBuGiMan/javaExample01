package employee;

import java.util.Arrays;
import java.util.Scanner;

public class ControlToolEmployee {
	Scanner sc = new Scanner(System.in);
	Cleanner cleanner = new Cleanner();
	Gard gard = new Gard();
	OfficeJob officeJob = new OfficeJob();
	SafetyGard safetyGard = new SafetyGard();
	ZooKeeper zooKeeper = new ZooKeeper();

	private String[][] allEmployeeList;

	public ControlToolEmployee() {
		allEmployeeList = new String[0][];
	}

	public String[][] getAllEmployeeList() {
		return Arrays.copyOf(allEmployeeList, allEmployeeList.length);
	}

	public void setAllEmployeeList(String[][] allEmployeeList) {
		this.allEmployeeList = allEmployeeList;

	}

	void cleannerSet() {
		cleanner.setCleannerList(cleanner.setEmList(cleanner.getCleannerList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = cleanner.getCleannerList()[cleanner.getCleannerList().length - 1];
		setAllEmployeeList(newArr);

	}

	void cleannerGet() {
		System.out.println(Arrays.deepToString(cleanner.getCleannerList()));
	}

	void gardSet() {
		gard.setGardList(gard.setEmList(gard.getGardList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = gard.getGardList()[gard.getGardList().length - 1];
		setAllEmployeeList(newArr);
	}

	void gerdGet() {
		System.out.println(Arrays.deepToString(gard.getGardList()));
	}

	void officeSet() {
		officeJob.setOfficeJob(officeJob.setEmList(officeJob.getOfficeJob()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = officeJob.getOfficeJob()[officeJob.getOfficeJob().length - 1];
		setAllEmployeeList(newArr);
	}

	void officeGet() {
		System.out.println(Arrays.deepToString(officeJob.getOfficeJob()));
	}

	void safetySet() {
		safetyGard.setSafetyGardList(safetyGard.setEmList(safetyGard.getSafetyGardList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = safetyGard.getSafetyGardList()[safetyGard.getSafetyGardList().length - 1];
		setAllEmployeeList(newArr);
	}

	void safetyGet() {
		System.out.println(Arrays.deepToString(safetyGard.getSafetyGardList()));
	}

	void zooKeeperSet() {
		zooKeeper.setZooKeeperList(zooKeeper.setEmList(zooKeeper.getZooKeeperList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = zooKeeper.getZooKeeperList()[zooKeeper.getZooKeeperList().length - 1];
		setAllEmployeeList(newArr);
	}

	void zooKeeperGet() {
		System.out.println(Arrays.deepToString(zooKeeper.getZooKeeperList()));
	}

	public void ListArr(int i) {
		System.out.println("직업: " + getAllEmployeeList()[i][0]);
		System.out.println("이름: " + getAllEmployeeList()[i][1]);
		System.out.println("나이: " + getAllEmployeeList()[i][2]);
		System.out.println("번화번호: " + getAllEmployeeList()[i][3]);
		System.out.println("작업내용: " + getAllEmployeeList()[i][4]);
	}

	void findEmployee() {

		System.out.println("어떤 방식으로 직원 리스트를 출력하시겠습니까?");
		System.out.println("1. 직업별 리스트");
		System.out.println("2. 나이별 리스트");
		System.out.println("0. 나가기");

		if (sc.next().equals("1")) {
			System.out.println("<<<<<< 직업별 리스트 >>>>>>");
			try {
				for (int i = 0; i < getAllEmployeeList().length; i++) {
					if (getAllEmployeeList()[i][0].equals("공룡관리사") || getAllEmployeeList()[i][0].equals("공룡 관리사")) {
						int j = 1;
						System.out.println("공룡관리사 -----------------------------------");
						System.out.println();
						System.out.println("(" + j + "번)");
						ListArr(i);
						System.out.println("--------------------------------------------");
						j++;
						continue;
					} else if (getAllEmployeeList()[i][0].equals("청소부") || getAllEmployeeList()[i][0].equals("환경미화원")) {
						int j = 1;
						System.out.println("환경미화원 -----------------------------------");
						System.out.println();
						System.out.println("(" + j + "번)");
						ListArr(i);
						System.out.println("--------------------------------------------");
						j++;
						continue;
					} else if (getAllEmployeeList()[i][0].equals("경비원")) {
						int j = 1;
						System.out.println("경비원 --------------------------------------");
						System.out.println();
						System.out.println("(" + j + "번)");
						ListArr(i);
						System.out.println("--------------------------------------------");
						j++;
						continue;
					} else if (getAllEmployeeList()[i][0].equals("안전관리사")
							|| getAllEmployeeList()[i][0].equals("안전요원")) {
						int j = 1;
						System.out.println("안전관리사 -----------------------------------");
						System.out.println();
						System.out.println("(" + j + "번)");
						ListArr(i);
						System.out.println("--------------------------------------------");
						j++;
						continue;
					} else if (getAllEmployeeList()[i][0].equals("사무원") || getAllEmployeeList()[i][0].equals("사무직")) {
						int j = 1;
						System.out.println("사무직 --------------------------------------");
						System.out.println();
						System.out.println("(" + j + "번)");
						ListArr(i);
						System.out.println("--------------------------------------------");
						j++;
						continue;
					} else {
						System.out.println("현재 저희 공원에는 입력하신 직업에 해당하는 직원이 존재하지 않습니다.");
						return;
					}

				}
			} catch (Exception e) {
				System.out.println("error");
			}
		} else if (sc.next().equals("2")) {
			System.out.println("<<<<<< 나이별 리스트 >>>>>>");
			
			try {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				int a = Integer.parseInt(getAllEmployeeList()[i][2]);
				if (a >= 20 && a < 35) {
					int j = 1;
					System.out.println("청년층 ---------------------------------------");
					System.out.println();
					System.out.println("(" + j + "번)");
					ListArr(i);
					System.out.println("--------------------------------------------");
					j++;
					continue;
				} else if (a >= 35 && a < 55) {
					int j = 1;
					System.out.println("중년층 --------------------------------------");
					System.out.println();
					System.out.println("(" + j + "번)");
					ListArr(i);
					System.out.println("--------------------------------------------");
					j++;
					continue;
				} else if (a >= 55 && a < 65) {
					int j = 1;
					System.out.println("노년층 --------------------------------------");
					System.out.println();
					System.out.println("(" + j + "번)");
					ListArr(i);
					System.out.println("--------------------------------------------");
					j++;
					continue;
				} else {
					System.out.println("저희 공원은 20세부터 65세까지 제직 가능하여");
					System.out.println("입력하신 나이에 해당하는 직원이 없습니다.");
					return;
				}
			}
		} catch (Exception e) {
				System.out.println("error");
			}
		} else if (sc.next().equals("0")) {
			System.out.println("리스트를 종료합니다.");
			return;
		} else {
			System.out.println("현재 입력된 직원이 없습니다.");
			return;
		}

	}

}
