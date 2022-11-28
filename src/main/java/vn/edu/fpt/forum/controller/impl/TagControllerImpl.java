package vn.edu.fpt.forum.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.fpt.forum.controller.TagController;
import vn.edu.fpt.forum.dto.common.GeneralResponse;
import vn.edu.fpt.forum.dto.common.PageableResponse;
import vn.edu.fpt.forum.dto.request.tag.CreateTagOwnerRequest;
import vn.edu.fpt.forum.dto.request.tag.UpdateTagOwnerRequest;
import vn.edu.fpt.forum.dto.response.tag.CreateTagOwnerResponse;
import vn.edu.fpt.forum.dto.response.tag.GetTagOwnerResponse;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 23/11/2022 - 20:35
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@RestController
@RequiredArgsConstructor
@Slf4j
public class TagControllerImpl implements TagController {

    @Override
    public ResponseEntity<GeneralResponse<CreateTagOwnerResponse>> createTagOwner(CreateTagOwnerRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> updateTagOwner(String tagId, UpdateTagOwnerRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<GeneralResponse<PageableResponse<GetTagOwnerResponse>>> getTagOwner() {
        return null;
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> deleteTagOwner(String tagId) {
        return null;
    }
}
