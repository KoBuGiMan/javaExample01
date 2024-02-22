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

	public void cleannerSet() {
		cleanner.setCleannerList(cleanner.setEmList(cleanner.getCleannerList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = cleanner.getCleannerList()[cleanner.getCleannerList().length - 1];
		setAllEmployeeList(newArr);

	}

	public void cleannerGet() {
		System.out.println(Arrays.deepToString(cleanner.getCleannerList()));
	}

	public void gardSet() {
		gard.setGardList(gard.setEmList(gard.getGardList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = gard.getGardList()[gard.getGardList().length - 1];
		setAllEmployeeList(newArr);
	}

	public void gerdGet() {
		System.out.println(Arrays.deepToString(gard.getGardList()));
	}

	public void officeSet() {
		officeJob.setOfficeJob(officeJob.setEmList(officeJob.getOfficeJob()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = officeJob.getOfficeJob()[officeJob.getOfficeJob().length - 1];
		setAllEmployeeList(newArr);
	}

	public void officeGet() {
		System.out.println(Arrays.deepToString(officeJob.getOfficeJob()));
	}

	public void safetySet() {
		safetyGard.setSafetyGardList(safetyGard.setEmList(safetyGard.getSafetyGardList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = safetyGard.getSafetyGardList()[safetyGard.getSafetyGardList().length - 1];
		setAllEmployeeList(newArr);
	}

	public void safetyGet() {
		System.out.println(Arrays.deepToString(safetyGard.getSafetyGardList()));
	}

	public void zooKeeperSet() {
		zooKeeper.setZooKeeperList(zooKeeper.setEmList(zooKeeper.getZooKeeperList()));
		String[][] newArr = Arrays.copyOf(getAllEmployeeList(), getAllEmployeeList().length + 1);
		newArr[getAllEmployeeList().length] = zooKeeper.getZooKeeperList()[zooKeeper.getZooKeeperList().length - 1];
		setAllEmployeeList(newArr);
	}

	public void zooKeeperGet() {
		System.out.println(Arrays.deepToString(zooKeeper.getZooKeeperList()));
	}

	public public void ListArr(int i) {
		System.out.println("직업: " + getAllEmployeeList()[i][0]);
		System.out.println("이름: " + getAllEmployeeList()[i][1]);
		System.out.println("나이: " + getAllEmployeeList()[i][2]);
		System.out.println("번화번호: " + getAllEmployeeList()[i][3]);
		System.out.println("작업내용: " + getAllEmployeeList()[i][4]);
	}

	public void employeeJobList(String job) {
		System.out.println(job + " -----------------------------------");
		int j = 1;
		for (int i = 0; i < getAllEmployeeList().length; i++) {
			if (getAllEmployeeList()[i][0].equals(job)) {
				System.out.println();
				System.out.println("(" + j + "번)");
				ListArr(i);
				j++;
			}
		}
		System.out.println("-----------------------------------------");
	}

	public void employeeLowList() {
		int j = 1;
		System.out.println("청년층" + " -----------------------------------");
		for (int i = 0; i < getAllEmployeeList().length; i++) {
			if (Integer.parseInt(getAllEmployeeList()[i][2]) >= 20
					|| Integer.parseInt(getAllEmployeeList()[i][2]) < 35) {
				System.out.println();
				System.out.println("(" + j + "번)");
				ListArr(i);
				j++;
				continue;
			}
		}
		System.out.println("-----------------------------------------");
	}

	void employeeMiddleList() {
		int j = 1;
		System.out.println("중년층" + " -----------------------------------");
		for (int i = 0; i < getAllEmployeeList().length; i++) {
			if (Integer.parseInt(getAllEmployeeList()[i][2]) >= 35
					|| Integer.parseInt(getAllEmployeeList()[i][2]) < 60) {
				System.out.println();
				System.out.println("(" + j + "번)");
				ListArr(i);
				j++;
			}
		}
		System.out.println("-----------------------------------------");
	}

	public void employeeHighList() {
		int j = 1;
		System.out.println("노년층" + " -----------------------------------");
		for (int i = 0; i < getAllEmployeeList().length; i++) {
			if (Integer.parseInt(getAllEmployeeList()[i][2]) >= 60) {
				System.out.println();
				System.out.println("(" + j + "번)");
				ListArr(i);
				j++;
			}

		}
		System.out.println("-----------------------------------------");

	}

	void findEmployee() {

		System.out.println("어떤 방식으로 직원 리스트를 출력하시겠습니까?");
		System.out.println("1. 직업별 리스트");
		System.out.println("2. 나이별 리스트");
		System.out.println("0. 나가기");

		if (sc.next().equals("1")) {
			System.out.println("<<<<<< 직업별 리스트 >>>>>>");
			try {
				employeeJobList("환경미화원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 환경미화원이 존재하지않습니다.");
			}
			try {
				employeeJobList("경비원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 경비원이 존재하지않습니다.");
			}
			try {
				employeeJobList("안전관리원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 안전관리원이 존재하지않습니다.");
			}
			try {
				employeeJobList("사무원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 사무원이 존재하지않습니다.");
			}
			try {
				employeeJobList("공룡관리원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 공룡관리원이 존재하지않습니다.");
			}

		} else if (sc.next().equals("2")) {
			System.out.println("<<<<<< 나이별 리스트 >>>>>>");

			try {
				employeeLowList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 청년층 직원이 존재하지않습니다.");
			}

			try {
				employeeMiddleList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 중년층 직원이 존재하지않습니다.");
			}

			try {
				employeeHighList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 노년층 직원이 존재하지않습니다.");
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
