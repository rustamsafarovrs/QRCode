package tj.ibt.qrcode.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import tj.ibt.qrcode.model.Item;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetQrDataResponse {
    private Integer result;
    private String msg;
    private List<Item> Items;
}
