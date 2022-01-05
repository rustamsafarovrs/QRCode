package tj.ibt.qrcode.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class AuthRequest {
    @NotBlank
    private String phone;
}
