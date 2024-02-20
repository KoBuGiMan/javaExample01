package dinosaur2;

import java.time.LocalDate;
import java.util.Scanner;

//티켓 및 인원수
public class Ticket {
	Danger danger = new Danger();
	// private로 원본값 보호
	Scanner sc = new Scanner(System.in);
	private LocalDate date = LocalDate.now();
	private int year;
	private int month;
	private int day;
	private int ticketNum;
	private String name;
	private int vipNum;

	// 값을 저장하는 공간
	public Ticket() {
		vipNum = 0;
		ticketNum = 0;
		year = date.getYear();
		month = date.getMonthValue();
		day = date.getDayOfMonth();
	}

	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 티켓발권
	public void ticketAll() {
		String ans = null;
		if (danger.getOnOff().equals("off")) {
			do {
				// 현재 이 코드는 공원인원이 30000명 이하일때만 작동하게 되어있다.
				if (ticketNum < 30000) {
					System.out.println("개표자의 성함을 입력해주세요:");
					setName(sc.next());
					System.out.println("-----------------------------------");
					System.out.println("<각 연령별 인원을 입력해주세요>");
					System.out.println("0세~7세  : 3000원");
					System.out.println("8세~19세 : 5000원");
					System.out.println("20세~60세: 7000원");
					System.out.println("60세~    : 4000원");
					System.out.println("-----------------------------------");
					// 각 연령별 인원수를 구해 총액을 계산한다.
					System.out.println("0세~7세  :");
					int baby = sc.nextInt();
					System.out.println("8세~19세 :");
					int child = sc.nextInt();
					System.out.println("20세~60세:");
					int adult = sc.nextInt();
					System.out.println("60세~    :");
					int old = sc.nextInt();

					System.out.println();
					System.out.println("0세~7세: " + baby + "명");
					System.out.println("8세~19세: " + child + "명");
					System.out.println("20세~60세: " + adult + "명");
					System.out.println("60세~: " + old + "명");
					// 총액계산
					System.out.println("총액: " + (baby * 3000 + child * 5000 + adult * 7000 + old * 4000) + "원");
					// 입력값확인
					System.out.println("입력된 인원이 정확한지 확인해주세요");
					System.out.println("(네/아니요)");
					ans = sc.next();
					// 맞으면 아래의 형식으로 티켓이 출력된다.
					if (ans.equals("네")) {
						System.out.println("//////////////////////////////");
						System.out.println("개표자: " + getName());
						System.out.println("날짜: " + year + "년" + month + "월" + day + "일");
						System.out.println("<입장인원>");
						System.out.println("0세~7세: " + baby + "명");
						System.out.println("8세~19세: " + child + "명");
						System.out.println("20세~60세: " + adult + "명");
						System.out.println("60세~: " + old + "명");
						System.out.println("총액: " + (baby * 3000 + child * 5000 + adult * 7000 + old * 4000) + "원");
						System.out.println("//////////////////////////////");
						// 티켓이 한장 팔릴때마다 ticketNum을 ++ 시켜 인원수를 갱신한다.
						// 반대로 나가는 인원을 계산하는 로직을 만들고싶으면 --를 해주면 된다.
						// 필자는 귀찮아서 패스한다.
						ticketNum++;
						return;
					}
					// 30000명 이상일때 예외처리
				} else {
					System.out.println("현재 인원이 초과되어 더이상 입장이 불가합니다.");
					return;
				}
			} while (ans.equals("아니요"));
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// 인원수 조회
	public void ticketNum() {
		if (danger.getOnOff().equals("off")) {
			// 인원이 30000명 미만일때
			if (ticketNum < 30000) {
				System.out.println("현재인원: " + ticketNum + "명");
				System.out.println("입장가능인원: " + (30000 - ticketNum) + "명");
				// 30000명 이상일때
			} else if (ticketNum >= 30000) {
				System.out.println("현재인원: " + ticketNum + "명");
				System.out.println("현재 입장이 불가합니다.");
			}
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// VIP입장권 구매
	public void vip() {
		String ans = null;
		if (danger.getOnOff().equals("off")) {
			do {
				if (ticketNum < 30000) {
					// VIP티켓은 추가요금을 받기때문에 잘못들어온 사람을 걸러야한다. 제대로 들어온건지 확인한다.
					System.out.println("현재 메뉴는 VIP입장권 구매메뉴 입니다.");
					System.out.println("구매를 진행하시겠습니까? (네/아니요)");
					String vipAns = sc.next();
					// 방식은 일반티켓과 동일
					if (vipAns.equals("네")) {
						System.out.println("개표자의 성함을 입력해주세요:");
						setName(sc.next());
						System.out.println("-----------------------------------");
						System.out.println("<각 연령별 인원을 입력해주세요>");
						System.out.println("0세~7세  : 7000원");
						System.out.println("8세~19세 : 10000원");
						System.out.println("20세~60세: 15000원");
						System.out.println("60세~    : 8000원");
						System.out.println("-----------------------------------");
						System.out.println("0세~7세  :");
						int baby = sc.nextInt();
						System.out.println("8세~19세 :");
						int child = sc.nextInt();
						System.out.println("20세~60세:");
						int adult = sc.nextInt();
						System.out.println("60세~    :");
						int old = sc.nextInt();
						System.out.println();
						System.out.println("0세~7세: " + baby + "명");
						System.out.println("8세~19세: " + child + "명");
						System.out.println("20세~60세: " + adult + "명");
						System.out.println("60세~: " + old + "명");
						System.out.println("총액: " + (baby * 7000 + child * 10000 + adult * 15000 + old * 8000) + "원");
						System.out.println("입력된 인원이 정확한지 확인해주세요");
						System.out.println("(네/아니요)");
						ans = sc.next();
						if (ans.equals("네")) {
							System.out.println("//////////////////////////////");
							System.out.println("개표자: " + getName());
							System.out.println("날짜: " + year + "년" + month + "월" + day + "일");
							System.out.println("<입장인원>");
							System.out.println("0세~7세: " + baby + "명");
							System.out.println("8세~19세: " + child + "명");
							System.out.println("20세~60세: " + adult + "명");
							System.out.println("60세~: " + old + "명");
							System.out
									.println("총액: " + (baby * 7000 + child * 10000 + adult * 15000 + old * 8000) + "원");
							System.out.println("//////////////////////////////");
							// VIP는 특별하기 때문에 숫자를 따로 관리한다.
							vipNum++;
							ticketNum++;
							return;
						}
					} else {
						System.out.println("현재 인원이 초과되어 더이상 입장이 불가합니다.");
						return;
					}
				}
			} while (ans.equals("아니요"));
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// VIP서비스
	// 서비스로 뭘할까 하다가 공룡들이 있는 공원인만큼 안전에 유의해야하기 때문에
	// 여차할때 우성적으로 구조할수있게 위치가 나타나도록 만들었다.
	// 취지는 좋지만 필자가 해당 서비스를 받으면 스토킹당하는 기분일듯하다.
	public void vipService() {
		if (danger.getOnOff().equals("off")) {
			// 위에서 갱신한 vipNum을 기반으로 for문을 돌린다.
			if (vipNum > 0) {
				System.out.println("현재 공원 내 VIP고객의 수는 " + vipNum + "명 입니다.");
				// 앞에 출력할 번호는 0부터가 아닌 1부터 나타낼거기에 i의 시작은 0이 아닌 1로 해주고
				// 그 대신 범위를 < 이 아닌 <= 로 설정한다.
				for (int i = 1; i <= vipNum; i++) {
					// 진짜 GPS는 못만드므로 공룡때와 동일하게 랜덤함수를 사용해서 동적으로 만든다.
					int ran = (int) (Math.floor(Math.random() * 5) + 1);
					String now = null;
					if (ran == 1) {
						now = "1동";
					} else if (ran == 2) {
						now = "2동";
					} else if (ran == 3) {
						now = "3동";
					} else if (ran == 4) {
						now = "4동";
					} else if (ran == 5) {
						now = "5동";
					}
					System.out.println("VIP " + i + "번째 손님은 현재 " + now + "에 있습니다.");

				}
			} else {
				System.out.println("현재 공원에 VIP고객이 존재하지 않습니다.");
				return;
			}
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}
}