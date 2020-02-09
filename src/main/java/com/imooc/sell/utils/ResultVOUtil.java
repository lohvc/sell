package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 20:46
 * \
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }
}
