package vn.edu.fpt.forum.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.fpt.forum.dto.common.GeneralResponse;
import vn.edu.fpt.forum.dto.request.comment.AddCommentToAnswerRequest;
import vn.edu.fpt.forum.dto.request.comment.AddCommentToQuestionRequest;
import vn.edu.fpt.forum.dto.request.comment.UpdateCommentRequest;
import vn.edu.fpt.forum.dto.response.comment.AddCommentToAnswerResponse;
import vn.edu.fpt.forum.dto.response.comment.AddCommentToQuestionResponse;
import vn.edu.fpt.forum.dto.response.comment.UpdateCommentResponse;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 09/11/2022 - 08:26
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@RequestMapping("${app.application-context}/public/api/v1/comments")
public interface CommentController {

    @PutMapping("/{comment-id}")
    ResponseEntity<GeneralResponse<Object>> updateComment(@PathVariable(name = "comment-id") String commentId, @RequestBody UpdateCommentRequest request);

    @DeleteMapping("/{question-id}/{comment-id}")
    ResponseEntity<GeneralResponse<Object>> deleteCommentFromQuestion(@PathVariable(name = "question-id") String questionId, @PathVariable(name = "comment-id") String commentId);

}
