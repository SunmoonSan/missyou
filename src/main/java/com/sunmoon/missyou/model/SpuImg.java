package com.sunmoon.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author San
 * @time 2021/11/10 07:56:52
 * @desc
 */
@Entity
@Getter
@Setter
public class SpuImg extends BaseEntity {
    @Id
    private Long id;
    private String img;
    private Long spuId;
}
