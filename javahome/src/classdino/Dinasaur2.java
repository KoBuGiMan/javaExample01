package classdino;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Dino {
	String dinoList[][] = new String[][] { { "티라노", "벅벅이", "10살", "1동" } };
	String copyDinoList[][];
	String species;
	String name;
	String age;
	String area;

	public Dino() {
		copyDinoList2();
	}

	public void copyDinoList2() {

		copyDinoList = Arrays.copyOf(dinoList, dinoList.length);

	}
}

class Employee {
	String[][] employeeList = new String[][] { { "제이슨", "경비원", "10년" } };
	String[][] copyEmployeeList;
	String eName;
	String job;
	String years;

	public Employee() {
		employeeList2();

	}

	public void employeeList2() {
		copyEmployeeList = Arrays.copyOf(employeeList, employeeList.length);
	}

}

class Food {
	Dino dino = new Dino();

	String[][] foodList = new String[dino.copyDinoList.length][6];
	String[][] copyFoodList;
	String spe;
	String weight;
	String name;
	String value;
	String gram;
	String cost;

	public Food() {
		copyFoodList = Arrays.copyOf(foodList, foodList.length);
	}
}

class Park {
	int nowHour;
	int nowMin;
	String openClose;

	public Park() {
		nowHour = LocalDateTime.now().getHour();
		nowMin = LocalDateTime.now().getMinute();
		openClose = "close";
	}
}

class Ticket{
	LocalDate allDay;
	DateTimeFormatter year;
	DateTimeFormatter month;
	DateTimeFormatter day;
	String name;
	String price;
	
	public Ticket(){
		allDay = LocalDate.now();
		year = DateTimeFormatter.ofPattern("yyyy");
		month =DateTimeFormatter.ofPattern("MM");
		day = DateTimeFormatter.ofPattern("dd");;
		
	}
}
//---------------------------------------------------------------------------------------------------

public class Dinasaur2 {
	Scanner sc = new Scanner(System.in);
	Employee employee = new Employee();
	Dino dino = new Dino();
	Park park = new Park();
	Food food = new Food();
	Ticket ticket = new Ticket();

	public String[] setDino(String species, String name, String age, String area) {
		this.dino.species = species;
		this.dino.name = name;
		this.dino.age = age;
		this.dino.area = area;
		return new String[] { this.dino.species, this.dino.name, this.dino.age, this.dino.area };
	}

	public String[] getDino() {
		return new String[] { dino.species, dino.name, dino.age, dino.area };
	}

	public void dinoAll(Dino dino, Park park) {

		if (park.openClose.equals("open")) {
			System.out.println("현재시간: " + park.nowHour + "시" + park.nowMin + "분");
			System.out.println("현재 공원이 개장상태입니다.");
			System.out.println();

			System.out.println("공룡의 종을 입력해주세요:");
			String dSpe = sc.next();
			System.out.println("공룡의 이름을 입력해주세요:");
			String dName = sc.next();
			System.out.println("공룡의 나이를 입력해주세요:");
			String dAge = sc.next();
			System.out.println("공룡의 우리를 입력해주세요: ex) 1동, 2동...");
			String dArea = sc.next();
			setDino(dSpe, dName, dAge, dArea);
			if (dino.copyDinoList == null) {
				dino.copyDinoList2();
			}
			String[][] newArray = Arrays.copyOf(dino.copyDinoList, dino.copyDinoList.length + 1);
			newArray[newArray.length - 1] = getDino();
			dino.copyDinoList = newArray;
			System.out.println(Arrays.deepToString(dino.copyDinoList));

		} else if (park.openClose.equals("close")) {
			System.out.println("현재 공원이 폐장상태입니다.");
			System.out.println("공룡의 관리는 \"오픈\"상태일 때 가능합니다.");
			return;
		} else {
			System.out.println("error");
		}
	}

