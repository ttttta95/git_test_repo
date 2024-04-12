import com.boardcrud.entity.Board;
import com.boardcrud.entity.BoardListResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}