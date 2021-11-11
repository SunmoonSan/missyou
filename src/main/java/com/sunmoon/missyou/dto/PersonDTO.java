package com.sunmoon.missyou.dto;

import com.sunmoon.missyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

/**
 * @author San
 * @time 2021/11/7 6:02 下午
 * @desc
 */

//@Data
@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
//@Builder
@PasswordEqual
public class PersonDTO {

    @NonNull
    @Length(min = 4, max = 10)
    private String name;
    private Integer age;

    private String password1;
    private String password2;
}
