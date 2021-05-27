package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/5/18 17:39
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Base implements Serializable {
  private String id;
  private String name;
  private String bz;

}
