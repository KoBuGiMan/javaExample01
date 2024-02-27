package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeController2 {
	Scanner sc = new Scanner(System.in);
	List<List<String>> employeeList;
	
	public EmployeeController2() {
		
		employeeList = new ArrayList<>();
	}
	public void addEmployee() {
		int yesNo = 0;
		int count = 0;
		
		do {
			System.out.println("추가할 직원의 직업을 선택하세요:");
			System.out.println("1. 청소부");
			System.out.println("2. 경비원");
			System.out.println("3. 안전관리사");
			System.out.println("4. 공룡관리사"); 
			int ans = sc.nextInt();
			
			if(ans == 1) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("나이");
				String age = sc.next();
				System.out.println("경력:");
				String years = sc.next();
				sc.nextLine();
				System.out.println("작업내용:");
				String work = sc.nextLine();
				EmployeeDefault eCl = new Cleaner2(name, age, years, work);
				eCl.setJob("청소부");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.add(Arrays.asList(eCl.getJob(),name,age,years,work));
				setEmployeeList(newArr);
				System.out.println(getEmployeeList().get(count));
				count++;
			}else if(ans == 2) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("나이");
				String age = sc.next();
				System.out.println("경력:");
				String years = sc.next();
				sc.nextLine();
				System.out.println("작업내용:");
				String work = sc.nextLine();
				EmployeeDefault eGa  = new GJob(name,age,years,work);
				eGa.setJob("경비원");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.add(Arrays.asList(eGa.getJob(),name,age,years,work));
				setEmployeeList(newArr);
				System.out.println(getEmployeeList().get(count));
				count++;
			}else if(ans == 3) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("나이");
				String age = sc.next();
				System.out.println("경력:");
				String years = sc.next();
				sc.nextLine();
				System.out.println("작업내용:");
				String work = sc.nextLine();
				EmployeeDefault eSa = new Safety2(name, age, years, work);
				eSa.setJob("안전관리원");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.add(Arrays.asList(eSa.getJob(),name,age,years,work));
				setEmployeeList(newArr);
				System.out.println(getEmployeeList().get(count));
				count++;
			}else if(ans == 4) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("나이");
				String age = sc.next();
				System.out.println("경력:");
				String years = sc.next();
				sc.nextLine();
				System.out.println("작업내용:");
				String work = sc.nextLine();
				EmployeeDefault eZo = new ZooKeep2(name, age, years, work);
				eZo.setJob("공룡관리사");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.add(Arrays.asList(eZo.getJob(),name,age,years,work));
				setEmployeeList(newArr);
				System.out.println(getEmployeeList().get(count));
				count++;
			}else {
				System.out.println("error");
				return;
			}
		}while(yesNo == 1);
	}
	
	public void  removeEmp() {
		System.out.println("이름:");
		String name = sc.next();
		
		for(int i=0;i<getEmployeeList().size();i++) {
			if(getEmployeeList().get(i).get(1).equals(name)) {
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.remove(i);
				setEmployeeList(newArr);
				for(int j=0;j<getEmployeeList().size();j++) {
					System.out.println(getEmployeeList().get(j));
				}
			}else {
				System.out.println("입력하신 이름에 해당하는 직원은 존재하지 않습니다.");
			}
		}
	}
	
	public void editEmp() {
		System.out.println("이름:");
		String name = sc.next();
		for(int i=0;i<getEmployeeList().size();i++) {
			if(getEmployeeList().get(i).get(1).equals(name)) {
				System.out.println("직업을 입력해주세요:");
				String job = sc.next();
				System.out.println("이름을 입력해주세요:");
				String fixName = sc.next();
				System.out.println("나이를 입력해주세요:");
				String age = sc.next();
				System.out.println("경력을 입력해주세요:");
				String years = sc.next();
				sc.nextLine();
				System.out.println("업무를 입력해주세요:");
				String work = sc.nextLine();
				
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getEmployeeList());
				newArr.set(i, Arrays.asList(job,fixName,age,years,work));
				setEmployeeList(newArr);
				for(int j=0;j<getEmployeeList().size();j++) {
					System.out.println(getEmployeeList().get(j));
				}
				
				
			}else {
				System.out.println("해당 이름은 현재 존재하지않습니다.");
			}
		}
	}
	
	
	
	
	
	public List<List<String>> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<List<String>> employeeList) {
		this.employeeList = employeeList;
	}
	
}
