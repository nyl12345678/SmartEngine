package com.alibaba.smart.framework.engine.bpmn.assembly.script;

import com.alibaba.smart.framework.engine.bpmn.constant.BpmnNameSpaceConstant;
import com.alibaba.smart.framework.engine.model.assembly.NoneIdBasedElement;
import lombok.Data;

import javax.xml.namespace.QName;

/**
 * @author nyl.longChang 2023-05-02
 */
@Data
public class Script implements NoneIdBasedElement {

    public final static QName qtype = new QName(BpmnNameSpaceConstant.NAME_SPACE, "script");

    private String script;
}
