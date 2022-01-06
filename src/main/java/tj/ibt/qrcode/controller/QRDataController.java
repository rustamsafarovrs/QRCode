package tj.ibt.qrcode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tj.ibt.qrcode.model.Item;
import tj.ibt.qrcode.payload.request.GetQrDataRequest;
import tj.ibt.qrcode.payload.response.GetQrDataResponse;
import tj.ibt.qrcode.payload.response.MessageResponse;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class QRDataController {

    @PostMapping("/getQrData")
    public ResponseEntity<?> getQrData(@Valid @RequestBody GetQrDataRequest request) {
        String qrId = request.getQrId();
        if (qrId.equals("123456789")) {
            List<Item> items = new ArrayList<>();
            items.add(new Item(1, "Mac 2019", "fxas123s009"));
            items.add(new Item(2, "Моноблок HP", "h1as23drr"));
            items.add(new Item(3, "Телефон Yealink", "yl-1102"));
            items.add(new Item(4, "Мышка", "mkxlsa153"));
            return ResponseEntity.ok(new GetQrDataResponse(1, "Успешно", items));
        } else {
            return ResponseEntity.badRequest().body(new MessageResponse(4, "Данный qr не существует"));
        }
    }

}
