package cafe.BO;

import cafe.DAO.food_DAO;

public class food_service {
	
	private food_DAO fdao = new food_DAO();
	
	public void order_food(int seq) {
		// 음식 주문하면 실행되는 메서드
		// 주문 한 음식을 db와 비교하여 해당 음식의 조리시간, 금액 알러지 등등 정보 공개
		fdao.food_list();
	}
	
}
