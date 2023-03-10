package com.example.springbootboard.service;

import com.example.springbootboard.dto.ReplyDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReplyServiceTest {
    @Autowired
    private ReplyService replyService;

    @Test
    public void testGetList(){
        Long bno = 100L;

        List<ReplyDTO> replyDTOList = replyService.getList(bno);

        replyDTOList.forEach(replyDTO -> System.out.println(replyDTO));
    }
}