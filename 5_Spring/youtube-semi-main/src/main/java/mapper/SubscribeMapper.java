package mapper;

import org.apache.ibatis.annotations.Mapper;

import com.semi.youtube.model.vo.Subscribe;


// xml - Mapper - service - controller 순으로 일치
@Mapper
public interface SubscribeMapper {
	Subscribe check(Subscribe vo);
	int count(int code);
	void subs(Subscribe vo);
	void cancel(int code);
}
