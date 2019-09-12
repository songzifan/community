package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by Kiss on 2019/9/11 0011.
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
    private Long gmtCreate;
}