	public void removeDino(Dino dino, Park park) {
		System.out.println(Arrays.deepToString(dino.copyDinoList));
		String ans = "Fail";
		do {
			if (park.openClose.equals("open")) {
				System.out.println("현재시간: " + park.nowHour + "시" + park.nowMin + "분");
				System.out.println("현재 공원이 개장상태입니다.");
				System.out.println();
				System.out.println("삭제할 공룡의 종을 입력해주세요:");
				String removeSpe = sc.next();
				System.out.println("삭제할 공룡의 이름을 입력해주세요:");
				String removeName = sc.next();
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (removeSpe.equals(dino.copyDinoList[i][0])) {
						if (removeName.equals(dino.copyDinoList[i][1])) {
							dino.copyDinoList = remove(dino.copyDinoList, i);

							System.out.println(Arrays.deepToString(dino.copyDinoList));
							ans = "Success";
							System.out.println("제거되었습니다.");
						} else if (!removeName.equals(dino.copyDinoList[i][1])) {
							for (int j = i + 1; j < dino.copyDinoList.length; j++) {
								if (removeName.equals(dino.copyDinoList[j][1])) {
									dino.copyDinoList = remove(dino.copyDinoList, j);
									System.out.println(Arrays.deepToString(dino.copyDinoList));
									System.out.println("제거되었습니다.");
									return;
								} else {
									continue;
								}
							}

						} else {
							break;
						}
					}
				}
			} else if (park.openClose.equals("close")) {
				System.out.println("현재 공원이 폐장상태입니다.");
				System.out.println("공룡의 관리는 \"오픈\"상태일 때 가능합니다.");
				return;
			} else {
				System.out.println("error");
			}
		} while (!ans.equals("Success"));

		return;
	}

	private static String[][] remove(String[][] array, int index) {
		String[][] newArr = new String[array.length - 1][4];
		System.arraycopy(array, 0, newArr, 0, index);
		System.arraycopy(array, index + 1, newArr, index, array.length - index - 1);
		return newArr;
	}

