package tj.ibt.qrcode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    private Integer id;
    private String name;
    private String serialNumber;
}
