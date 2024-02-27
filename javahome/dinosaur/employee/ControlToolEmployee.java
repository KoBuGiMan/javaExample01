package employee;

import java.util.Arrays;
import java.util.Scanner;

public class ControlToolEmployee {
	Scanner sc = new Scanner(System.in);
	Cleanner cleanner = new Cleanner();
	GJob gard = new GJob();
	OfficeJob officeJob = new OfficeJob();
	SafetyGard safetyGard = new SafetyGard();
	ZooKeep2 zooKeeper = new ZooKeep2();
	Def2 def2 = new Def2();

	private String[][] allEmployeeList;

	public ControlToolEmployee() {
		allEmployeeList = new String[][] { { "사무원", "김옥자", "40", "010-8888-3333", "공룡 리스트 엑셀화작업" },
				{ "사무원", "김지혜", "30", "010-7777-4444", "직원 휴가조정" }, { "경비원", "김복남", "62", "010-2222-4444", "공원 정문담당" },
				{ "경비원", "이지훈", "20", "010-3333-4444", "공원 후문담당" },
				{ "환경미화원", "김미자", "40", "010-2222-3333", "3동 외곽청소" },
				{ "환경미화원", "최정남", "30", "010-3333-4444", "2동 정문청소" },
				{ "안전관리원", "박현대", "65", "010-9999-3333", "5동 안전점검" },
				{ "안전관리원", "최기아", "25", "010-5555-4444", "각 동의 안전등급 갱신" },
				{ "공룡관리원", "정오수", "47", "010-2222-9999", "2동 랩터 출산보조" },
				{ "공룡관리원", "유용재", "27", "010-5555-2222", "1동 공룡들 건강검진" } };
	}

	public String[][] getAllEmployeeList() {
		return Arrays.copyOf(allEmployeeList, allEmployeeList.length);
	}

	public void setAllEmployeeList(String[][] allEmployeeList) {
		this.allEmployeeList = allEmployeeList;

	}

