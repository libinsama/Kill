package com.debug.kill.server.dto;/**
 * Created by Administrator on 2019/6/17.
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/6/17 22:18
 **/
@Data
@ToString
@Getter
@Setter
public class KillDto implements Serializable{

    @NotNull
    private Integer killId;

    private Integer userId;
}