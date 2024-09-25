package mapper;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import com.kh.project.model.vo.CalendarReservation;

@Mapper
public interface CalendarMapper {
	
    List<CalendarReservation> ReservationList(int memCode);
    void insertReservation(CalendarReservation vo);
    void deleteReservation(int reservationId);
}