	public void employeeRemove() {
		String[][] newArr = new String[getAllEmployeeList().length - 1][];
		String[][] newArrCleaner = new String[cleanner.getCleannerList().length - 1][];
		String[][] newArrGard = new String[gard.getGardList().length - 1][];
		String[][] newArrOffice = new String[officeJob.getOfficeJobList().length -1][];
		String[][] newArrSafety = new String[safetyGard.getSafetyGardList().length -1][];
		String[][] newArrZooKeeper = new String[zooKeeper.getZooKeeperList().length -1][];

		System.out.println("--------------------------------------------------------------------");
		System.out.println(Arrays.deepToString(getAllEmployeeList()));
		System.out.println();
		System.out.println("삭제할 직원의 직업을 입력해주세요:");
		String job = sc.next();
		System.out.println("삭제할 직원의 이름을 입력해주세요:");
		String name = sc.next();
		if (job.equals("환경미화원")) {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				if (name.equals(getAllEmployeeList()[i][1])) {
					System.arraycopy(getAllEmployeeList(), 0, newArr, 0, i);
					System.arraycopy(getAllEmployeeList(), i + 1, newArr, i, getAllEmployeeList().length - i - 1);
					setAllEmployeeList(newArr);
					
				}
			}
			for (int i = 0; i < cleanner.getCleannerList().length; i++) {
				if (name.equals(cleanner.getCleannerList()[i][1])) {
					System.arraycopy(cleanner.getCleannerList(), 0, newArrCleaner, 0, i);
					System.arraycopy(cleanner.getCleannerList(), i + 1, newArrCleaner, i,
							cleanner.getCleannerList().length - i - 1);
					cleanner.setCleannerList(newArrCleaner);
				}
			}
			System.out.println(Arrays.deepToString(getAllEmployeeList()));
		} else if (job.equals("경비원")) {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				if (name.equals(getAllEmployeeList()[i][1])) {
					System.arraycopy(getAllEmployeeList(), 0, newArr, 0, i);
					System.arraycopy(getAllEmployeeList(), i + 1, newArr, i, getAllEmployeeList().length - i - 1);
					setAllEmployeeList(newArr);
					
				}
			}
			for (int i = 0; i < gard.getGardList().length; i++) {
				if (name.equals(gard.getGardList()[i][1])) {
					System.arraycopy(gard.getGardList(), 0, newArrGard, 0, i);
					System.arraycopy(gard.getGardList(), i + 1, newArrGard, i, gard.getGardList().length - i - 1);
					gard.setGardList(newArrGard);

				}
			}
			System.out.println(Arrays.deepToString(getAllEmployeeList()));
		} else if (job.equals("사무원")) {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				if (name.equals(getAllEmployeeList()[i][1])) {
					System.arraycopy(getAllEmployeeList(), 0, newArr, 0, i);
					System.arraycopy(getAllEmployeeList(), i + 1, newArr, i, getAllEmployeeList().length - i - 1);
					setAllEmployeeList(newArr);
					
				} 
			}
			for (int i = 0; i < officeJob.getOfficeJobList().length; i++) {
				if (name.equals(officeJob.getOfficeJobList()[i][1])) {
					System.arraycopy(officeJob.getOfficeJobList(), 0, newArrOffice, 0, i);
					System.arraycopy(officeJob.getOfficeJobList(), i + 1, newArrOffice, i,
							officeJob.getOfficeJobList().length - i - 1);
					officeJob.setOfficeJobList(newArrOffice);
				}
			}
			System.out.println(Arrays.deepToString(getAllEmployeeList()));

		} else if (job.equals("안전관리원")) {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				if (name.equals(getAllEmployeeList()[i][1])) {
					System.arraycopy(getAllEmployeeList(), 0, newArr, 0, i);
					System.arraycopy(getAllEmployeeList(), i + 1, newArr, i, getAllEmployeeList().length - i - 1);
					setAllEmployeeList(newArr);
					
				} else {
					System.out.println("해당 이름의 직원은 저희 공원에 존재하지 않습니다.");
				}
			}
			for (int i = 0; i < safetyGard.getSafetyGardList().length; i++) {
				if (name.equals(safetyGard.getSafetyGardList()[i][1])) {
					System.arraycopy(safetyGard.getSafetyGardList(), 0, newArrSafety, 0, i);
					System.arraycopy(safetyGard.getSafetyGardList(), i + 1, newArrSafety, i,
							safetyGard.getSafetyGardList().length - i - 1);
					safetyGard.setSafetyGardList(newArrSafety);
				}
			}
			System.out.println(Arrays.deepToString(getAllEmployeeList()));
		} else if (job.equals("공룡관리원")) {
			for (int i = 0; i < getAllEmployeeList().length; i++) {
				if (name.equals(getAllEmployeeList()[i][1])) {
					System.arraycopy(getAllEmployeeList(), 0, newArr, 0, i);
					System.arraycopy(getAllEmployeeList(), i + 1, newArr, i, getAllEmployeeList().length - i - 1);
					setAllEmployeeList(newArr);
					
				} else {
					System.out.println("해당 이름의 직원은 저희 공원에 존재하지 않습니다.");
				}
			}
			for (int i = 0; i < zooKeeper.getZooKeeperList().length; i++) {
				if (name.equals(zooKeeper.getZooKeeperList()[i][1])) {
					System.arraycopy(zooKeeper.getZooKeeperList(), 0, newArrZooKeeper, 0, i);
					System.arraycopy(zooKeeper.getZooKeeperList(), i + 1, newArrZooKeeper, i,
							zooKeeper.getZooKeeperList().length - i - 1);
					zooKeeper.setZooKeeperList(newArrZooKeeper);
				}
			}
			System.out.println(Arrays.deepToString(getAllEmployeeList()));
		} else {
			System.out.println("현재 저희 공원에는 해당직업이 존재하지 않습니다.");
			
		}
		

	}

	public void cleannerSet() {
		String[] oneArr = def2.setAll();
		String[][] cList = def2.setEmList(cleanner.getCleannerList(), oneArr);
		String[] oneArr2 = new String[] { def2.getJob(), def2.getName(), def2.getAge(), def2.getPhone(),
				def2.getWork() };
		String[][] aList = def2.setEmList(getAllEmployeeList(), oneArr2);
		cleanner.setCleannerList(cList);
		setAllEmployeeList(aList);

	}

	public void cleannerGet() {
		System.out.println(Arrays.deepToString(cleanner.getCleannerList()));
	}

	public void gardSet() {
		String[] oneArr = def2.setAll();
		String[][] gList = def2.setEmList(gard.getGardList(), oneArr);
		String[] oneArr2 = new String[] { def2.getJob(), def2.getName(), def2.getAge(), def2.getPhone(),
				def2.getWork() };
		String[][] aList = def2.setEmList(getAllEmployeeList(), oneArr2);
		cleanner.setCleannerList(gList);
		setAllEmployeeList(aList);
	}

	public void gerdGet() {
		System.out.println(Arrays.deepToString(gard.getGardList()));
	}

	public void officeSet() {
		String[] oneArr = def2.setAll();
		String[][] oList = def2.setEmList(officeJob.getOfficeJobList(), oneArr);
		String[] oneArr2 = new String[] { def2.getJob(), def2.getName(), def2.getAge(), def2.getPhone(),
				def2.getWork() };
		String[][] aList = def2.setEmList(getAllEmployeeList(), oneArr2);
		officeJob.setOfficeJobList(oList);
		setAllEmployeeList(aList);
	}

	public void officeGet() {
		System.out.println(Arrays.deepToString(officeJob.getOfficeJobList()));
	}

	public void safetySet() {
		String[] oneArr = def2.setAll();
		String[][] sList = def2.setEmList(safetyGard.getSafetyGardList(), oneArr);
		String[] oneArr2 = new String[] { def2.getJob(), def2.getName(), def2.getAge(), def2.getPhone(),
				def2.getWork() };
		String[][] aList = def2.setEmList(getAllEmployeeList(), oneArr2);
		safetyGard.setSafetyGardList(sList);
		setAllEmployeeList(aList);
	}

	public void safetyGet() {
		System.out.println(Arrays.deepToString(safetyGard.getSafetyGardList()));
	}

	public void zooKeeperSet() {
		String[] oneArr = def2.setAll();
		String[][] zList = def2.setEmList(zooKeeper.getZooKeeperList(), oneArr);
		String[] oneArr2 = new String[] { def2.getJob(), def2.getName(), def2.getAge(), def2.getPhone(),
				def2.getWork() };
		String[][] aList = def2.setEmList(getAllEmployeeList(), oneArr2);
		zooKeeper.setZooKeeperList(zList);
		setAllEmployeeList(aList);
	}

	public void zooKeeperGet() {
		System.out.println(Arrays.deepToString(zooKeeper.getZooKeeperList()));
	}

	public void ListArr(int i) {
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
					&& Integer.parseInt(getAllEmployeeList()[i][2]) < 35) {
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
					&& Integer.parseInt(getAllEmployeeList()[i][2]) < 60) {
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

	public void allEmployeeListPrint() {
		int j = 1;
		System.out.println("<<<<<< 전체 리스트 >>>>>>");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < getAllEmployeeList().length; i++) {
			System.out.println();
			System.out.println("(" + j + "번)");
			ListArr(i);
			j++;
		}
		System.out.println("-----------------------------------------");

	}

	public void findEmployee() {

		System.out.println("어떤 방식으로 직원 리스트를 출력하시겠습니까?");
		System.out.println("1. 직업별 리스트");
		System.out.println("2. 나이별 리스트");
		System.out.println("3. 전체 리스트");
		System.out.println("0. 나가기");
		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("<<<<<< 직업별 리스트 >>>>>>");
			try {
				employeeJobList("환경미화원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 환경미화원이 존재하지  않습니다.");
			}
			try {
				employeeJobList("경비원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 경비원이 존재하지 않습니다.");
			}
			try {
				employeeJobList("안전관리원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 안전관리원이 존재하지 않습니다.");
			}
			try {
				employeeJobList("사무원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 사무원이 존재하지 않습니다.");
			}
			try {
				employeeJobList("공룡관리원");
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 공룡관리원이 존재하지 않습니다.");
			}

		} else if (a == 2) {
			System.out.println("<<<<<< 나이별 리스트 >>>>>>");

			try {
				employeeLowList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 청년층 직원이 존재하지 않습니다.");
			}

			try {
				employeeMiddleList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 중년층 직원이 존재하지 않습니다.");
			}

			try {
				employeeHighList();
			} catch (Exception e) {
				System.out.println("현재 저희 공원에는 노년층 직원이 존재하지 않습니다.");
			}
		} else if (a == 0) {
			System.out.println("리스트를 종료합니다.");
			return;
		} else if (a == 3) {
			try {
				allEmployeeListPrint();
			} catch (Exception e) {
				System.out.println("현재 저희 공워에는 직원이 존재하지 않습니다.");
			}
		} else {
			System.out.println("현재 입력된 직원이 없습니다.");
			return;
		}
	}

}