//------------------------------------------------------------------------------------------------------------------

	public String[] setEmployee(String eName, String job, String years) {
		this.employee.eName = eName;
		this.employee.job = job;
		this.employee.years = years;

		return new String[] { eName, job, years };
	}

	public String[] getEmployee() {
		return new String[] { employee.eName, employee.job, employee.years };
	}

	public void employeeAll(Employee em, Park park) {
		if (park.openClose.equals("open")) {
			System.out.println("직원의 이름을 입력해주세요:");
			String eName = sc.next();
			System.out.println("직원의 직업을 입력해주세요:");
			String eJob = sc.next();
			System.out.println("직원의 경력을 입력해주세요:");
			String eYears = sc.next();
			setEmployee(eName, eJob, eYears);
			String[][] all = Arrays.copyOf(em.copyEmployeeList, em.copyEmployeeList.length + 1);
			all[all.length - 1] = getEmployee();
			em.copyEmployeeList = all;
			System.out.println(Arrays.deepToString(em.copyEmployeeList));
		} else if (park.openClose.equals("close")) {
			System.out.println("현재 공원이 폐장상태입니다.");
			System.out.println("직원 관리는 \"오픈\"상태일 때 가능합니다.");
			return;
		} else {
			System.out.println("error");
		}
	}

	private static String[][] remove2(String[][] array, int index) {
		String[][] newArr = new String[array.length - 1][3];
		System.arraycopy(array, 0, newArr, 0, index);
		System.arraycopy(array, index + 1, newArr, index, array.length - index - 1);
		return newArr;

	}

	public void removeEmployee(Employee em, Park park) {

		if (park.openClose.equals("open")) {
			System.out.println(Arrays.deepToString(em.copyEmployeeList));
			System.out.println("삭제할 직원의 이름을 입력해주세요:");
			String removeName = sc.next();
			for (int i = 0; i < em.copyEmployeeList.length; i++) {
				if (removeName.equals(em.copyEmployeeList[i][0])) {
					System.out.println("삭제할 직원의 직업을 입력해주세요:");
					String removeJob = sc.next();
					if (removeJob.equals(em.copyEmployeeList[i][1])) {
						em.copyEmployeeList = remove2(em.copyEmployeeList, i);
						System.out.println(Arrays.deepToString(em.copyEmployeeList));
						return;
					} else if (!removeJob.equals(em.copyEmployeeList[i][1])) {
						for (int j = i + 1; j < em.copyEmployeeList.length; j++) {
							em.copyEmployeeList = remove2(em.copyEmployeeList, j);
							System.out.println(Arrays.deepToString(em.copyEmployeeList));
							return;
						}
					} else {
						continue;
					}
				}
			}
		} else if (park.openClose.equals("close")) {
			System.out.println("현재 공원이 폐장상태입니다.");
			System.out.println("직원 관리는 \"오픈\"상태일 때 가능합니다.");
			return;
		} else {
			System.out.println("error");
		}
	}

	// ---------------------------------------------------------------------------------------------------

	public void openPark(Park park) {
		System.out.println("공원개방시간을 조회하시겠습니까?");
		String ans = sc.next();
		if (ans.equals("네")) {
			if (park.nowHour >= 7 && park.nowHour <= 22) {
				System.out.println("현재시간: " + park.nowHour + "시" + park.nowMin + "분");
				System.out.println("현재 공원 오픈시간입니다.");
				System.out.println("오픈하시겠습니까? (네/아니요)");
				String ans2 = sc.next();
				if (ans2.equals("네")) {
					System.out.println("공원이 개장되었습니다.");
					park.openClose = "open";
					System.out.println("현재상태: " + park.openClose);
				} else {
					System.out.println("공원이 폐장되었습니다.");
					park.openClose = "close";
					System.out.println("현재상태: " + park.openClose);
				}
			} else {
				System.out.println("현재시간: " + park.nowHour + "시" + park.nowMin + "분");
				System.out.println("현재 공원 폐장시간입니다.");
				System.out.println("폐장하시겠습니까 (네/아니요)");
				String ans3 = sc.next();
				if (ans3.equals("네")) {
					System.out.println("공원이 폐장되었습니다.");
					park.openClose = "close";
					System.out.println("현재상태: " + park.openClose);
				} else {
					System.out.println("공원이 개장되었습니다.");
					park.openClose = "open";
					System.out.println("현재상태: " + park.openClose);
				}
			}
		} else {
			System.out.println("종료합니다.");
			return;
		}

	}

	// ---------------------------------------------------------------------------------------------------

	public void Enclo(Dino dino, Park park) {

		if (park.openClose.equals("open")) {
			System.out.println("각 동별 공룡리스트 (1동 ~ 5동)");
			String ans = sc.next();
			if (ans.equals("1동")) {
				System.out.println("<<<<< 1동 리스트 >>>>>");
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (dino.copyDinoList[i][3].equals("1동")) {
						System.out.println(dino.copyDinoList[i]);
						continue;
					}
				}
			} else if (ans.equals("2동")) {
				System.out.println("<<<<< 2동 리스트 >>>>>");
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (dino.copyDinoList[i][3].equals("2동")) {
						System.out.println(dino.copyDinoList[i]);
						continue;
					}
					return;
				}
			} else if (ans.equals("3동")) {
				System.out.println("<<<<< 3동 리스트 >>>>>");
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (dino.copyDinoList[i][3].equals("3동")) {
						System.out.println(dino.copyDinoList[i]);
						continue;
					}
					return;
				}
			} else if (ans.equals("4동")) {
				System.out.println("<<<<< 4동 리스트 >>>>>");
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (dino.copyDinoList[i][3].equals("4동")) {
						System.out.println(dino.copyDinoList[i]);
						continue;
					}
					return;
				}
			} else if (ans.equals("5동")) {
				System.out.println("<<<<< 5동 리스트 >>>>>");
				for (int i = 0; i < dino.copyDinoList.length; i++) {
					if (dino.copyDinoList[i][3].equals("5동")) {
						System.out.println(dino.copyDinoList[i]);
						continue;
					}
				}
				return;
			} else {
				System.out.println("현재 저희 공원엔 " + ans + "은 존재하지 않습니다.");
			}

		}

	}

	// ---------------------------------------------------------------------------------------------------

	public void foodCheck(Park park, Dino dino, EatFood eat) {
		
	 	
		if (park.openClose.equals("open")) {
			System.out.println("공룡의 종을 입력해주세요:");
			String ans = sc.next();
			for (int i = 0; i < dino.copyDinoList.length; i++) {
				if (ans.equals(dino.copyDinoList[i][0])) {
					System.out.println("공룡의 이름을 입력해주세요:");
					String ans2 = sc.next();
					if (ans2.equals(dino.copyDinoList[i][1])) {
						System.out.println("<<<<< 선택한 공룡 >>>>>");
						System.out.println(dino.copyDinoList[i]);
						System.out.println();
						System.out.println("============================");
						System.out.println("공룡의 식성을 아래중에 골라주십시오");
						System.out.println("초식, 육식, 잡식");
						System.out.println("============================");
						String ans3 = sc.next();
						
						System.out.println("============================");
						System.out.println("공룡이 좋아하는을 음식을 입력해주세요:");
						System.out.println("============================");
						String ans4 = sc.next();
						
						System.out.println();
						System.out.println("============================");
						System.out.println("공룡의 몸무게를 입력해주세요");
						System.out.println("ex) 10,20,30...");
						System.out.println("============================");
						int ans5 = sc.nextInt();
						
						if (EatFood.HERBIVORE.getFood().equals(ans3)) {
							Double foodGram = (ans5 * 0.5);
							int foodCost = (int) (foodGram * 1000);
							String ans5s = String.valueOf(ans5);
							String foodGrams = String.valueOf(foodGram);
							String foodCosts = String.valueOf(foodCost);
							setFood(ans2, ans3, ans4, ans5s, foodGrams, foodCosts);
							String[][] newArr = new String[food.copyFoodList.length][6];
							newArr[newArr.length-1] = getFood();
							food.copyFoodList = newArr;
							System.out.println(food.copyFoodList);
							
						} else if (EatFood.CARNIVORE.getFood().equals(ans3)) {
							Double foodGram = (ans5 * 0.5);
							int foodCost = (int) (foodGram * 3000);
							String ans5s = String.valueOf(ans5);
							String foodGrams = String.valueOf(foodGram);
							String foodCosts = String.valueOf(foodCost);
							setFood(ans2, ans3, ans4, ans5s, foodGrams, foodCosts);
							String[][] newArr = new String[food.copyFoodList.length][6];
							newArr[newArr.length-1] = getFood();
							food.copyFoodList = newArr;
							System.out.println(food.copyFoodList);
							
						}else if(EatFood.OMNIVORE.getFood().equals(ans3)) {
							Double foodGram = (ans5 * 0.5);
							int foodCost = (int) (foodGram * 2000);
							String ans5s = String.valueOf(ans5);
							String foodGrams = String.valueOf(foodGram);
							String foodCosts = String.valueOf(foodCost);
							setFood(ans2, ans3, ans4, ans5s, foodGrams, foodCosts);
							String[][] newArr = new String[food.copyFoodList.length][6];
							newArr[newArr.length-1] = getFood();
							food.copyFoodList = newArr;
							System.out.println(food.copyFoodList);
						}else {
							System.out.println("해당 분류는 저희 공원에선 취급하고 있지 않습니다.");
						}


					}else if(!ans2.equals(dino.copyDinoList[i][1])) {
						continue;
					}else {
						System.out.println("현재 저희 공원에는 해당 종중 같은이름을 가진 공룡이 존재하지 않습니다.");
						return;
					}
				}else {
					System.out.println("현재 저희 공원에는 존재아지 않는 종입니다.");
				}
			}

		}
	}

	public String[] setFood(String spe, String name, String vore, String weight, String gram, String cost) {
		this.food.spe = spe;
		this.food.name = name;
		this.food.value = vore;
		this.food.weight = weight;
		this.food.gram = gram;
		this.food.cost = cost;
		return new String[] { this.food.spe, this.food.name, this.food.value, this.food.value, this.food.weight,
				this.food.gram, this.food.cost };
	}
	
	public String[] getFood() {
		return new String[] { food.spe, food.name, food.value, food.value, food.weight,
				food.gram, food.cost };
	}

	// ---------------------------------------------------------------------------------------------------
	public void setTicket() {
	
	
	// ---------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Dinasaur2 di = new Dinasaur2();
		Dino dino = new Dino();
		Employee em = new Employee();
		Park park = new Park();

		String an = "네";
		do {
			System.out.println("<<<<<<<<<< 메뉴 >>>>>>>>>>");
			System.out.println();
			System.out.println("1. 공원개장관리");
			System.out.println("2. 공룡추가");
			System.out.println("3. 공룡삭제");
			System.out.println("4. 직원추가");
			System.out.println("5. 직원삭제");
			System.out.println("0. 메뉴종료");
			System.out.println("번호를 입력해주세요:");
			int num = di.sc.nextInt();
			if (num == 1) {
				di.openPark(park);
			} else if (num == 2) {
				di.dinoAll(dino, park);
			} else if (num == 3) {
				di.removeDino(dino, park);
			} else if (num == 4) {
				di.employeeAll(em, park);
			} else if (num == 5) {
				di.removeEmployee(em, park);
			} else if (num == 0) {
				an = "아니요";
				System.out.println("메뉴를 종료합니다.");
			}
			System.out.println("메뉴를 재시작하겠습니까? (네/아니요)");
			an = di.sc.next();

		} while (an.equals("네"));
		return;

	}

}
