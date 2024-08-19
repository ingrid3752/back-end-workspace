package mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.kh.upload.model.vo.Board;
import com.kh.upload.model.vo.Paging;

// XML 토대로 mapping 후 service 추가 후 controller 추가
@Mapper
public interface BoardMapper {
	
	void insert(Board vo);
	List<Board> selectAll(Paging paging);
	Board select(int no);
	void update(Board vo);
	void delete(int no);
}