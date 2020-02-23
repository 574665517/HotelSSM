package dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import entity.admin.Floor;

/**
 * ¥��dao
 */

@Repository
public interface FloorDao {
	public int add(Floor floor);
	public int edit(Floor floor);
	public int delete(Long id);
	public List<Floor> findList(Map<String, Object> queryMap);
	public List<Floor> findAll();
	public Integer getTotal(Map<String, Object> queryMap);
}
