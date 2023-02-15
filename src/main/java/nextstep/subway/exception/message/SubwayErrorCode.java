package nextstep.subway.exception.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SubwayErrorCode {

    NOT_FOUND_STATION("존재하지 않는 역입니다."),
    VALIDATE_SECTION_SAME_STATION("상행역과 하행역이 같은 구간은 생성할 수 없습니다."),
    CANNOT_DELETE_LAST_STATION("구간이 하나인 노선에서는 역을 제거할 수 없습니다."),
    SECTION_NOT_FOUND("구간이 존재하지 않습니다."),
    ONLY_LAST_SEGMENT_CAN_BE_REMOVED("마지막 구간만 제거할 수 있습니다.")
    ;

    private String message;
    private HttpStatus httpStatus;

    SubwayErrorCode(final String message) {
        this(message, HttpStatus.BAD_REQUEST);
    }
}
