package com.example.springbootboard.repository;

import com.example.springbootboard.entity.Board;
import com.example.springbootboard.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // Board 삭제하면 댓글들 삭제
    @Modifying
    @Query("delete from Reply  r where r.board.bno = :bno")
    void deleteByBno(@Param("bno") Long bno);

    // 게시물로 댓글 목록 가져오기
    List<Reply> getRepliesByBoardOrderByRno(Board board);
}
