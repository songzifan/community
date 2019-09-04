package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by Kiss on 2019/9/3 0003.
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
