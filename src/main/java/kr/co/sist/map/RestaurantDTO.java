package kr.co.sist.map;

import java.sql.Date;

public class RestaurantDTO {

	private int rest_num; //식당 식별번호
	private String id, rest_name, menu, info; //회원아이디, 식당명, 메뉴, 정보
	private double lat, lng; //위도, 경도
	private Date input_date; //입력일
	
}
