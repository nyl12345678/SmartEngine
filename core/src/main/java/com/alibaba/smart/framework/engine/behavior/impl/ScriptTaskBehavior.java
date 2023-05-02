package com.alibaba.smart.framework.engine.behavior.impl;

import com.alibaba.smart.framework.engine.behavior.base.AbstractActivityBehavior;
import com.alibaba.smart.framework.engine.bpmn.assembly.script.Script;
import com.alibaba.smart.framework.engine.bpmn.assembly.task.ScriptTask;
import com.alibaba.smart.framework.engine.configuration.ProcessEngineConfiguration;
import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.extension.annoation.ExtensionBinding;
import com.alibaba.smart.framework.engine.extension.constant.ExtensionConstant;
import com.alibaba.smart.framework.engine.pvm.PvmActivity;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.ScriptEngine;

@ExtensionBinding(group = ExtensionConstant.ACTIVITY_BEHAVIOR, bindKey = ScriptTask.class)
/**
 * @author nyl.longChang 2023-05-02
 */
public class ScriptTaskBehavior extends AbstractActivityBehavior<ScriptTask> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScriptTaskBehavior.class);

    public ScriptTaskBehavior() {
        super();
    }

    @SneakyThrows
    @Override
    public void execute(ExecutionContext context, PvmActivity pvmActivity) {
        ProcessEngineConfiguration processEngineConfiguration = context.getProcessEngineConfiguration();
        ScriptEngine scriptEngine = processEngineConfiguration.getScriptEngine();
        ScriptTask scriptTask = (ScriptTask)pvmActivity.getModel();
        Script script = scriptTask.getScript();
        scriptEngine.eval(script.getScript());
        super.execute(context,pvmActivity);
    }
}
