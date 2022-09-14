package com.example.spring_data_jdbc_demo.framework;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class IdTimeEntity extends IdEntity {

    @CreatedDate
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @LastModifiedDate
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime modifyTime;
}
