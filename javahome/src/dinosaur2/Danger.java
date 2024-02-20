package dinosaur2;

import java.util.Scanner;

// 관리자
public class Danger {
	Scanner sc = new Scanner(System.in);
	private String onOff;
	private String password;
	private String name;

	// name과 password는 관리자권한이 필요한 메뉴에서 인증수단이므로 기억하해야한다.
	public Danger() {
		onOff = "off";
		name = "오너";
		password = "1234";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getOnOff() {
		return onOff;
	}

	// 비상버튼
	public void setOnOff() {
		System.out.println("해당 메뉴는 공원의 위험상황을 알리거나 비상알림을 취소하기 위해 존재하는 메뉴입니다.");
		// 관리자인증
		// 실제로 나중에 로그인시스템을 만들때도 조금 더 복잡하긴해도 해당코드와 비슷하다.
		System.out.println("본인인증을 위해 관리자 이름을 입력해주세요 tip) 초기 이름은 \"오너\"로 설정되어있다.");
		if (getName().equals(sc.next())) {
			System.out.println("본인인증을 위해 비밀번호를 입력해주세요 tip) 초기 비밀번호는 \"1234\"로 설정되어있다.");
			if (getPassword().equals(sc.next())) {
				// 한번 더 확인
				System.out.println("비상상황입니까? (네: 비상선언 / 아니요: 비상상황 취소)");
				if (sc.next().equals("네")) {
					// onOff를 on으로 바꾸고 비상상황 선언
					onOff = "on";
					System.out.println("<<<<<<<현재는 비상사태입니다.>>>>>>>");
					System.out.println("공원내에 모든 관람객을 대피시키십시오.");
					System.out.println("공원내부의 직원들을 진행중인 업무를 중단하고");
					System.out.println("관람객대피에 총력을 다해주시기 바랍니다");
					return;
				} else {
					onOff = "off";
					System.out.println("비상상황알림를 취소합니다.");
					return;
				}
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("관리자 이름이 일치하지 않습니다.");
			return;
		}

	}

	// 관리자 정보변경
	public void setOner() {
		System.out.println("관리자 정보를 바꾸시겠습니까? (네/아니요)");
		String ans = sc.next();
		if (ans.equals("네")) {
			System.out.println("현재 저장된 관리자의 이름을 입력하세요: tip) 초기 이름은 \"오너\"로 설정되어있다.");
			if (getName().equals(sc.next())) {
				System.out.println("현재 저장된 관리자의 비밀번호를 입력하세요: tip) 초기 비밀번호는 \"1234\"로 설정되어있다.");
				if (getPassword().equals(sc.next())) {
					System.out.println("인증이 완료하였습니다.");
					System.out.println();
					System.out.println("변경할 관리자의 이름을 입력하세요:");
					setName(sc.next());
					System.out.println("변경할 관리자의 비밀전호를 입력하세요:");
					setPassword(sc.next());
					System.out.println();
					System.out.println("<<<변경할 정보가 일치하는지 확인해주세요>>>");
					System.out.println();
					System.out.println("////////////////////////////////");
					System.out.println("관리자이름: " + getName());
					System.out.println("관리자 비밀번호: " + getPassword());
					System.out.println("////////////////////////////////");
					return;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			} else {
				System.out.println("이름이 일치하지 않습니다.");
				return;
			}
		} else {

			return;
		}
	}

	// 모든 정보 출력
	public void onerAll() {
		NewDino dino = new NewDino();
		Employee employee = new Employee();
		Ticket ticket = new Ticket();
		System.out.println();
		System.out.println("////////////////////////////////////////");
		System.out.println("!!현재 메뉴는 모든 정보를 조회하는 메뉴입니다.!!");
		System.out.println("보안에 유의해주세요.");
		System.out.println("////////////////////////////////////////");
		System.out.println();
		System.out.println("관리자의 이름을 입력해주세요:");
		if (getName().equals(sc.next())) {
			System.out.println("관리자의 비밀번호를 입력해주세요:");
			if (getPassword().equals(sc.next())) {
				// 입력정보가 일치하면 출력
				System.out.println("<<<<<< 통과 >>>>>>");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< 공룡 리스트 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				// 만약 배열안에 배열이 없으면 아래 출력문 출력
				if (dino.getDinoList().length == 0) {
					System.out.println("등록된 공룡이 없습니다.");
				} else {
					for (int i = 0; i < dino.getDinoList().length; i++) {
						System.out.println((i + 1) + "번 " + dino.getDinoList()[i]);
					}
				}
				System.out.println("//////////////////////////////////////");
				System.out.println();

				System.out.println("<<<<<<<<<<<<<< 직원 리스트 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				if (employee.getEmployeeList().length == 0) {
					System.out.println("등록된 직원이 없습니다.");
				} else {
					for (int i = 0; i < employee.getEmployeeList().length; i++) {
						System.out.println(employee.getEmployeeList()[i]);
					}
				}

				System.out.println("//////////////////////////////////////");
				System.out.println();

				System.out.println("<<<<<<<<<<<<<< 관람객 인원수 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				ticket.ticketNum();
				System.out.println("//////////////////////////////////////");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< VIP 조회 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				ticket.vipService();
				System.out.println("//////////////////////////////////////");
				System.out.println();
				System.out.println("<<<<<<<<<<<<<< 관리자 정보 >>>>>>>>>>>>>>");
				System.out.println("//////////////////////////////////////");
				System.out.println("관리자 이름: " + getName());
				System.out.println("관리자 비밀번호: " + getPassword());
				System.out.println("//////////////////////////////////////");

			}
		}

	}

}