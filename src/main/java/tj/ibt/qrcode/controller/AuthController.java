package tj.ibt.qrcode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tj.ibt.qrcode.payload.request.AuthRequest;
import tj.ibt.qrcode.payload.request.CheckSmsRequest;
import tj.ibt.qrcode.payload.response.MessageResponse;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthController {
    @PostMapping("/auth")
    public ResponseEntity<?> auth(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(new MessageResponse(200, "OK"));
    }

    @PostMapping("checkSms")
    public ResponseEntity<?> checkSms(@Valid @RequestBody CheckSmsRequest request) {
        if (request.getPhone().equals("908883344") && request.getOtp().equals("1234")) {
            return ResponseEntity.ok(new MessageResponse(200, "OK"));
        } else {
            return ResponseEntity.badRequest().body(new MessageResponse(401, "Authorization failed"));
        }
    }
}
