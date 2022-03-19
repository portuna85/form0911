package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST : 빠른 배송
 * NOMAL : 일반 배송
 * SLOW : 느린배송
 */
@Data
@AllArgsConstructor
public class DeliverCode {
    private String code;
    private String displayName;
}
