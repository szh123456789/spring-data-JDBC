package com.example.spring_data_jdbc_demo.framework;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class IdEntity implements Serializable {

    private static final long serialVersionUID = -5703867176155301445L;

    @Id
    @TableId(type = IdType.AUTO)
    private Long id;
}