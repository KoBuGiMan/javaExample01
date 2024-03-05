package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Schedule {

	LocalTime eatMorningTime;
	LocalTime eatDinnerTime;
	LocalTime clean;
	LocalDateTime Danger;
	LocalDate safetyDay;
	List<String> scheduleList;

	public Schedule() {
		scheduleList = new ArrayList<>(Arrays.asList("", "", "", "",""));
	}

	// 일반 스케쥴 세팅
	public void setSchedule() {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		do {
			System.out.println();
			System.out.println("<<< 스케즐 세팅 >>>");
			System.out.println("1.아침식사시간");
			System.out.println("2.저녁식사시간");
			System.out.println("3.청소시간");
			System.out.println("4.비상훈련");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("'시' 를 입력해 주세요: ");
				int hour = sc.nextInt();
				System.out.print("'분' 을 입력해 주세요: ");
				int min = sc.nextInt();
				setEatMorningTime(hour, min);
				getScheduleList().set(0, timeString(getEatMorningTime()));
				System.out.println(getEatMorningTime());
				break;
			case 2:
				System.out.print("'시' 를 입력해 주세요: ");
				hour = sc.nextInt();
				System.out.print("'분' 을 입력해 주세요: ");
				min = sc.nextInt();
				setEatDinnerTime(hour, min);
				getScheduleList().set(1, timeString(getEatDinnerTime()));
				System.out.println(getEatDinnerTime());
				break;
			case 3:
				System.out.print("'시' 를 입력해 주세요: ");
				hour = sc.nextInt();
				System.out.print("'분' 을 입력해 주세요: ");
				min = sc.nextInt();
				setClean(hour, min);
				getScheduleList().set(2, timeString(getClean()));
				System.out.println(getClean());
				break;
			case 4:
				System.out.print("'년도' 를 입력해주세요: ");
				int year = sc.nextInt();
				System.out.print("'월' 을 입력해 주세요: ");
				int month = sc.nextInt();
				System.out.print("'일' 을 입력해 주세요: ");
				int day = sc.nextInt();
				System.out.print("'시' 를 입력해 주세요: ");
				hour = sc.nextInt();
				System.out.print("'분' 을 입력해 주세요: ");
				min = sc.nextInt();
				setDanger(year, month, day, hour, min);
				getScheduleList().set(3, dateTimeString(getDanger()));
				System.out.println(getDanger());
				break;
			default:
				break;
			}
			System.out.println("스케줄을 추가로 등록하시겠습니까? (1.yes/2.no)");
			ans = sc.nextInt();
		} while (ans == 1);
	}

	// 스케줄별 남은 날짜 계산
	public void scheduleCheck() {
		LocalTime nowT = LocalTime.now();
		LocalDateTime nowDT = LocalDateTime.now();
		DateTimeFormatter formet = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 / HH시 mm분");
		try {

			long morningTime = ChronoUnit.MINUTES.between(nowT, getEatMorningTime());
			long dinnerTime = ChronoUnit.MINUTES.between(nowT, getEatDinnerTime());
			long cleanTime = ChronoUnit.MINUTES.between(nowT, getClean());
			long dangerTime = ChronoUnit.DAYS.between(nowDT, getDanger());
			if (morningTime < 0) {
				morningTime = 1440 + morningTime;
			} else if (dinnerTime < 0) {
				dinnerTime = 1440 + dinnerTime;
			} else if (cleanTime < 0) {
				cleanTime = 1440 + cleanTime;
			}

			System.out.println("<<< 현재 날짜 및 시간 >>>");
			System.out.println(nowDT.format(formet));
			System.out.println("아침식사시간: " + getEatMorningTime().getHour() + "시" + getEatMorningTime().getMinute()
					+ "분 / 남은시간: " + (morningTime / 60) + "시간 " + (morningTime % 60) + "분");
			System.out.println("저녁식사시간: " + getEatDinnerTime().getHour() + "시" + getEatDinnerTime().getMinute()
					+ "분 / 남은시간: " + (dinnerTime / 60) + "시간 " + (dinnerTime % 60) + "분");
			System.out.println("청소시간: " + getClean().getHour() + "시" + getClean().getMinute() + "분 / 남은시간: "
					+ (cleanTime / 60) + "시간 " + (cleanTime % 60) + "분");

			if (dangerTime < 0) {
				System.out.println("(!) 비상훈련날짜가 지났습니다. 다시 설정해 주십시오");
				System.out.println("(!) 현재비상훈련: " + getDanger().getYear() + "년" + getDanger().getMonthValue() + "월"
						+ getDanger().getDayOfMonth() + "일 / " + getDanger().getHour() + "시" + getDanger().getMinute()
						+ "분");

			} else {
				System.out.println("비상훈련: " + getDanger().getYear() + "년" + getDanger().getMonthValue() + "월"
						+ getDanger().getDayOfMonth() + "일 / " + getDanger().getHour() + "시" + getDanger().getMinute()
						+ "분" + " / 남은기간: " + dangerTime + "일");
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("(!) 스케줄이 완전하지 않습니다. 모든 스케줄을 입력해주세요.");
			System.out.println("<<< 스케줄 현황 >>>");
			System.out.println("아침식사시간: " + getScheduleList().get(0));
			System.out.println("저녁식사시간: " + getScheduleList().get(1));
			System.out.println("청소시간: " + getScheduleList().get(2));
			System.out.println("비상훈련: " + getScheduleList().get(3));
		}
	}

	// 안전점검일 체크
	public void safetyDateCheck() {
		LocalDate nowDate = LocalDate.now();
		Calendar cal = Calendar.getInstance();
		DateFormat formet = new SimpleDateFormat("yyyyMMdd");
		try {
			Period dDay = Period.between(nowDate, getSafetyDay());

			if (dDay.withDays(0).equals(dDay)) {
				System.out.println();
				System.out.println("//////////////////////////");
				System.out.println("현재 날짜: " + nowDate.getYear() + "년/" + nowDate.getMonthValue() + "월/"
						+ nowDate.getDayOfMonth() + "일");
				System.out.println("안전점검일 입니다!!!");
				System.out.println("//////////////////////////");

				cal.set(getSafetyDay().getYear(), getSafetyDay().getMonthValue(), getSafetyDay().getDayOfMonth());

				cal.add(Calendar.DAY_OF_MONTH, 45);
				setSafetyDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
				System.out.println();
				System.out.println("다음 점검일: " + getSafetyDay().getYear() + "년/" + getSafetyDay().getMonthValue() + "월/"
						+ getSafetyDay().getDayOfMonth() + "일");
			} else {
				System.out.println();
				System.out.println("----------------------------------------");
				System.out.println("현재 날짜: " + nowDate.getYear() + "년/" + nowDate.getMonthValue() + "월/"
						+ nowDate.getDayOfMonth() + "일");
//			System.out.println("다음 점검일: " + getSafetyDay().getYear() + "년/" + getSafetyDay().getMonthValue() + "월/"
//					+ getSafetyDay().getDayOfMonth() + "일");
				long days = ChronoUnit.DAYS.between(nowDate, getSafetyDay());

				if (days < 0) {
					days = 366 + days;
					System.out.println("(!) 현재점검일: " + getSafetyDay().getYear() + "년/" + getSafetyDay().getMonthValue()
							+ "월/" + getSafetyDay().getDayOfMonth() + "일");
					System.out.println("(!) 안전점검일이 지났습니다. 다시 설정해 주십시오");
				} else {
					System.out.println("다음 점검일: " + getSafetyDay().getYear() + "년/" + getSafetyDay().getMonthValue()
							+ "월/" + getSafetyDay().getDayOfMonth() + "일");
					System.out.println("점검일까지 " + days + "일 남았습니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("(!) 현재 안전점검일이 설정되지 않았습니다. 안전점검일을 갱신해 주세요");
			System.out.println("안전점검일: " + getScheduleList().get(4));
		}
	}

	// 안전점검일 설정
	public void setSafetyDate() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.print("'년도' 를 입력해주세요: ");
		int yearSet = sc.nextInt();
		System.out.print("'월' 을 입력해 주세요: ");
		int monthSet = sc.nextInt();
		System.out.print("'일' 을 입력해 주세요: ");
		int daySet = sc.nextInt();
		cal.set(yearSet, monthSet, daySet);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		setSafetyDay(year, month, day);
		getScheduleList().set(4, dateString(getSafetyDay()));

	}

	// 모든 스케줄 출력
	public void scheduleAll() {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formet = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 / HH시 mm분");
		System.out.println();
		System.out.println("<<< 현재 날짜 및 시간 >>>");
		System.out.println(now.format(formet));
		System.out.println();
		System.out.println("아침식사시간: " + getScheduleList().get(0));
		System.out.println("저녁식사시간: " + getScheduleList().get(1));
		System.out.println("청소시간: " + getScheduleList().get(2));
		System.out.println("비상훈련: " + getScheduleList().get(3));
		System.out.println("안전점검일: " + getScheduleList().get(4));
	}

	public String timeString(LocalTime time) {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("hh:mm");
		String str = time.format(form);
		return str;
	}

	public String dateTimeString(LocalDateTime date) {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd / HH:mm");
		String str = date.format(form);
		return str;
	}

	public String dateString(LocalDate date) {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String str = date.format(form);
		return str;
	}

	public LocalTime getEatMorningTime() {
		return eatMorningTime;
	}

	public void setEatMorningTime(int hour, int minite) {
		this.eatMorningTime = LocalTime.of(hour, minite);
	}

	public LocalTime getClean() {
		return clean;
	}

	public void setClean(int hour, int minite) {
		this.clean = LocalTime.of(hour, minite);
	}

	public LocalDateTime getDanger() {
		return Danger;
	}

	public void setDanger(int year, int month, int day, int hour, int minite) {
		this.Danger = LocalDateTime.of(year, month, month, hour, minite);
	}

	public LocalTime getEatDinnerTime() {
		return eatDinnerTime;
	}

	public void setEatDinnerTime(int hour, int minite) {
		this.eatDinnerTime = LocalTime.of(hour, minite);
	}

	public LocalDate getSafetyDay() {
		return safetyDay;
	}

	public void setSafetyDay(int year, int month, int day) {
		this.safetyDay = LocalDate.of(year, month, day);
	}

	public List<String> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(List<String> scheduleList) {
		this.scheduleList = scheduleList;
	}

}