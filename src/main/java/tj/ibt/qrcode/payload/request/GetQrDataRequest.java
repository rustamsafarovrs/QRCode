package tj.ibt.qrcode.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetQrDataRequest {
    private String qrId;
}
