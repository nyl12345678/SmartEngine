package com.alibaba.smart.framework.engine.bpmn.assembly.script.parser;


import com.alibaba.smart.framework.engine.bpmn.assembly.script.Script;
import com.alibaba.smart.framework.engine.extension.annoation.ExtensionBinding;
import com.alibaba.smart.framework.engine.extension.constant.ExtensionConstant;
import com.alibaba.smart.framework.engine.xml.parser.AbstractElementParser;
import com.alibaba.smart.framework.engine.xml.parser.ParseContext;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * @author nyl.longChang 2023-05-02
 */
@ExtensionBinding(group = ExtensionConstant.ELEMENT_PARSER, bindKey = Script.class)
public class ScriptParser extends AbstractElementParser<Script> {

    @Override
    public Class<Script> getModelType() {
        return Script.class;
    }

    @Override
    public Script parseElement(XMLStreamReader reader, ParseContext context) throws XMLStreamException {
        Script script = new Script();
        script.setScript(reader.getElementText());
        return script;
    }
}
