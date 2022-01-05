package tj.ibt.qrcode.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CheckSmsRequest {
    @NotBlank
    private String phone;

    @NotBlank
    private String otp;
}
