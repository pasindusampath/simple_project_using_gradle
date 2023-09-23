package lk.ijse.gdse.webapp_gradle.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUtil {
    int code;
    String message;
    Object data;
}
