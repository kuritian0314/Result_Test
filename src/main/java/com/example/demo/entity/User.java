package com.example.demo.entity;

import lombok.Data;

/**
 * @author curry
 * @package com.example.demo.entity
 * @date 2022/2/21 22:41
 * @Version V1.0
 */
@Data
public class User {
    Long id;
    String name;
    Long age;
    String address;
}
