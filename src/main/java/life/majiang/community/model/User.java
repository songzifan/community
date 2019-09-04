package life.majiang.community.model;

import lombok.Data;

/**
 * Created by Kiss on 2019/9/4 0004.
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
