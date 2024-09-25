package mapper;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import com.kh.project.model.vo.Notepad;


@Mapper
public interface NotepadMapper {
	
	void insertNotepad(Notepad notepad);
	List<Notepad> getNotepadByMember(int memCode);
	
}
