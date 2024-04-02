package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")  //OderItem.item_id = Item.item_id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")   //OrderItem.oder_id = Oder.oder_id
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;     //주문가격

    private int count;          //수량

    private LocalDateTime regTime;

    private LocalDateTime updateTime;
}
