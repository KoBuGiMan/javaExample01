package dinosaur2;

import java.util.Arrays;
import java.util.Scanner;

// 직원
public class Employee {
	Danger danger = new Danger();
	// 방식자체는 공룡때와 별반 다르지 않다.
	Scanner sc = new Scanner(System.in);
	private String[][] employeeList;
	private String eName;
	private String age;
	private String job;
	private String work;

	public Employee() {
		employeeList = new String[0][];
	}

	public String[][] getEmployeeList() {
		String[][] newArr = new String[employeeList.length][];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = employeeList[i];
		}
		return newArr;
	}

	// 직원추가
	// 원래 필자스타일은 오전 오후 야간파트로 나누고 각각 배열을 만들어 파트마다 업무를 부여하는걸 선호하지만
	// 이번엔 힘드므로 패스한다.
	public void setEmployeeList() {
		String ansRe = "미정";
		if (danger.getOnOff().equals("off")) {
			do {
				System.out.println("직원의 이름을 입력해주세요:");
				seteName(sc.next());
				System.out.println("직원의 나이를 입력해주세요: ex) 20,30...");
				setAge(sc.next());
				System.out.println("직원의 직업을 입력해주세요: ex) 청소부, 공룡관리사...");
				setJob(sc.next());
				// 문장을 입력할땐 nextLine을 사용해야 한다 next는 띄어쓰기가 나오면 그 위에부분은
				// 인식을 못한다. 그러니 문장을 쓸때는 nextLine을 사용해야한다.
				// 만약 setWork(sc.nextLine()); 이것만 단독으로 쓰고 위에 sc.nextLine(); 이걸 입력안하면
				// 밑에있는 다른 print문까지 출력되는 오류가 있다 잊지말고 위에 sc.nextLine();을 써줘야한다.
				sc.nextLine();
				System.out.println("직원의 작업내용을 입력해주세요: ex) 1동 외곽 청소...");
				setWork(sc.nextLine());

				System.out.println();
				System.out.println("/////////");
				// get들을 배열로 묶기
				String[] newArr = new String[] { geteName(), getAge(), getJob(), getWork() };
				// 원본보다 1개많은 배열을 복사한다.
				employeeList = Arrays.copyOf(employeeList, employeeList.length + 1);
				// get을 묶은갓을 최후방 빈공간에 집어넣는다.
				employeeList[employeeList.length - 1] = newArr;
				// deepToStreing
				System.out.println(Arrays.deepToString(getEmployeeList()));
				System.out.println("직원을 추가로 저장하시겠습니까? (네/아니요)");
				ansRe = sc.next();
			} while (ansRe.equals("네"));
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// 직원삭제
	// 공룡삭제와 동일
	public void removeEmployee() {
		if (danger.getOnOff().equals("off")) {
			if (getEmployeeList().length == 0) {
				System.out.println("직원의 이름을 입력해주세요:");
				seteName(sc.next());
				System.out.println("직원의 직업을 입력해주세요: ex) 청소부, 공룡관리사...");
				setJob(sc.next());
				employeeList = Arrays.copyOf(employeeList, employeeList.length);
				String[][] newArr = new String[employeeList.length - 1][];
				for (int i = 0; i < employeeList.length; i++) {
					if (employeeList[i][0].equals(geteName())) {
						if (employeeList[i][2].equals(getJob())) {
							System.arraycopy(employeeList, 0, newArr, 0, i);
							System.arraycopy(employeeList, i + 1, newArr, i, employeeList.length - i - 1);
							employeeList = newArr;
						} else {
							continue;
						}
					}
				}
				System.out.println(Arrays.deepToString(employeeList));
			}
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}