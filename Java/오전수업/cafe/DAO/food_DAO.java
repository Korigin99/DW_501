package cafe.DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cafe.VO.food;

public class food_DAO extends base_DAO {

	public void food_list() {
		
		Map<Integer, food> food_map = new HashMap<>();
		
		String sql = "select * from food";

		try {

			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				food data = new food(rs.getInt("food_seq"),rs.getString("food_name"),
						rs.getInt("cost"),rs.getInt("cook_time"), rs.getInt("cal"),
						rs.getString("allergy"),rs.getInt("order_quantity"));
				
				food_map.put(data.getFood_seq(),data);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}




/*
 * Map
 * 
 * 
 */



