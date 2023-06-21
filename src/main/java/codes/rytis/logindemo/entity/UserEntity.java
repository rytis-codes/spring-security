package codes.rytis.logindemo.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * This would be JPA managed entity or Mongo document, but for this example it's just a POJO
 */
@Getter
@Setter
public class UserEntity {
    private Long id;

    private String email;

    private String password;

    private String role;

    private String extraInfo;
}
