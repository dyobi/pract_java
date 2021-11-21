package pkg;

import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {

		Date date = new Date();
		char [] day = {'일', '월', '화', '수', '목', '금', '토'};

		System.out.println(date.toString());
		System.out.println(date.toLocaleString());		//	------(deprecated) 현재는 사용하지만 앞으로는 권장하지 않습니다.
		System.out.println(date.getYear() + 1900 + "년");		//	연도의 기준점은 1900년도 이므로 실제 연도는 +1900
		System.out.println(date.getMonth() + 1 + "월");		//	Array index순서로 + 1 해야함
		System.out.println(date.getDate() + "일");
		System.out.println(day[date.getDay()] + "요일");		//	0일 1월 2화 3수 4목 5금 6토
		
		System.out.println(date.toGMTString());		//	존나 중요!! 영국런던의 그리니치 천문대 시간  --- DB기준
		
	}

}
