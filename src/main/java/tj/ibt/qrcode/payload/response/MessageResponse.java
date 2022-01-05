package tj.ibt.qrcode.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageResponse {
    private Integer result;
    private String msg;
}