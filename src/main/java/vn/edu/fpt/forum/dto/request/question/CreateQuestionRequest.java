package vn.edu.fpt.forum.dto.request.question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 09/11/2022 - 09:48
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateQuestionRequest implements Serializable {

    private static final long serialVersionUID = 1130635315950896469L;
    private String title;
    private String problem;
    private String triedCase;
    private List<String> tag;
}
