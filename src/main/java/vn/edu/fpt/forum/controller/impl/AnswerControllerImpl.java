package vn.edu.fpt.forum.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.fpt.forum.constant.ResponseStatusEnum;
import vn.edu.fpt.forum.controller.AnswerController;
import vn.edu.fpt.forum.dto.common.GeneralResponse;
import vn.edu.fpt.forum.dto.request.answer.VoteAnswerRequest;
import vn.edu.fpt.forum.dto.request.answer.UpdateAnswerRequest;
import vn.edu.fpt.forum.dto.request.comment.AddCommentToAnswerRequest;
import vn.edu.fpt.forum.dto.response.answer.GetAnswerResponse;
import vn.edu.fpt.forum.dto.response.answer.VoteAnswerResponse;
import vn.edu.fpt.forum.dto.response.comment.AddCommentToAnswerResponse;
import vn.edu.fpt.forum.factory.ResponseFactory;
import vn.edu.fpt.forum.service.AnswerService;
import vn.edu.fpt.forum.service.CommentService;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 23/11/2022 - 20:35
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@RestController
@Slf4j
@RequiredArgsConstructor
public class AnswerControllerImpl implements AnswerController {

    private final ResponseFactory responseFactory;
    private final AnswerService answerService;
    private final CommentService commentService;

    @Override
    public ResponseEntity<GeneralResponse<Object>> updateAnswer(String answerId, UpdateAnswerRequest request) {
        answerService.updateAnswer(answerId, request);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<AddCommentToAnswerResponse>> addCommentToAnswer(String answerId, AddCommentToAnswerRequest request) {
        return responseFactory.response(commentService.addCommentToAnswer(answerId, request));
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> deleteCommentFromAnswer(String answerId, String commentId) {
        commentService.deleteCommentFromAnswer(answerId, commentId);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> acceptAnswer(String questionId, String answerId) {
        answerService.acceptAnswer(questionId, answerId);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<VoteAnswerResponse>> voteAnswer(String answerId, VoteAnswerRequest request) {
        return responseFactory.response(answerService.voteAnswer(answerId, request), ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<GetAnswerResponse>> getAnswer(String answerId) {
        return responseFactory.response(answerService.getAnswerDetail(answerId));
    }
}
